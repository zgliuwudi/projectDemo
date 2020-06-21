package com.example.demo;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        int[] weights = new int[]{1,2,3,4,5,6,7,8,9,10};
        int D = 1;
        int i = shipWithinDays(weights, D);
        System.out.println(i);
    }

    public int shipWithinDays(int[] weights, int D) {
        // 总数
        int count = 0;
        for(int num : weights){
            count += num;
        }
        // 出现转载的次数
        int index = 0;
        // 每次装载的总数
        int everyCount = 0;
        T:for(int i=count/D;i<=count;i++){
            for(int num : weights){
                everyCount += num;
                if(everyCount==i){
                    ++index;
                    everyCount=0;
                }else if(everyCount>i){
                    // 这个装载不进去
                    ++index;
                    everyCount=num;
                }
                if(index>D){
                    index=0;
                    everyCount=0;
                    continue T;
                }
            }
            if(everyCount==0){
                if(index>D){
                    index=0;
                    everyCount=0;
                    continue;
                }
            }else{
                if(index+(everyCount/i+1)>D){
                    index=0;
                    everyCount=0;
                    continue;
                }
            }
            return i;
        }
        return 0;
    }

}
