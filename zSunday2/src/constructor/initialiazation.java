package constructor;

public class initialiazation {
	int marks;
	int subjects;
	static String name=" akshay";
	double percentage;
	char grade;
	
	
	public initialiazation(int marks, int subjects, double percentage, char grade) {
		super();
		this.marks = marks;
		this.subjects = subjects;
		this.percentage = percentage;
		this.grade = grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initialiazation h= new initialiazation(20,5,85,'a');
	System.out.println("name of student is"+name+"their mark"+20+"their %"+85+"grade"+'a');	
	}

}
