 public class CustomerTester{
public static void main(String hii[]){

Customer details=new Customer();
//details.customerId=1;
//details.firstName="bus";
details.setCustomerId(1);
System.out.println(details.getCustomerId());

details.setName("ganu");
System.out.println(details.getName());

details.setNames1("ganavi");
System.out.println(details.getNames1());

details.setNamess("SHETTY");
System.out.println(details.getNamess());

details.setEmail("ganu@gmail.com");
System.out.println(details.getEmail());

details.setAddress("mandya");
System.out.println(details.getAddress());

details.setDOb("april-18");
System.out.println(details.getDob());

details.setPhoneNo(1234567890);
System.out.println(details.getPhoneNo());

//details.setLast("shetty");
//System.out.println(details.getLast());
}
}