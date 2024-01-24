
// Packages must match the folder structure
package ie.tudublin;

public class Main
{
	public void doDogStuff()
	{
		// Create a new Dog called Misty
		// Call the constructor
		Dog misty = new Dog("Misty");
		misty.speak();

        Dog lucy = new Dog("Lucy");
		lucy.speak();
	}

	public void doCatStuff()
	{
		// Put your code here
		Cat ginger = new Cat("Ginger");
		ginger.kill();
		for (int i = 0; i<9; i++)
		{
			ginger.kill();
		}
		System.out.println("cats are from space");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		Main m = new Main();

		m.doDogStuff();

		m.doCatStuff();
	}
	
}