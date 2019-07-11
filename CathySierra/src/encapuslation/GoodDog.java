//Example demonstrates encapsulation;
/* Note that the instance variables are 
 * declared private and getter and setter
 *methods are declared public*/

package encapuslation;

public class GoodDog 
{
	private int size; 
/*..................................................................*/	
	public void setSize(int num)//Setter method - Sets/updates value of variable 
	{
		size = num;
	}	
/*....................................................................*/
	//Getter method.
	public int getSize() 
	{
		return size; 
	}
/*...................................................................*/	
	void bark() //Method bark() 
	{
		if (size > 60) 
		{
		System.out.println("Wooof! Wooof!");
		} 
		else if (size > 14) 
		{
		System.out.println("Ruff! Ruff!");
		} 
		else 
		{
		System.out.println("Yip! Yip!");
		}
	}
}