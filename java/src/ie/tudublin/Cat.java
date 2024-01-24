package ie.tudublin;

public class Cat {
    
    private int numLives;
    String name;
	
	public void setName(String name)
	{
		this.name = name;
	}

    public Cat(String name)
	{
		this.name = name;
        this.numLives = 9;
	}

    public void setLives(int numLives)
    {
        this.numLives = numLives;
    }

	public void kill()
	{

        if (numLives > 0)
        {
            numLives = numLives-1;
            System.out.println("Ouch!");
        }

        else
        {
            System.out.println("Dead.");
        }
	}

}
