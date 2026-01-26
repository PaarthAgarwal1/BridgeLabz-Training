package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {
    public static void main(String[] args) {
        // Create JSON Array for subjects
        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Computer Science");
        subjects.put("Physics");


        // Create Student JSON Object
        JSONObject student = new JSONObject();
        student.put("name","Paarth");
        student.put("age",21);
        student.put("subjects",subjects);



        // Print JSON Object
        System.out.println(student.toString());
    }
}
