package q10;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private List<Order> orderList;
	private int age;
	private String name;
	private List<Product> products;
	
	
	
	@Override
	public String toString() {
		return "Customer [orderList=" + orderList + ", age=" + age + ", name=" + name + ", products=" + products + "]";
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public Customer() {
		super();
	}


	public Customer(String name, int age) {
		this.orderList = new ArrayList<>();
		this.name = name;
		this.age = age;
	}


	public List<Order> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	
	
	
}
