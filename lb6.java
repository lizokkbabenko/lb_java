import java.util.ArrayList;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private double averageGrade;

    public Student(String firstName, String lastName, int studentId, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    // Додано методи для отримання імені та прізвища
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getStudentCount() {
        return students.size();
    }

    // Додано метод для отримання імені факультету
    public String getName() {
        return name;
    }

    // Додано метод для отримання списку студентів
    public List<Student> getStudents() {
        return students;
    }
}

class Institute {
    private String name;
    private List<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public int getTotalStudentCount() {
        int totalStudents = 0;
        for (Faculty faculty : faculties) {
            totalStudents += faculty.getStudentCount();
        }
        return totalStudents;
    }

    public Faculty findLargestFaculty() {
        Faculty largestFaculty = null;
        int maxStudentCount = 0;

        for (Faculty faculty : faculties) {
            int studentCount = faculty.getStudentCount();
            if (studentCount > maxStudentCount) {
                maxStudentCount = studentCount;
                largestFaculty = faculty;
            }
        }

        return largestFaculty;
    }

    public List<Student> getStudentsWithHighGrades(double minGrade, double maxGrade) {
        List<Student> highGradeStudents = new ArrayList<>();

        for (Faculty faculty : faculties) {
            for (Student student : faculty.getStudents()) {
                if (student.getAverageGrade() >= minGrade && student.getAverageGrade() <= maxGrade) {
                    highGradeStudents.add(student);
                }
            }
        }

        return highGradeStudents;
    }
}

public class lb6 {
    public static void main(String[] args) {
        // Створюємо інститут
        Institute institute = new Institute("Example Institute");

        // Створюємо факультети та додаємо їх до інституту
        Faculty faculty1 = new Faculty("Computer Science");
        Faculty faculty2 = new Faculty("Mathematics");

        institute.addFaculty(faculty1);
        institute.addFaculty(faculty2);

        // Додаємо студентів до факультетів
        faculty1.addStudent(new Student("John", "Doe", 1, 92.5));
        faculty1.addStudent(new Student("Jane", "Smith", 2, 98.0));
        faculty2.addStudent(new Student("Bob", "Johnson", 3, 89.5));
        faculty2.addStudent(new Student("Alice", "Williams", 4, 97.5));

        // Завдання 1: Знайти загальну кількість студентів
        int totalStudents = institute.getTotalStudentCount();
        System.out.println("Total Students: " + totalStudents);

        // Завдання 2: Знайти факультет з найбільшою кількістю студентів
        Faculty largestFaculty = institute.findLargestFaculty();
        System.out.println("Faculty with the most students: " + largestFaculty.getName());

        // Завдання 3: Скласти список студентів з високими балами
        List<Student> highGradeStudents = institute.getStudentsWithHighGrades(95.0, 100.0);
        System.out.println("Students with high grades: ");
        for (Student student : highGradeStudents) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}
