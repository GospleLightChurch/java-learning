public class RectangleCalculate{
	float longLength;
	float widthLength;
	public static void main(String[] args){
		RectangleCalculate rc = new RectangleCalculate();
		rc.longLength=5.5f;
		rc.widthLength=7.8f;
		rc.calculateArea();
		rc.caculatePerimeter();
	}
	public	void calculateArea(){
		double area;
		area=longLength*widthLength;
		System.out.println( "�����ε����Ϊ��" + area);
	}
	public void caculatePerimeter(){
		double perimeter;
		perimeter = (longLength+widthLength)*2;
		System.out.println( "�����ε��ܳ�Ϊ��" + perimeter );
	}
}