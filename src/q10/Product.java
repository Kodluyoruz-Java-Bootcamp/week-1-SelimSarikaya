package q10;

public class Product {
	
	private String category;
	private int price;
	private String productName;
	private int stock;
	
	
	
	@Override
	public String toString() {
		return "Product [category=" + category + ", price=" + price + ", productName=" + productName + ", stock="
				+ stock + "]";
	}

	public Product(String category, int price, String productName, int stock) {
		super();
		this.category = category;
		this.price = price;
		this.productName = productName;
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
