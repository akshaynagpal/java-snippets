class A{

int i,j;
	
	void showij(){
		System.out.println("i & j:"+i+" "+j);
	}

}

class B extends A{

int k;
	void showk(){
		System.out.println("k: "+k);
	}
	void sum(){
		System.out.println("sum = "+(i+a.j+k));
	}

}

class TestInheritance{

	public static void main(String args[]){
		
		A a = new A();
		B b = new B();

		a.i=10;
		a.j=20;
		System.out.println("Contents of A:");
		a.showij();
		
		b.i=7;
		b.j=8;
		b.k=9;
		System.out.println("Contents of B:");
		b.showij();
		b.showk();
		b.sum();

	}
}