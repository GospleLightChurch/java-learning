public class work14{
	double width;
	double height;
	double area;  
	double perimeter;
	public static void main(String[] arge){
		work14 h1 = new work14();
		work14 h2 = new work14();
		h1.width = 2.9;
		h1.height = 7.6;
		h2.width = 5.8;
		h2.height = 7.8;
		h1.getarea();
		h1.getperimeter();
		h2.getarea();
		h2.getperimeter();
	}
	public void getarea(){
		area = width * height;
		System.out.println("面积："+area);
	}
	public void getperimeter(){
		perimeter = 2*(width + height);
		System.out.println("周长："+perimeter);
	}
}