public class Customer{
	private int customerId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String address;
	private String dob;
	private long phoneNo;

 //getter and setter
	public void setCustomerId(int customerId){
		this.customerId=customerId;
	}
	
	public int getCustomerId(){
		return customerId;
 }

	public void setName(String firstName){	
		this.firstName=firstName;
	}
	public String getName(){
		return firstName; 
	}
	
	public void setNames1(String middleName){
		this.middleName = middleName;
	}
	
	public String getNames1(){
		return middleName;
	}

	public void setNamess(String lastName){	
		this.lastName=lastName;
	}
	public String getNamess(){
		return lastName; 
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	
	public void setDOb(String dob){
		this.dob = dob;
	}
	public String getDob(){
		return dob;
	}
	
	public void setPhoneNo(long phoneNo){
		this.phoneNo = phoneNo;
	}
	public long getPhoneNo(){
		return phoneNo;
	}
	
 
 }
 //encapuslation where inorder to make the data safer we use the keyword private(which is used to protect the data from the outside world ) 
 //so that to access it we have another method that is setter and getter in this where we can use it .