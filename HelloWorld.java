public class HelloWorld{
	
	int age;
	public static void main(String[] args){
		
		//	System.out.println("Hello World");
		
		/*
		int a;
		byte b;
		long c;
		float d;
		double e;
		boolean f;
		char g;
		
		a=2;
		b=1;
		c=241235123;
		d=3.3f;
		e=5.252343456;
		f=true;
		g='k';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		*/
		HelloWorld h1=new HelloWorld();           //��һ��HelloWorld: ����public class HelloWorld ��ʵ����һ������h1,�ڶ���HelloWorld���½�һ��HelloWorld����
		HelloWorld h2=new HelloWorld();
		//h1.smyAge();		                      //����ʵ������h1�ķ���smyAge
		h1.age=18;
		h2.age=22;
		h1.smyAge();
		h2.smyAge();
	}
	
	public void smyAge(){
		//int age=18;
		System.out.println(age);
	}
}