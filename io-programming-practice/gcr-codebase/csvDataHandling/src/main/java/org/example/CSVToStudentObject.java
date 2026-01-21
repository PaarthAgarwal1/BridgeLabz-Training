package org.example;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.util.List;

public class CSVToStudentObject {
    public static void main(String[] args) {
        String filePath="Data/students.csv";
        try(FileReader reader=new FileReader(filePath)){
            CsvToBean<Student> csvToBean=new CsvToBeanBuilder<Student>(reader).withType(Student.class).withIgnoreLeadingWhiteSpace(true).build();
            List<Student> students=csvToBean.parse();
            for(Student s:students){
                System.out.println(s);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
