package oops;
public class studentUser {
    public static void main(String[] args) 
{
	student s= new student();
	System.out.println(s.getName()); 
	System.out.println(s.getmobNo()); 
	System.out.println(s.getSection()); 
	System.out.println("____________");
	s.setName("Pushpa");
	s.setmobNo(123);
	s.setSection('S');
	System.out.println(s.getName()); 
	System.out.println(s.getmobNo()); 
	System.out.println(s.getSection()); 
}
}
