import java.util.*;

public class student{

    Scanner input = new Scanner(System.in);
    String name;
    String gender;
    String course;
    
    public void captureDetailsDg() {
        System.out.println("Enter student name: ");
        name = input.nextLine();
        input.reset();

        System.out.println("Enter student gender");
        gender = input.nextLine();
        input.close();
        course = "Degree";
    }
  public void captureDetailsDp() {
        System.out.println("Enter student name: ");
        name = input.nextLine();
        input.reset();

        System.out.println("Enter student gender");
        gender = input.nextLine();
        input.close();
        course = "Diploma";
    }
    
    public void displayDetails() {
        System.out.println("===============================");
        System.out.println("Student name: "+ name +"\nStudent gender: "+ gender +"\nStudent course: "+ course);      
        System.out.println("===============================");  
    }
    
    
}
