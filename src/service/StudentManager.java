package service;

import model.Student;
import java.util.*;

public class StudentManager implements RecordActions {
    private Map<Integer, Student> studentMap;
    private List<Student> studentList;
    
    public StudentManager() {
        studentMap = new HashMap<>();
        studentList = new ArrayList<>();
    }
    
    @Override
    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getRollNo())) {
            System.out.println("Error: Student with Roll No " + student.getRollNo() + " already exists!");
            return;
        }
        studentMap.put(student.getRollNo(), student);
        studentList.add(student);
        System.out.println("Student added successfully!");
    }
    
    @Override
    public void deleteStudent(int rollNo) {
        Student student = studentMap.remove(rollNo);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student with Roll No " + rollNo + " deleted successfully!");
        } else {
            System.out.println("Student with Roll No " + rollNo + " not found!");
        }
    }
    
    @Override
    public void updateStudent(int rollNo, Student updatedStudent) {
        if (studentMap.containsKey(rollNo)) {
            studentMap.put(rollNo, updatedStudent);
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getRollNo() == rollNo) {
                    studentList.set(i, updatedStudent);
                    break;
                }
            }
            System.out.println("Student with Roll No " + rollNo + " updated successfully!");
        } else {
            System.out.println("Student with Roll No " + rollNo + " not found!");
        }
    }
    
    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }
    
    @Override
    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println();
        }
    }
    
    @Override
    public void sortStudents() {
        studentList.sort(Comparator.comparingInt(Student::getRollNo));
        System.out.println("Students sorted by Roll No.");
    }
}
