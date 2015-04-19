import java.io.*;
class Prime_num{
public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int i,j,num,flag=0;
	System.out.println("Enter the number..");
	num=Integer.parseInt(br.readLine());
	  for(j=2;j<num;j++)
		{
		if(num%j==0)
		flag=1;	break;
		}
    if(flag==0)
    System.out.println("prime number!");
    else
    System.out.println("Composite number!");
	} //main function closed
}//class closed