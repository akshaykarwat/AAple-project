package constructor;

public class c1 {
	
	
	static int i=20;
	int j=20;
	public c1() {
		System.out.println(" i am ok");
	}
	public c1(int i) {
		System.out.println(" i am luck ok");
	}
	public c1(int i,boolean b) {
		this(20);
		System.out.println(" i am ok");
	}
	public c1(boolean b,int i) {
		this(10,true);
		System.out.println(" i am not ok");
	}
		public static void maa() {
			int k=100;
			System.out.println(c1.i);
			System.out.println("is op");
		}
		public void mai() {
			System.out.println("mia is also op");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 h= new c1(true,20);
	}

}
