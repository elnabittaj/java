package pro3;
import java.util.Scanner;
class Stud {
	String name;
	int rollno,m1,m2,m3,avg;
	Stud(String name,int rollno,int m1,int m2,int m3){
		this.name=name;
		this.rollno=rollno;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;	
	}
	public void calculateAvg() {
		avg = (m1+m2+m3)/3;
	}
		void displayDetails() {
			System.out.println("\n--- Student Details ---");
			System.out.println("Name: "+name);
			System.out.println("Roll Number: "+rollno);
			System.out.println("Mark for subject 1: "+m1);
			System.out.println("Mark for subject 2:"+m2);
			System.out.println("Mark for subject 3:"+m3);
			System.out.println("Average: "+avg);
	}
}
public class StudDemo {
	public static void main(String[] args) {
		int rollno;
		String name;
		int m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=sc.nextLine();
		System.out.print("Enter roll number: ");
		rollno=sc.nextInt();		
		System.out.print("Enter the mark of subject 1: ");
		m1=sc.nextInt();
		System.out.print("Enter the mark of subject 2: ");
		m2=sc.nextInt();
		System.out.print("Enter the mark of subject 3: ");
		m3=sc.nextInt();
		Stud s1= new Stud(name,rollno,m1,m2,m3);
		s1.calculateAvg();
		s1.displayDetails();
}
}


