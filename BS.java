class Info{
	int n;
	boolean flag=false;
	synchronized void avail(int a) {
		while(flag)
			{ 
				try{ 
					 wait();}catch(InterruptedException e){
					 	System.out.println("Caught!!");}
					 
					 }
		this.n=a;
		flag=true;
		System.out.println("Property Available: " + n);
		notify();
	}
	
	synchronized int sell(){
	while(!flag){
		try{
		wait(); }catch(InterruptedException e){
					 	System.out.println("Cauhght!!");}		
			}
		System.out.println("Property Sold: " + n);
		flag=false;
		notify();
		return n;
	}
}

class Buyer implements Runnable{
	Info i;
	Buyer(Info b){
		this.i=b;
		new Thread(this,"Buyer").start();
	    }
	public void run(){
		while(true)
			{
				i.sell(); 
			}
		}
}

class Seller implements Runnable{
	Info i;
	Seller(Info b){
		this.i=b;
		new Thread(this,"Seller").start();
	}
	public void run(){
	int x=0;
		while(true)
			{
				i.avail(x++); 
			  }
		}
		}
class BS{
	public static void main(String args[]){
	Info inf = new Info();
	new Seller(inf);
	new Buyer(inf);
	System.out.println("Press CTRL & C to stop!!");
    }
}				  