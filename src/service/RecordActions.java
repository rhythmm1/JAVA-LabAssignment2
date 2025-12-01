package service;

import model.Student;
import java.util.List;

public interface RecordActions {
    void addStudent(Student student);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, Student updatedStudent);
    Student searchStudent(int rollNo);
    void viewAllStudents();
    void sortStudents();
}
