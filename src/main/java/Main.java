import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Ramesh");
        studentDao.saveStudent(student);

    }
}
