package constructor;

public class default1 extends c1 {
	public default1(int i) 
	{super(true,20);
		System.out.println(" i am ok");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		default1 L=new default1(20);
	
		System.out.println(c1.i);
		
		
		c1 o= new c1();
		System.out.println(o.j);
	}

}
