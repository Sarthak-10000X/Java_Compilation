import java.util.Scanner;
import java.util.Random;
public class RandomDice{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
Random random= new Random();

System.out.print("Enter the number of dice you wanna roll: ");
int roll = sc.nextInt();
int total=0;
if (roll > 0){
for(int i =0 ; i<roll; i++){
	int number = random.nextInt(1,7);
	DiagramofDice(number);
	System.out.println("you rolled: " + number);

	total += number;	
}
	System.out.println("Total Number: " + total);
}
else{
System.out.println("INVALID ROLL!");
}
sc.close();
}

static void DiagramofDice(int rolls){
	                    String Dice_1 ="""
                                	-----  
	                               |     |
								   |  ●  |
								   |     | 
								    -----  
									""";
                        String Dice_2 ="""
                                	-----  
	                               |     |
								   | ● ● |
								   |     | 
								    -----  
									""";
	                    String Dice_3 ="""
                                	-----  
	                               |  ●  |
								   |     |
								   | ● ● | 
								    -----  
									""";	
	                    String Dice_4 ="""
                                	-----  
	                               | ● ● |
								   |     |
								   | ● ● | 
								    -----  
									""";	
                        String Dice_5 ="""
                                	-----  
	                               | ● ● |
								   |  ●  |
								   | ● ● | 
								    -----  
									""";	
                        String Dice_6 ="""
                                	-----  
	                               | ● ● |
								   | ● ● |
								   | ● ● | 
								    -----  
									""";										
									
	
	
	switch (rolls){
	case 1 -> System.out.println(Dice_1);
    case 2 -> System.out.println(Dice_2);
	case 3 -> System.out.println(Dice_3);
	case 4 -> System.out.println(Dice_4);
	case 5 -> System.out.println(Dice_5);
	case 6 -> System.out.println(Dice_6);
	default ->System.out.println("INVALID ROLL!"); 						
	}	
}
}