package q10;

import java.util.List;

public class Order {
	private Invoice invoice;
	private List<Product> products;
	
	
	
	@Override
	public String toString() {
		return "Order [invoice=" + invoice + "]";
	}



	public Order(Invoice invoice, List<Product> products) {
		this.invoice = invoice;
		this.products = products;
	}



	public Invoice getInvoice() {
		return invoice;
	}



	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}



	public List<Product> getProducts() {
		return products;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	
	
	
	
	
	
	
	
/*	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Order() {
		invoice = new Invoice();
		invoice.setAmount(0);
	}
	public Order(List<Product> shoppingCart) {
		invoice = new Invoice();
		this.invoice.setShoppingCart(shoppingCart);
		
//	public List<>
	
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	*/
	

}
