package com.example.demo.map;

import com.google.gson.Gson;

import java.util.*;

/**
 * @ClassName: MapTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-22 23:01
 * @Version: 1.0
 **/
public class MapTest {


    public static void main(String[] args) {
        // map to list
        Map<String, String> strMap = getStrMap();
        List<String> keyList = new ArrayList<>(strMap.keySet());
        System.out.println(Arrays.toString(keyList.toArray()));
        List<String> valueList = new ArrayList<>(strMap.values());
        System.out.println(Arrays.toString(valueList.toArray()));
        ArrayList<Map.Entry<String, String>> entries = new ArrayList<>(strMap.entrySet());
        System.out.println(Arrays.toString(entries.toArray()));

        // entry every data
        Set<Map.Entry<String, String>> entries1 = strMap.entrySet();
        for (Map.Entry entry : entries1) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        // sort by key or value
        ArrayList<Map.Entry<String, String>> entries2 = new ArrayList<>(strMap.entrySet());
        Collections.sort(entries2,(Map.Entry e1, Map.Entry e2) -> {
            return e2.getValue().toString().compareTo(e1.getValue().toString());
        });
        System.out.println(entries2);

        // init not modify map 初始化一个不可修改的map对象
        Map<String, String> stringStringMap = Collections.unmodifiableMap(strMap);
        System.out.println(stringStringMap);
        try {
            stringStringMap.put("f","6");
            System.out.println(stringStringMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // clone map 深度克隆
        Gson gson = new Gson();
        String mapJson = gson.toJson(strMap);
        Map cloneMap = gson.fromJson(mapJson, Map.class);
        System.out.println(cloneMap);
        cloneMap.put("f","6");
        System.out.println("old map="+strMap);
        System.out.println("new map="+cloneMap);

    }

    public static Map<String,String> getStrMap(){
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "5");
        return map;
    }
}
