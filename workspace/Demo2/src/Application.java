class Robot{
	 void speak(String text){
		System.out.println(text);
	}
	
	 void jump(int height){
		System.out.println("Jumping " + height);
	}
		
	 void move(String direction, double distance){
		System.out.println("moving " + distance + " metre in direction " + direction);
	}
}

public class Application{
	
	public static void main(String[] args) {
		Robot sam = new Robot();
		
		sam.speak("Hi I am Sam.");
		sam.jump(7);
		sam.move("Moving west ", 12.2);
		
		String greeting = "Hello there.";
		sam.speak(greeting);
				
		
	}
}