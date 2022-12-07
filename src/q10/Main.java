package q10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<>();
		List<Order> orderList = new ArrayList<>();
		
		Customer selim = new Customer();
		selim.setName("Selim");
		selim.setAge(28);
		
		Customer cem = new Customer();
		cem.setName("Cem");
		cem.setAge(28);
		
		Customer beyza = new Customer();
		beyza.setName("Beyza");
		beyza.setAge(20);

		customerList.add(cem);
		customerList.add(selim);
		customerList.add(beyza);
	
		Product cola = new Product("Icecek", 10, "Cola", 10);
		Product telefon = new Product("Teknoloji", 1500, "Telefon", 10);
		Product canta = new Product("Aksesuar", 500, "Çanta", 20);
		
		Order selimOrder = new Order();
		selimOrder.addProduct(canta);
		selimOrder.addProduct(telefon);
		
		Order cemOrder = new Order();
		cemOrder.addProduct(cola);
		cemOrder.addProduct(telefon);
		cemOrder.addProduct(canta);
		
		Order beyzaOrder = new Order();
		beyzaOrder.addProduct(cola);
		
		orderList.add(selimOrder);
		orderList.add(cemOrder);
		orderList.add(beyzaOrder);
		

		
		selim.addOrder(selimOrder);
		cem.addOrder(cemOrder);
		beyza.addOrder(beyzaOrder);
		

		
		Invoice cemInvoice = new Invoice();
		cemInvoice.calculateInvoice(cemOrder);
	
		Invoice selimInvoice = new Invoice();
		selimInvoice.calculateInvoice(selimOrder);
		
		Invoice beyzaInvoice = new Invoice();
		beyzaInvoice.calculateInvoice(beyzaOrder);
		
		selim.setAmount(selimInvoice);
		cem.setAmount(cemInvoice);
		beyza.setAmount(beyzaInvoice);
		
		List<Invoice> invoiceList = new ArrayList<>();
		invoiceList.add(selimInvoice);
		invoiceList.add(cemInvoice);
		invoiceList.add(beyzaInvoice);
		
		
		System.out.println("Toplam musteri sayisi " +customerList.size());
		System.out.println("------------------");
		
		long howManyCem = customerList.stream().filter(cemName -> cemName.getName() == "Cem").count();
		System.out.println("Cem isminde musteri sayisi " +howManyCem);
		System.out.println("------------------");
		
		System.out.println("1500 TL uzerindeki faturalar");
		invoiceList.stream().filter(t -> t.getAmount() > 1500).forEach(System.out::println);

		System.out.println("------------------");
		for (Customer customer : customerList) {
		    if (customer.getName().equals("Cem") && (customer.getAge() < 30 || customer.getAge() > 25)) {
		    	System.out.println("Filtreden gecenlerin toplam alisveris tutari " + customer.getAmount());
		    }
		  }

	}
}

	
	

