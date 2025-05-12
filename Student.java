package trainingTns;

public class Student extends hperson{
private String clas;
private float percent;

private Student()
{System.out.println("Student def const");
clas="FE";
percent=90;

}

public Student(String name, String city,String clas, float percent) {
	super(name,city);
	this.clas = clas;
	this.percent = percent;
}

public String getClas() {
	return clas;
}

public void setClas(String clas) {
	this.clas = clas;
}

public float getPercent() {
	return percent;
}

public void setPercent(float percent) {
	this.percent = percent;
}

@Override
public String toString() {
	return "Student [clas=" + clas + ", percent=" + percent + ", getClas()=" + getClas() + ", getPercent()="
			+ getPercent() + "]";
}






}
