
public class Application {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Item <String> thing1 = new Item< String> ();
		thing1.setE("Jonathan Moreira Alsina");
		
		Item <Integer> thing2 = new Item<Integer>();
		thing2.setE(20);
		
		SmallBag <Item>bag = new SmallBag<Item>();
		
		bag.setObj(thing1); 
		Item <String> thing3= new Item <String> ();
		thing3 = bag.getObj();
		System.out.println("The first item in the bag is: "+thing3);
		
		bag.setObj(thing2);
		Item <Integer> thing4 = new Item();
		thing4=bag.getObj();
		System.out.println("The second item in the bag is: "+thing4);
		
		
		
	}

}
