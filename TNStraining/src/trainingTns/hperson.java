package trainingTns;

public class hperson {
private String name;
private String city;


public hperson() {System.out.println("Person class default constructor");
name="Amit";
city="Pune";
}


public hperson(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "hperson [name=" + name + ", city=" + city + "]";
}



}
