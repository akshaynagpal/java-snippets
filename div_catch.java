import java.io.* ;
import MyPack.input_num ;
/*
class input_num
{
public int a,b;
input_num(int x,int y)
	{
		
		a=x;
		b=y;
		}
}
*/
class div_catch
{
public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int x,y,div;
	int[] num=new int[3];
	try{ //try outer
		num[1]=3;
	System.out.println("Enter the first number..");
	x=Integer.parseInt(br.readLine());	
	System.out.println("Enter the second number..");
	y=Integer.parseInt(br.readLine());
	input_num ob = new input_num(x,y);
	
	try{//try inner
		div=ob.a/ob.b;
		System.out.println("The result is:"+div);
		throw new NullPointerException("demo");
	}catch(ArithmeticException e){ //catch inner
		System.out.println("Exception"+ e);
		}
		finally{
			System.out.println("Finally executed!");}
	}catch(ArrayIndexOutOfBoundsException e)//catch outer 1
		{System.out.println("Exception"+ e);
			}catch(NullPointerException e) //catch outer 2
				{System.out.println("Exception"+e);
					}
		System.out.println("Out of catch! End of program!");		
}	
}	