package student_database;
import java.util.Scanner;
import java.util.ArrayList;

public class Student_management{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentDatabase sd = new StudentDatabase();
		
		while(true) {
			System.out.println("====Student Management System====");
			System.out.println("/n1.Add student");
			System.out.println("2.Remove student");
			System.out.println("3.Show all student");
			System.out.println("4.Search student");
			System.out.println("5.Update course of student");
			System.out.println("6.Exit");
			System.out.println("Enter choice:");
			
			int num = sc.nextInt();
			switch(num) {
			
			case 1:
				System.out.println("Enter ID:");
				int id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter Name:");
				String name = sc.nextLine();
				
				System.out.println("Enter Course:");
				String course = sc.nextLine();
				
				sd.addStudent(new Student(id,name,course));
				System.out.println("Student added successfully.");
				break;
			
			case 2:
				System.out.println("Enter id:");
				id = sc.nextInt();
				//Student s1 = sd.removeStudent(id);
				sd.removeStudent(id);
				System.out.println("Removed Student Successfully.");
				
			case 3:
				sd.showAllStudent();
				break;
			
			case 4:
				System.out.print("Enter  ID: ");
                id = sc.nextInt();
                Student s2 = sd.searchStudent(id);	
                break;
                
			case 5:
				System.out.print("Enter  ID: ");
                 id = sc.nextInt();
                 sc.nextLine();
                
                System.out.print("Enter  Course to update: ");
                course= sc.next();
                
                sd.updateCourse( id, course);
				break;
				
			case 6:
				System.out.println("Thank you.");
				break;
				
			default:
				System.out.println("Invalid choice.");
				
			}
		}
	}
}
