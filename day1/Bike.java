package Week1.day1;

public class Bike {
public void applybreak() {
	System.out.println("Applied break");

}
public void soundhorn() {
	System.out.println("Sound horn");

}
	public static void main(String[] args) {
		Car small =new Car();
		Bike feature=new Bike();
		small.applybreak();
		small.soundhorn();
		feature.applybreak();
		feature.soundhorn();
	
	}
}
