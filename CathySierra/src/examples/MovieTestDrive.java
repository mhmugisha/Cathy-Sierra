package examples;

public class MovieTestDrive {

	public static void main(String[] args) 
	{
	Movie one = new Movie();
	one.title = "Gone With the Stock";
	one.genre = "Tragic";
	one.rating = -2;
	one.playIt();
	
	Movie two = new Movie();
	two.title = "Lost in Cubicle Space";
	two.genre = "Comedy";
	two.rating = 5;
	two.playIt();
	
	Movie three = new Movie();
	three.title = "Byte Club";
	three.genre = "Tragic but finally uplifting";
	three.rating = 127;
	three.playIt();
	}

}
