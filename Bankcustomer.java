package javalearning;
class Bankc{
 int acno;
 String fields;
 int amt;
 Bankc(int x,String y,int z){
	 acno=x;
	 fields=y;
	 amt=z;
 }
 Bankc()
 {
	  acno=100;
	  fields="current";
	  amt = 50000;
	 
	 
 }
  void output() {
	  System.out.println(acno+" "+fields+" "+amt);
  }
	
}
public class Bankcustomer {

	public static void main(String[] args) {
		Bankc b1=new Bankc(23,"savings",25000);
		Bankc b2=new Bankc();
		b1.output();
		b2.output();// TODO Auto-generated method stub

	}

}