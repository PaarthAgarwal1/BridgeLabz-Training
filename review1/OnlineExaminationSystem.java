import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

class ExamTimeExpiredException extends Exception {
    public ExamTimeExpiredException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Question {
    String question;
    String answer;
    int score;

    Question(String question, String answer, int score) {
        this.question = question;
        this.answer = answer;
        this.score = score;
    }
}


class Exam {
    int examId;
    Student student;
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();
    int totalScore;
    String grade;

    Exam(int examId) {
        this.examId = examId;
    }
}


interface EvaluationStrategy {
    int calculateScore(ArrayList<Question> questions, ArrayList<String> answers);
}


class EvaluationImpl implements EvaluationStrategy {

    HashMap<Integer, Exam> exams = new HashMap<>();

    public void createExam(Exam exam) {
        exams.put(exam.examId, exam);
    }

    public void enrollStudent(int examId, Student student) {
        exams.get(examId).student = student;
    }

    public void addQuestion(int examId, Question q) {
        exams.get(examId).questions.add(q);
    }

    @Override
    public int calculateScore(ArrayList<Question> questions, ArrayList<String> answers) {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            if (i < answers.size() &&
                questions.get(i).answer.equalsIgnoreCase(answers.get(i))) {
                score += questions.get(i).score;
            }
        }
        return score;
    }

    public void evaluateExam(int examId) {
        Exam exam = exams.get(examId);
        exam.totalScore = calculateScore(exam.questions, exam.answers);

        if (exam.totalScore >= 80)
            exam.grade = "A";
        else if (exam.totalScore >= 50)
            exam.grade = "B";
        else
            exam.grade = "C";
    }
}


public class OnlineExaminationSystem {

    static final int EXAM_DURATION_SECONDS = 60; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EvaluationImpl evaluation = new EvaluationImpl();

        try {
            System.out.println("Welcome to Online Examination System");

            System.out.print("Enter Exam ID: ");
            int examId = sc.nextInt();
            sc.nextLine();

            Exam exam = new Exam(examId);
            evaluation.createExam(exam);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student ID: ");
            int studentId = sc.nextInt();
            sc.nextLine();

            Student student = new Student(name, studentId);
            evaluation.enrollStudent(examId, student);

   
            evaluation.addQuestion(examId, new Question("Java is OOP? (yes/no)", "yes", 10));
            evaluation.addQuestion(examId, new Question("2 + 2 = ?", "4", 10));

            System.out.println("Exam Started (Time limit: 60 seconds)");
            LocalTime start = LocalTime.now();

 
            for (Question q : exam.questions) {
                System.out.println(q.question);
                exam.answers.add(sc.nextLine());
            }

            LocalTime end = LocalTime.now();

            long timeTaken = Duration.between(start, end).getSeconds();

            if (timeTaken > EXAM_DURATION_SECONDS) {
                throw new ExamTimeExpiredException(
                        "Exam time expired! Time taken: " + timeTaken + " seconds");
            }

            evaluation.evaluateExam(examId);

            System.out.println("--- RESULT ---");
            System.out.println("Student Name : " + student.name);
            System.out.println("Score        : " + exam.totalScore);
            System.out.println("Grade        : " + exam.grade);
            System.out.println("Time Taken   : " + timeTaken + " seconds");

        } catch (ExamTimeExpiredException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
