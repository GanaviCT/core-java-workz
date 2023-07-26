class ParleFactory{
static String name="PARLEG";
int quantity;
double price;
int noOfBiscuits;

public ParleFactory(int quantity,double price, int noOfBiscuits){
this.quantity=quantity;
this.price=price;
this.noOfBiscuits=noOfBiscuits;
this.produceBisckets();
}

public static void produceBisckets(){
System.out.println("produce the parle bisckets");
}
}