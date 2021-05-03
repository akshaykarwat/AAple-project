package polymorphism;

public class overriidng  extends  overloading{

	public void m1( int n,int i,int b) {
		System.out.println(super.j);
		System.out.println(super.i);
		System.out.println(" child33");
	}
	public static void m1( int i) {
		System.out.println(" same method name different argumnebt");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//overloading h=new overloading();
//h.m1();
//h.m1('d', 20);//only parent
//
//overriidng p=new overriidng();
//p.m1(20, 30, 40);
//p.m1(52, 's');//child

overloading  g=  new overriidng();
g.m1(20, 30, 40);
g.m1(20);
	}

}
