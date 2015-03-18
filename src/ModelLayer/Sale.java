package ModelLayer;

public class Sale {
	private Customer customer;
	private String buyingDate;
	private int price;
	private String deliveryStatus;
	private String payDate;
	private String id;
	
	
	public Sale(Customer customer, String buyingDate, int price,
			String deliveryStatus, String payDate, String id) {
		super();
		this.customer = customer;
		this.buyingDate = buyingDate;
		this.price = price;
		this.deliveryStatus = deliveryStatus;
		this.payDate = payDate;
		this.id = id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getBuyingDate() {
		return buyingDate;
	}
	public void setBuyingDate(String buyingDate) {
		this.buyingDate = buyingDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getId() {
		return id;
	}
	
}
