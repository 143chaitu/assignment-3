package javalearning;
class Student{
	int sid;
	String sname;
	int marks;
	void input(int x,String y,int z)
	{
		sid=x;
		sname=y;
		marks=z;
	}
	void output() {
		System.out.println(sid+" "+sname+" "+marks);
	}
}
public class Studentdetails {

	public static void main(String[] args) {
		Student s=new Student();
		s.input(12,"chai",500);// TODO Auto-generated method stub
		s.output();
	}

}
