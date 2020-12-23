// Example for PPT page No.19
import java.util.Scanner;

public class Course
{
	/** Properties with course number, name, and participants */
	int number;
	String name;
	int numberOfParticipants;
	Student[] participants;
	
	public static void main(String[] args)
	{
		// Create Scanner object
		Scanner input=new Scanner(System.in);
		
		// Create course object
		Course course=new Course(321022, "Programming in Java", 20);

		// Create student objects and add them into the course, which data file students.txt
		int numberOfStudent=input.nextInt();
		
		for (int i=0;i<numberOfStudent;i++)
		{
			String name=input.next();
			String majorIn=input.next();
			char gender=input.next().charAt(0);
			
			Student st=new Student(name,majorIn,gender);
			
			course.addParticipant(st);
		}

		// Display the course information
		course.displayCourse();
		
		// Delete student 3 and 1
		course.deleteParticipant(3);
		course.displayCourse();
		
		course.deleteParticipant(1);
		course.displayCourse();
	}
	
	/** Constructors */
	Course()
	{
	}
	
	Course(int number, String name, int numberOfParticipants)
	{
		this.number=number;
		this.name=name;
		this.numberOfParticipants=0;
		this.participants=new Student[numberOfParticipants];
	}
	
	/** Method for course */
	// Add a participant in the course
	public void addParticipant(Student newParticipant)
	{
		participants[numberOfParticipants]=newParticipant;
		numberOfParticipants++;
	}
	
	// Delete the participant which index is given
	public void deleteParticipant(int index)
	{
		for(int i=index;i<numberOfParticipants-1;i++)
		{
			participants[i]=participants[i+1];
		}
		participants[numberOfParticipants]=null;
		
		numberOfParticipants--;
	}

	// Display the course information
	public void displayCourse()
	{
		System.out.println("-------------------");
		System.out.println("The course number is: "+number);
		System.out.println("Name of the Course is: "+name);
		System.out.println("The participates are:");
		
		for(int i=0;i<numberOfParticipants;i++)
		{
			System.out.println(participants[i].name+" "+participants[i].majorIn+" "+participants[i].gender);
		}
	}
}