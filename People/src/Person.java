

public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public Person(String name, String address, String phoneNumber, String email) {
		
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;}
	
	public String getName() {
		return name;}
	
	public String getAddress() {
		return address;}
	
	public String getPhoneNumber() {
		return phoneNumber;}

	public String getEmail() {
		return email;}

	
	public void setAddress(String address) {
		this.address = address;}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;}

	
	public void setEmail(String email) {
		this.email = email;}

@Override
	public String toString() {
		return this.getClass().getName() + name;
		
	}

}

