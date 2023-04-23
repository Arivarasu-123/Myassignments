package Week1.day1;

public class Student {
	String Studentename="Arivarasu";
	long Rollno=20418419;
	String Collegename="Loyola College";
	int Markscored=80;
	char CGPA='A';
	
	public void studentname() {
		System.out.println("Arivarasu");

	}
public void Rollno() {
	System.out.println("20418419");

}
public void collegename() {
	System.out.println("Loyola College");

}
public void Markscored() {
	System.out.println("80");

}
public void CGPA() {
	System.out.println("A");

}
public static void main(String[] args) {
	Student report=new Student();
	report.studentname();
	report.Rollno();
	report.collegename();
	report.Markscored();
	report.CGPA();
	
}
	}




