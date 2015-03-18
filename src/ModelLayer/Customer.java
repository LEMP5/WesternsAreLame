package ModelLayer;

public class Customer
{
	private String id;
	private String name;
	private String address;
	private String zipcode;
	private String city;
	private String phone;
	private String type;
	
	public Customer(String id, String name, String address, String zipcode,
			String city, String phone, String type) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.phone = phone;
		this.type = type;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
