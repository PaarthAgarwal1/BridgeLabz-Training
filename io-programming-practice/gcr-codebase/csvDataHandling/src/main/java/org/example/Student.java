package org.example;
import com.opencsv.bean.CsvBindByName;

public class Student{
    @CsvBindByName(column = "id")
    private int id;
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "age")
    private int age;
    @CsvBindByName(column = "marks")
    private int marks;

    public Student(){}

    @Override
    public String toString(){
        return "Student{"+"id="+id+", name='"+name+'\''+", age="+age+", marks="+marks+'}';
    }
}
