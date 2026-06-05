class Student {
    int id;
    String name;
    String program;

    Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }
}

class Instructor {
    int id;
    String name;
    String department;
    String title;

    Instructor(int id, String name, String department, String title) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.title = title;
    }
}

class Course {
    int id;
    String syllabus;
    String title;
    String credits;
    String prerequisite;

    Course(int id, String syllabus, String title, String credits, String prerequisite) {
        this.id = id;
        this.syllabus = syllabus;
        this.title = title;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }
}

class CourseOffering {
    Student student;
    Instructor instructor;
    Course course;

    String time;
    int sectionNo;
    int roomId;
    int year;
    String semester;

    CourseOffering(Student student, Instructor instructor, Course course,
                   int sectionNo, int roomId, int year, String semester, String time) {
        this.student = student;
        this.instructor = instructor;
        this.course = course;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
        this.time = time;
    }

    void display() {
        System.out.println("Student: " + student.name);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Course: " + course.title);
        System.out.println("Semester: " + semester + " " + year);
        System.out.println("Section: " + sectionNo + ", Room: " + roomId);
        System.out.println("Time: " + time);
    }
}

public class CourseDetails {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Ariba", "SWE");

        Instructor i1 = new Instructor(131, "Ms. Sayma", "CSE", "Professor");
        Course c1 = new Course(51, "STL", "C Programming", "3", "Basic Programming");
        CourseOffering co1 = new CourseOffering(s1, i1, c1, 1, 305, 2026, "SP", "10:00 AM");

        co1.display();
    }
}
