import java.util.Scanner;

class A{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
String eyes;
String hair;
String nail;
String name;
String mood;





System.out.print("The color of her eyes: ");
eyes = scanner.nextLine();
System.out.print("The color of her hair: ");
 hair = scanner.nextLine();
System.out.print("Color of her nails: ");
 nail = scanner.nextLine();
System.out.print("The guy who loves her: ");
 name = scanner.nextLine();
 System.out.print("His mood(happy,sad,thinking): ");
mood = scanner.nextLine();

System.out.print("There is a girl who has beautiful " + eyes +" eyes.\nShe doesnt know that he see's her everyday.\n");
System.out.println("One day he saw her long " + hair + " hair which was waving like an ocean into the thin air.\n It made me think oh! i like long hairs!! ");
System.out.print("When he looked closely he saw her " + nail + " nails shining brightly under the sun.\n" ); 
System.out.print("The guy who fallen in love with her was the guy named " + name + "!!\n But hes afraid to go and tell her that he likes her." );
if(mood.equalsIgnoreCase("happy")){
	System.out.println("She is wearing a wonderful green dress today.\nShe always fills his heart with joy and excitements.");
}
else if(mood.equalsIgnoreCase("sad")){
		System.out.println("What if she stops coming and he never see's her again.Makes him feel  worried sometimes. ");

}
else if(mood.equalsIgnoreCase("thinking")){
	System.out.println("He wonders if she notices him or not.\nWhat if she loves him back and waits for him everyday to aproach to her!! ");

}
else{
	System.out.println("love has many moods.\n Every mood is beautiful in thir own way! ");
}
scanner.close();
	}
}
