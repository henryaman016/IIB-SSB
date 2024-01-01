package IIB01;

public class C {
	{
		System.out.println("from IIB");
	}
	
	C(){
		System.out.println("from constructor");
	}
	public static void main(String[] args) {
		C c1=new C();
		System.out.println("From Main");
	}
}
