package classwork;

import java.util.Scanner;

class Employee
{
	int empid,basicsalary,exp,ta,bs,exp1;
	String empname,designation;
	void setData(int id,int sal,String name1,String des,int exp)
	{
		empid=id;
		basicsalary=sal;
		empname=name1;
		designation=des;
		exp1=exp;
	}
    void getAppraisal()
	{
    	bs=basicsalary;
		if(exp1>=1)   
		{

			basicsalary=(10*basicsalary/100)+basicsalary;
		}
		
	}
	void calculateTA()
	{
		if (designation.equals("manager"))
		{
			ta=3000;
		}
		else
			ta=1000;
	
	}
	void getdata()
	{
		System.out.println("name:"+empname+"\n"+"id:"+empid+"\n"+"BasicSalary:"+bs+"\n"+"Designation:"+designation+"\n"+"Gross salary:"+basicsalary+"\n"+"Travel allowance:"+ta );
		
	}
	
	
}
public class Appraisal {

	public static void main(String[] args) 
	{
		int id,sal,exp;
		String name,des;
		System.out.println("Enter name:"+"\n"+"id:"+"\n"+"Salary:"+"\n"+"Designation:"+"\n"+"Experience:");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		id=sc.nextInt();
		sal=sc.nextInt();
		sc.next();
		des=sc.nextLine();
		exp=sc.nextInt();
		Employee ch=new Employee();
		ch.setData(id,sal,name,des,exp);
		ch.getAppraisal();
		ch.calculateTA();
		ch.getdata();
		

	}

}