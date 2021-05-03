package constructor;

public class parent1 {
	
	 public static void m9() {
		 System.out.println("parent");
	 }
	child c1;
	public parent1() {
		 c1=new child();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent1 h= new parent1();
	}

}
