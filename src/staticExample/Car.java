package staticExample;

public class Car implements Engin , Brake {

	


	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start the car");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop the car");

	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("acc the car");

	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("brake the car");

	}

}
