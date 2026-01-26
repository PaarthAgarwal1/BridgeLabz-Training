package org.example;

import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject json1=new JSONObject();
        json1.put("name","Paarth Agarwal");
        json1.put("age",21);

        JSONObject json2=new JSONObject();
        json2.put("email","paarth@gmail.com");
        json2.put("skills",new String[]{"java","sql"});

        //Merge json2 into json1
        for(String key:json2.keySet()){
            json1.put(key,json2.get(key));
        }

        System.out.println(json1.toString(2));
    }
}
