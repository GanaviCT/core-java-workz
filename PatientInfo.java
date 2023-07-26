public class PatientInfo{
	//id, name, age, bloodgroup, gender, address, contactNo,
//	warno, attendername, diseaseName,consultant, hospitalname, fee

	private int id;
	private String name;
	private int age;
	private String bloodgroup;
	private String gender;
	private String address;
	private long contactNo;
	private int wardNo;
	private String attendername;
	private String diseaseName;
	private String consultant;
	private String hospitalName;
	private int fee;
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setBloodgroup(String bloodgroup){
		this.bloodgroup = bloodgroup;
	}
	public String getBloodgroup(){
		return bloodgroup;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	
	public void setContactNo(long contactNo){
		this.contactNo = contactNo;
	}
	public long getContactNo(){
		return contactNo;
	}
	
	public void setWardNo(int wardNo){
		this.wardNo = wardNo;
	}
	public int getWardNo(){
		return wardNo;
	}
	
	public void setAttenderName(String attendername){
		this.attendername = attendername;
	}
	public String getAttenderName(){
		return attendername;
	}
	
	public void setDiseaseName(String diseaseName){
		this.diseaseName = diseaseName;
	}
	public String getDiseaseName(){
		return diseaseName;
	}
	
	public void setconsultant(String consultant){
		this.consultant = consultant;
	}
	public String getconsultant(){
		return consultant;
	}
	
	public void setHospitalName(String hospitalName){
		this.hospitalName = hospitalName;
	}
	public String getHospitalName(){
		return hospitalName;
	}
	
	public void setFee(int fee){
		this.fee = fee;
	}
	public int getFee(){
		return fee;
	}

}