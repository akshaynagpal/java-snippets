class Client implements CallBack{
	public void callback(int p)
		{System.out.println("callback called with "+p);
	}
}
class TestIFace{
	public static void main(String args[])
		{
			CallBack c=new Client();
			c.callback(26);
			}
		}