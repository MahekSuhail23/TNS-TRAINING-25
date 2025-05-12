package trainingTns;

public class Person {
	//data members
			private String name,gender;
			private int income,age,tax;
			
			//generate getter and setters
	public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getGender() {
				return gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public int getIncome() {
				return income;
			}

			public void setIncome(int income) {
				this.income = income;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public int getTax() {
				return tax;
			}

			public void setTax(int tax) {
				this.tax = tax;
			}

			
			//object to string 
			//obj class method return string rep of person object
			
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", income=" + income + ", age=" + age + ", tax=" + tax
				+ "]";
	}

}
