package trainingTns;

public class Intern extends hperson{
	private String position;
	private int id ;

	private Intern()
	{System.out.println("Intern def const");
	position="CEO";
	id=9;
	}

	public Intern(String name, String city,String position, int id) {
		super(name,city);
		this.position = position;
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Intern [position=" + position + ", id=" + id + ", getPosition()=" + getPosition() + ", getId()="
				+ getId() + "]";
	}
	
	
}
