public class Car{
	double speed;
	public void start(){
		speed = 100;
		System.out.println("��ʼ�ٶȣ�"+speed);
	}
	public void stop(){
		speed = speed-speed;
		System.out.println("ֹͣ�ٶȣ�"+speed);
	}
	public void speedUp(){
		speed =speed + 10;
		System.out.println("���٣�"+speed);
	}
	public void speedDown(){
		speed =speed - 10;
		System.out.println("���٣�"+speed);
	}
	public static void main(String[] arge){
		Car a = new Car();
		a.start();
		a.speedUp();
		a.speedDown();
		a.stop();
		a.speedUp();
		a.speedUp();
		a.speedUp();
		a.speedUp();
		a.speedDown();
		a.speedDown();
		a.speedDown();
		a.speedDown();
	}
}