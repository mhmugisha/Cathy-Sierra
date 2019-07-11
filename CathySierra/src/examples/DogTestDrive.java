package examples;

public class DogTestDrive {

	public static void main(String[] args) {
		Dog one = new Dog(); //Make a dog object with reference variable one.
        one.weight = 90; //use dot to set weight of dog shepherd to 40.
		one.bark(); //use dot (.) to call it's bark method. 
		
		Dog two = new Dog();
		two.weight = 20;
		two.bark();
		
		Dog poppy = new Dog();
		poppy.weight = 100;
		poppy.bark();
	}

}
