package trainingTns;

public class TaxCalc {
//function to calculate tax
	public void calctax(Person person) {
		if (person.getAge()>65 || person.getGender().equalsIgnoreCase("Female")) {
			person.setTax(0);
			System.out.println("The tax is not applicable");
		}
		
		else {
		if(person.getIncome()<=200000) {person.setTax(0);}
		else if(person.getIncome()>200000 && person.getIncome()<=500000) {person.setTax((person.getIncome()-200000)*10/100);}
		else if(person.getIncome()>500000 && person.getIncome()<=800000) {person.setTax((person.getIncome()-500000)*20/100+30000);}
		else {
			person.setTax((person.getIncome()-800000)*30/100+90000);
		}
		
			
		}
		
		
		
	}

}
