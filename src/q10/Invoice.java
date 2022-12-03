package q10;


public class Invoice {
	
	private double amount;
	
	



	@Override
	public String toString() {
		return "Invoice [amount=" + amount + "]";
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int price) {
		this.amount = price * 0.18;
	}
	
	
	
	
	
	

}
