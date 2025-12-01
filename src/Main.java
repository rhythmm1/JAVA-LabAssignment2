import model.Student;
import service.StudentManager;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: StudentManager reference to RecordActions interface
        StudentManager manager = new StudentManager();
        
        // Create students - demonstrating constructor overloading
        Student student1 = new Student(101, "Abhinav", "abhinav@mail.com", "B.Tech");
        Student student2 = new Student(102, "ishi", "ishi@mail.com", "M.Tech", "AI");
        
        // Add students
        manager.addStudent(student1);
        manager.addStudent(student2);
        
        // View all students - demonstrating method overriding
        manager.viewAllStudents();
        
        // Demonstrate method overloading
        student1.displayInfo(true);
        
        // Demonstrate duplicate prevention
        System.out.println("\nAttempting to add duplicate student:");
        Student duplicate = new Student(101, "Test", "test@mail.com", "B.Sc");
        manager.addStudent(duplicate);
        
        // Search student
        System.out.println("\nSearching for student with Roll No 102:");
        Student found = manager.searchStudent(102);
        if (found != null) {
            found.displayInfo();
        }
        
        // Sort students
        System.out.println("\nSorting students...");
        manager.sortStudents();
        
        // Trigger garbage collection to demonstrate finalize
        student1 = null;
        System.gc();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
