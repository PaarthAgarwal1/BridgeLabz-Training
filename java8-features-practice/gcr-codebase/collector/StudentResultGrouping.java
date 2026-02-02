import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentResultGrouping {
    public static void main(String[] args) {

        List<Student> students=Arrays.asList(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Eva", "B")
        );

        // Group students by grade and collect names
        Map<String, List<String>> groupedByGrade=students.stream().collect(Collectors.groupingBy(s -> s.grade,Collectors.mapping(s -> s.name, Collectors.toList())));

        groupedByGrade.forEach((grade, names) ->System.out.println("Grade " + grade + " : " + names));
    }
}
