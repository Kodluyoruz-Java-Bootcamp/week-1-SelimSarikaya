package q10;


// Maalesef tamamını yapamadım.


import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Namespace;

public class Main {
	
	 static ArrayList<Customer> CustomerList = new ArrayList<>();
	 
	public static void main(String[] args) {
		
		Customer selim = new Customer("Selim", 28);
		Customer cem = new Customer("Cem", 28);
		Customer beyza = new Customer("Beyza", 27);
		CustomerList.add(beyza);
		CustomerList.add(cem);
		CustomerList.add(selim);
	



		

		
		Product su = new Product("Icecek", 5, "Su", 50);
		Product telefon = new Product("Teknoloji", 1500, "Telefon", 10);
		Product canta = new Product("Aksesuar", 500, "Çanta", 20);

		selim.setProducts(List.of(su, telefon));
		cem.setProducts(List.of(canta, telefon));
		beyza.setProducts(List.of(su, canta));

		
		
		Order selims = new Order(null, selim.getProducts());
		selims.setInvoice(null);


		System.out.println(selim.getProducts());
		selim.getOrderList();
		
		
		cem.getOrderList();
	//	System.out.println(invoiceOfSelimInvoice);
		

     //       System.out.println(CustomerList.);


	}
}

	
	

