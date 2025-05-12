package trainingTns;

public class OOP1 {
private int srno;
private String name;
private int age;
public int getSrno() {
	return srno;
}
public void setSrno(int srno) {
	this.srno = srno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



//tostring
@Override
public String toString() {
	return "OOP1 [srno=" + srno + ", name=" + name + ", age=" + age + "]";
}

}
