abstract class Person
	{
public int age;
public char name;

  Person(){
			age=18;
		    name='a';
		}
		
  Person(int a,char n){
  		age=a;
  		name = n;
  		}
  		
  	abstract double Display();
}

class Student extends Person{
public int marks1;
public int marks2;

	Student(){
		super();
		 marks1=50;
		 marks2=50;
		}
	Student(int m1,int m2){
		super();
		marks1=	m1;
		marks2= m2;
		}	
	double Display(){   
		System.out.println("Student details.");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		double avg;
		avg=(marks1+marks2)/2;
		System.out.print("Avg. marks are:");
		return avg;	
	}		
	}


class Employee extends Person
	{
		public float sal;
		Employee()
			{  super();
				sal=1000; }
		double Display(){
			System.out.println("Employee details.");	
			System.out.println("Name:"+name);
		    System.out.println("Age:"+age);
		    
			double hra,it,tot;
			hra=0.14 * sal;
			it= 0.04 * sal;
			tot=(sal+hra)-it;
			System.out.print("Gross salary is: Rs.");
			return tot;
			}	
				
	}
	
class School
	{
	public static void main(String args[])
		{
			Student s1=new Student();
			Employee e1=new Employee();
			Person per;
			per=s1;
			System.out.println(""+ per.Display());
			per=e1;
			System.out.println(""+ per.Display());
			
			}	
		
		}