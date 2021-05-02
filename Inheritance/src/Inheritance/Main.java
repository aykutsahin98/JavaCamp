package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer aykut = new IndividualCustomer(); //Bireysel M��teri Olu�turuyoruz.
		aykut.customerNumber = "123456";
		
		CorporateCustomer teknosa = new CorporateCustomer(); //Ticari M��teri
		teknosa.customerNumber = "6789";
		
		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "9999";
		
		/*CustomerManager customerManager = new CustomerManager();
		customerManager.add(teknosa);
		customerManager.add(aykut);
		customerManager.add(abc);*/ 
		
		// ALTERNATIF YONTEM
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer [] customers  = {aykut, abc, teknosa};
		
		customerManager.addMultiple(customers);
		
		
	}

}
