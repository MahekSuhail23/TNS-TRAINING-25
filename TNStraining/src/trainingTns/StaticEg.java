package trainingTns;

public class StaticEg {

	
		//mem mang/single copy storage/cant for outer class/stat<-stat only &non stat<-stat+non stat/mem at compiling /non stat mem alloc when'new ' used
	// pub and final modifiers for making const val/this/super/overloaded yes/overridden no coz  bounded with class not instance 
		
	
	
	private int srno;
	private static String clas;
	
	static {System.out.println("Stst block");
	//srno cant be accessed
	clas="BE";}
	
	
	StaticEg(){srno++;}
	
	
	static void disp() {System.out.println(clas);}


	@Override
	public String toString() {
		return "StaticEg [srno=" + srno + "]";
	}
		
		

}
