package trainingTns;

public class OverRideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI_over1 rbi;
		rbi=new RBI_over1();
		System.out.println(rbi.getInterest());
		rbi=new SBI_over2();
		System.out.println(rbi.getInterest());
	}

}
