package polymorphism;

public class overloading {
	 static int i=10;
	 int j=10;
	public void m1() {
		System.out.println(" same method name different argumnebt");
	}
	public void m1( int i,char n) {
		System.out.println(" parent1");
	}
	public void m1( char n,int i) {
	
		System.out.println(" parent2");
	}
	
	public void m1( int n,int i,int b) {
		System.out.println(" parent3");
	}


	public static void m1( int i) {
		int s=50;
		System.out.println(" faloows method hiddding");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
