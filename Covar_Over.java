package trainingTns;
class Color{
	protected Color getcolor() 
	{
		Color s= new Color();
			return s;
	}//return is obj of color s is ref due to s it will return color obj
}
class Red extends Color{
	protected Red getcolor() {
	Red s=new Red();
	return  s;
}
}
public class Covar_Over {
public static void main (String args[]) {
	Color c=new Color();
	System.out.println(c.getcolor());
	Red c1=new Red();
	System.out.println(c1.getcolor());
}
}
