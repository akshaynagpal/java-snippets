class VarArg{
	
	static void vaTest(int...v){

		System.out.println("No. of args = "+ v.length+ "Contents: ");
		for(int x:v)
		System.out.println(x);
	
	}
	static void vaTest(double...v){

		System.out.println("No. of args = "+ v.length+ "Contents: ");
		for(double x:v)
		System.out.println(x);
	
	}
	static void vaTest(char...v){

		System.out.println("No. of args = "+ v.length+ "Contents: ");
		for(char x:v)
		System.out.println(x);
	
	}
	static void vaTest(String...v){

		System.out.println("No. of args = "+ v.length+ "Contents: ");
		for(String x:v)
		System.out.println(x);
	
	}


	
	public static void main(String args[]){

		vaTest(1,2,3,4);
		vaTest(1,1.5,2,2.5,3);
		vaTest('a','b','c','d');
		vaTest("hello","bye","tata");
		

	}

}