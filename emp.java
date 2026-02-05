import java.util.*;
class employee
{
	int eno;
	String ename;
	double esalary;
	employee(int eno,String ename,double esalary)
	{
		this.eno=eno;
		this.ename=ename;
		this.esalary=esalary;
	}
}
class emp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		employee[] emps=new employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter eno:");
			int eno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter ename:");
			String ename=sc.nextLine();
			System.out.println("Enter esalary:");
			double esalary=sc.nextDouble();
			emps[i]=new employee(eno,ename,esalary);
		}
		System.out.println("Enter a search value:");
		int s=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(emps[i].eno==s)
			{
				System.out.println("eno is:"+emps[i].eno+"ename is:"+emps[i].ename+"esalart is:"+emps[i].esalary);
			}
		}
	}
}
