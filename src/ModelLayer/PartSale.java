package ModelLayer;

public class PartSale {
	
	private Sale Sale;
	private Product product;
	private int amount;
	
	public PartSale(ModelLayer.Sale sale, Product product, int amount) {
		super();
		Sale = sale;
		this.product = product;
		this.amount = amount;
	}
	
	public Sale getSale() {
		return Sale;
	}
	public void setSale(Sale sale) {
		Sale = sale;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
