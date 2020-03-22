package com.example.demo.article;

import java.util.concurrent.*;

/**
 * @ClassName: ThreadPoolTest
 * @program: projectDemo
 * @Description: https://segmentfault.com/a/1190000021109130
 * @Author: admin
 * @Date: 2020-03-18 22:29
 * @Version: 1.0
 **/
public class ThreadPoolTest {
    /**
     * 虽然GC只会回收不可达GC ROOT的对象，但是在编译器（没有明确指出，也可能是JIT）/代码生成器的优化下，可能会出现对象提前置null，
     * 或者线程切换导致的“提前对象不可达”的情况。
     *
     * 所以如果想在finalize方法里做些事情的话，一定在最后显示的引用一下对象（toString/hashcode都可以），保持对象的可达性（reachable）
     * @param args
     */
    public static void main(String[] args) {
        final ThreadPoolTest threadPoolTest = new ThreadPoolTest();
        for (int i = 0; i < 8; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {

                        Future<String> future = threadPoolTest.submit();
                        try {
                            String s = future.get();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        } catch (Error e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }

        //子线程不停gc，模拟偶发的gc
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.gc();
                }
            }
        }).start();
    }

    /**
     * 异步执行任务
     * @return
     */
    public Future<String> submit() {
        //关键点，通过Executors.newSingleThreadExecutor创建一个单线程的线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FutureTask<String> futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                Thread.sleep(50);
                return System.currentTimeMillis() + "";
            }
        });
        executorService.execute(futureTask);
        return futureTask;
    }
}
