
package OOP;


public class GetterSetter {
    public static void main(String[]args){
        person myobj=new person();
        

        //setting the values
        myobj.setName("Pranita");
        myobj.setCity("Sangli");
        myobj.setAge(21);


        // getting the values and printing those value
        System.out.println(myobj.getName());
        System.out.println(myobj.getCity());
        System.out.println(myobj.getAge());

// ***************************************************************************************

        //examplp-1
        cylinder cyli = new cylinder();
        cyli.setRadius(5);
        cyli.setheight(100);

        System.out.println("The Radius of cylinder is : "+cyli.getRadius());
        System.out.println("The Height of cylinder is : "+cyli.getHeight());
        System.out.println("Area of cylinder is : "+cyli.cylinder_area());
        System.out.println("Volume of cylinder is : "+cyli.vol_cylinder());


        
        
    }
    
}

class person{
    private String name,city;
    private int age;
    
    public String getName(){
        return name;
    }

    public void setName(String n)
    {
        this.name=n;

    }

    public String getCity(){
        return city;
    }

    public void setCity(String c)
    {
        this.city=c;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int ag)
    {
        this.age=ag;
    }
}

//Example-1
class cylinder{
    private int radius;
    private int height;
    double area;
    double volume;

    public int getRadius(){
        return radius;

    }

    public void setRadius(int r){
        this.radius=r;

    }

    public int getHeight(){
        return height;

    }

    public void setheight(int ht){
        this.height=ht;

    }

    public double cylinder_area(){
        area =2*  Math.PI * radius * (height + radius);
        return area;
    }

    public double vol_cylinder(){
        volume=Math.PI * radius * radius * height;
        return volume;

    }

}
