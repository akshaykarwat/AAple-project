package inheritance;

public class parent {
	static int a=10;
	int i=10;
	
	public  void home() {
		int i=10;
		System.out.println(i);
		System.out.println(this.i);
		
		
		System.out.println(" dream home");
	}
	
	
	
	public static void wife() {
		int i=10;
		parent h=new parent();
		System.out.println(h.i);
		System.out.println(" dream wife");
	}
	
	public void mobile() {
		System.out.println(" dream phone ");
	}
	
	
	public static void car() {
		int a=10;
		System.out.println(parent.a);
		System.out.println(" dream car");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent f= new parent();
f.home();

	}

}
