package javalearning;
class Person{
	int pid;
	String pname;
	void input(int x,String y) {
		pid=x;
		pname=y;
	}
	
}
class Stud extends Person{
	int marks;
	void input(int z) {
		marks=z;
	}
	void show()
	{
		System.out.println(pid+" "+pname+" "+marks);
	}
}
class emp extends Person{
	int salary;
	void input(int s) {
		salary = s;
	}
	void show()
	{
		System.out.println(pid+" "+pname+" "+salary);
	}
	
}
public class Inhert {

	public static void main(String[] args) {
		
		Stud st = new Stud();
		st.input(12, "swamy");
		st.input(500);
		emp em=new emp();
		em.input(12, "swamy");
		em.input(25000);
		st.show();
		em.show();
		// TODO Auto-generated method stub

	}

}
