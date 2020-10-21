
import java.util.ArrayList;
import java.util.Random;

class Student {

	public String studentNo;
	public String studentName;
	public String studentSurname;
	public Boolean studentActive;

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
		
	public String getStudentNo() {
		return this.studentNo;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
		
	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}
		
	public String getStudentSurname() {
		return this.studentSurname;
	}
	
	public void setStudentActive(Boolean studentActive) {
		this.studentActive = studentActive;
	}
	
	public Boolean getStudentActive() {
		return this.studentActive;
	}
	

}

public class lab02b {

	static int students_count = 10;

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		for(int i = 0; i < students_count; i++) {
			Student student = new Student();
			student.setStudentNo(getRandomStudentNumber());
			student.setStudentName(getRandomStudentName());
			student.setStudentSurname(getRandomStudentSurname());
			student.setStudentActive(getRandomStudentActive());
			students.add(student);
		}
		
		System.out.println("Students group have been filled.");
		
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentActive()==true) {
			System.out.print(student.getStudentSurname()+ " ");
			System.out.print(student.getStudentName() + " ");
			System.out.print(" ("+ student.getStudentNo() + ") ");
			System.out.println();
			}
		}
	}

	protected static String getRandomStudentNumber() {
		Random rand = new Random();
		return String.valueOf(rand.nextInt(2000) + 38000);
	}
	
	protected static String getRandomStudentName() {
		String[] Name = {"JACEK", "AGATA", "MICHA£", "MARCIN", "MA£GORZATA", "WITOLD", 
				"MAGDA", "SARA", "GRZEGORZ", "SZYMON"};
		Random rand = new Random();
		return Name[rand.nextInt(9)];
	}
	protected static String getRandomStudentSurname() {
		String[] Surname = {"Kowalski", "Grochalska", "Niedu¿y", "Samól",
				"Widmo", "Kaczka", "Nowak", "Krab",
				"Mosko", "Ryba"};
		
		Random rand = new Random();
		return Surname[rand.nextInt(9)];
	}
	
	protected static Boolean getRandomStudentActive() {
		
		Random rand = new Random();
		return rand.nextBoolean();
	}



}
