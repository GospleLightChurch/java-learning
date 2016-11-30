public class TestDog{
	TestDog(int a){
		System.out.println(a);
	}
	TestDog(String b){
		System.out.println(b);
	}
	public static void main(String[] ages){
		TestDog dog= new TestDog();
		TestDog(2);
		TestDog("bbb");
	}
}