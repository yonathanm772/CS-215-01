
public class Item <T>
{
	private T e;
	
	public void setE(T e) 
	{
		this.e=e;
	}
	
	public T getE() 
	{
		return e;
	}
	
	public String toString() {
		return "("+e+")";
	}
}
