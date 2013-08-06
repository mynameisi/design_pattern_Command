import cdp.jsf.A;
import cdp.jsf.B;


public class Main_Wrong {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		//1. A:Кс
		a.b1();
		a.b2();
		a.b1();
		a.b1();	
		//2. B:зн
		b.b1();
		b.b2();
		b.b1();
		b.b2();
		b.b1();	
		//3. A:зн
		a.b2();
		a.b1();
		a.b2();				
	}
}
