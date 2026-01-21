package org.example;
import java.io.*;
import java.util.*;

class Students {
    String id;
    String name;
    String age;
    String marks;
    String grade;

    Students(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}


public class MergeCSV {

    public static void main(String[] args) throws Exception {

        Map<String, Students> studentMap = new HashMap<>();

        // 1️⃣ Read students1.csv
        BufferedReader br1 = new BufferedReader(new FileReader("Data/student1.csv"));
        String line = br1.readLine(); // skip header

        while ((line = br1.readLine()) != null) {
            String[] data = line.split(",");
            Students student = new Students(data[0], data[1], data[2]);
            studentMap.put(data[0], student);
        }
        br1.close();

        // 2️⃣ Read students2.csv
        BufferedReader br2 = new BufferedReader(new FileReader("Data/student2.csv"));
        br2.readLine(); // skip header

        while ((line = br2.readLine()) != null) {
            String[] data = line.split(",");
            Students student = studentMap.get(data[0]);

            if (student != null) {
                student.marks = data[1];
                student.grade = data[2];
            }
        }
        br2.close();

        // 3️⃣ Write merged_students.csv
        BufferedWriter bw = new BufferedWriter(new FileWriter("Data/merged_students.csv"));
        bw.write("ID,Name,Age,Marks,Grade");
        bw.newLine();

        for (Students s : studentMap.values()) {
            bw.write(s.id + "," + s.name + "," + s.age + "," + s.marks + "," + s.grade);
            bw.newLine();
        }

        bw.close();

        System.out.println("✅ CSV files merged successfully!");
    }
}
