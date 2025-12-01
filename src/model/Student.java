package model;

public final class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private String grade;
    private String researchArea;
    
    public Student(int rollNo, String name, String email, String course) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
    }
    
    public Student(int rollNo, String name, String email, String course, String researchArea) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.researchArea = researchArea;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }
    
    // Method overloading
    public final void displayInfo(boolean showDetails) {
        System.out.println("[Note] Overloaded display method:");
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        if (showDetails) {
            System.out.println("This is a final method in a final class.");
        }
    }
    
    @Override
    protected void finalize() {
        System.out.println("Finalize method called before object is garbage collected");
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public double getMarks() {
        return marks;
    }
    
    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String getResearchArea() {
        return researchArea;
    }
    
    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
}
