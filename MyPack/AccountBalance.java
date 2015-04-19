package MyPack;

 class Balance
{
	String name;
	double bal;

	 Balance(String n,double b)
							  {
								name=n;
								bal=b;
							  }
							  
	void show()
				{
				if(bal<0)	
				System.out.print("---> ");
				System.out.println(name + ": Rs."+bal);
			    }
}

class AccountBalance
{
	public static void main(String args[])
	{
		Balance current[]=new Balance[3];
		current[0]=new Balance("akshay",123.23);
		current[1]=new Balance("nagpal",133.23);
		current[2]=new Balance("manu",143.23);
		for(int i=0;i<3;i++)
			current[i].show();
	}
}					