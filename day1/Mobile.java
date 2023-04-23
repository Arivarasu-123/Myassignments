package Week1.day1;

public class Mobile {
	public void makecall() {
		String mobilemodel="VIVO";
				float mobileweight=15.25f;
				System.out.println("ViVO");

	}
	public void sendmessage() {
	boolean fullcharged= true;
	int mobilecost= 50000;
	System.out.println("Fullycharged");

	}
	public static void main(String[] args) {
		Mobile features=new Mobile();
		features.makecall();
		features.sendmessage();
		System.out.println("This is my Mobile");
	}
	

}
