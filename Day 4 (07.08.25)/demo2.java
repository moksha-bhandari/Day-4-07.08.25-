class student 
  {
     private String name,dept;
     private int roll;
 
      student(String name,int roll,String dept)   // constructor
	{
	   this.name=name;
	   this.roll=roll;
	   this.dept=dept;
	}
      public int getroll() //getter
	{
	  return roll;
	}
 
      public String getname()  //getter
	{
	  return name;
	}
      public String getdept()  //getter
	{
	  return dept;
	}
 
      public void setRoll(int roll)//setter
	{
	  this.roll=roll;
}
	
      public void setName(String name) //setter
	{
	  this.name=name;
	}
      public void setDept(String dept) //setter
	{
	  this.dept=dept;
	}
   }
 
class demo2
{
    public static void main(String asdd[])
	{//setting the values here using parameterised constructor or can call set methods too
	   student s1=new student("Lec",1,"CSE");  //object of the class of which the variavles to be accessed

	   System.out.println(s1.getname());
	   System.out.println(s1.getroll());
	   System.out.println(s1.getdept());

 
	}
}