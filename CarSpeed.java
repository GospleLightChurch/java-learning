public class CarSpeed{
	double speed = 0;
	
	public static void main(String[] args){
		CarSpeed cs = new CarSpeed();
		cs.carStart();					//Output start speed
		cs.carSpeedUp();				//SpeedUp first
		cs.carSpeedUp();				//SpeedUp second
		cs.carSpeedUp();				//SpeedUp third
		cs.carSpeedUp();				//SpeedUp fourth
		cs.carSpeedDown();				//SpeedDown first
		cs.carSpeedDown();				//SpeedDown second
		cs.carStop();					//Output stop speed
	}
	public void carStart(){
		speed = 100 ;
		System.out.println("start speed is " + speed);
	}
	public void carStop(){
		System.out.println("stop speed is 0");
	}
	public void carSpeedUp(){
		speed = speed + 10;
		System.out.println("speedUp is " + speed );
	}
	public void carSpeedDown(){
		speed = speed - 10;
		System.out.println("speedDown is " + speed );
	}
}