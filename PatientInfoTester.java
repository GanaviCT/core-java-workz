public class PatientInfoTester{
	public static void main(String test[]){

	PatientInfo details=new PatientInfo();
	
	details.setId(1);
	System.out.println(details.getId());
	
	details.setName("xyz");
	System.out.println(details.getName());
	
	details.setAge(20);
	System.out.println(details.getAge());
	
	details.setBloodgroup("o+ve");
	System.out.println(details.getBloodgroup());
	
	details.setGender("male");
	System.out.println(details.getGender());
	
	details.setAddress("mysore");
	System.out.println(details.getAddress());
	
	details.setContactNo(1234567890);
	System.out.println(details.getContactNo());
	
	details.setWardNo(78);
	System.out.println(details.getWardNo());
	
	details.setAttenderName("wer");
	System.out.println(details.getAttenderName());
	
	details.setDiseaseName("corona virus");
	System.out.println(details.getDiseaseName());
	
	details.setconsultant("veronika");
	System.out.println(details.getconsultant());
	
	details.setHospitalName("veronika");
	System.out.println(details.getHospitalName());
	
	details.setFee(20000);
	System.out.println(details.getFee());
	
	

}
}