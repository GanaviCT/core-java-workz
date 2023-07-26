class ParleTester{
public static void main(String hlo[]){

ParleFactory factory=new ParleFactory(50,30.0,12);
System.out.println(factory.quantity+ " "+factory.price+" "+factory.noOfBiscuits+" "+factory.name);
ParleFactory factory1=new ParleFactory(70,55.0,35);
System.out.println(factory1.quantity+ " "+factory1.price+" "+factory1.noOfBiscuits);

}
}