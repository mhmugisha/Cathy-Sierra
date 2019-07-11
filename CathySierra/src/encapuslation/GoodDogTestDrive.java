/* Using setter and getter methods in class GoodDog. 
 * A setter - setSize(), is a method that updates value of a variable. 
 * A getter - getSize(), is a method that reads value of a variable.
 * */ 

// setSize() and getSize() are java methods - NOT user defined.
package encapuslation;

public class GoodDogTestDrive 
{

	public static void main(String[] args) 
	{
	
		GoodDog one = new GoodDog();//Object
		one.setSize(400);// Since size now is private u can't read or update  
						// it as: one.size = 70 - Error: "Field 
						//GoodDog.size not visible.
		
		GoodDog two = new GoodDog();
		two.setSize(60);
	
		int gottenSizeOne = one.getSize();
		int gottenSizetwo = two.getSize();
		
	System.out.println("GoodDog one: " + gottenSizeOne);	
	System.out.println("GoodDog two: " + gottenSizetwo);
	
	one.bark();
	two.bark();

	}
}
