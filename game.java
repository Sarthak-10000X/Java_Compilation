//ROCK PAPER SCISSOR!
import java.util.Scanner;
import java.util.Random;
public class game{ 
public static void main(String[] args){
	
boolean playAgain = true;

Scanner sc= new Scanner(System.in);
Random random = new Random();

String[] choices = {"rock" , "paper", "scissor"};
do{
System.out.println("-----------------");
System.out.println("ROCK PAPER SCISSOR!");
System.out.println("-----------------");

System.out.print("Select your move(rock,paper,scissor): ");
String human = sc.nextLine().toLowerCase();

if(!human.equals("rock") && !human.equals("paper") && !human.equals("scissor")){
System.out.println("INVALID CHOICE!");
continue;
}

System.out.println("Your choice: " + human);

String computer = choices[random.nextInt(3)];
System.out.println("Computers choice: " + computer);

if (computer.equals(human)){
	
System.out.println("ITS A TIE!");
}
else if(computer.equals("rock") && human.equals("scissor")  || computer.equals("paper") && human.equals("rock") || computer.equals("scissor") && human.equals("paper")){
System.out.println("YOU LOSE!");
}
else{
System.out.println("YOU WIN!");
}
System.out.println("DOUBLE OR NOTHING?(yes or no): ");
String option=sc.nextLine().toLowerCase();

if(option.equals("yes")){
	System.out.println("HERE YOU GO!");
	playAgain = true;
}
else if(option.equals("no")){
	playAgain = false;
}
else{
	System.out.println("INVALID!");
continue;
}
}while(playAgain == true);

System.out.println("THANKS FOR PLAYING!");
sc.close();
}
}