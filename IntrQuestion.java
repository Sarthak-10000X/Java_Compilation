import java.util.Scanner;
import java.util.Arrays;
public class IntrQuestion{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);

String[] questions = {"1.Which of the following statements about JVM memory areas is TRUE?", 
                      "2.Which statement is correct?", 
					  "3.Which of the following is TRUE about java 8 and later ?", 
					  "4.Which statement about method overloading is TRUE?", 
                      "5.Which of the following statement is TRUE?"};
					  

String[][] options = {{"1. Method Area stores only method bytecode and not static variables",
                      "2. Heap memory is shared among all threads",
                      "3. Stack memory is shared among all threads",
                      "4. Objects are stored in Stack memory"}, 
					  
					  {"1. finalize() is guaranteed to execute before garbage collection",
                       "2. finally block will execute even if System.exit() is called",
                       "3. A final class cannot have abstract methods",
                       "4. final variables must always be initialized at declaration"}, 
					   
					  {"1. Interfaces cannot have static methods",
                       "2. Interfaces can have constructors",
                       "3. Interfaces can have default and static methods with body",
                       "4. Interface variables are private by default"}, 
					   
					  {"1. Return type alone can overload a method",
                       "2. Access modifier must be same for overloaded methods",
                       "3. Parameter list must be different",
                       "4. Overloading works only in inheritance"}, 
					   
					  {"1. start() method directly executes the thread’s run() method in the same thread",
                       "2. Calling run() manually creates a new thread",
                       "3. A thread can be started more than once",
                       "4. A thread goes to Runnable state after calling start()"}};
int total=0;					   
System.out.println("----------");
System.out.println("JAVA QUIZ!");
System.out.println("----------");
int[] answers = {2, 3, 3, 3, 4};
for(int i=0 ; i < questions.length ; i++){
 System.out.println(questions[i]);
for (String option : options[i]){
     
		System.out.println(option + "\n");
}
System.out.print("Enter your guess: ");
int guess = sc.nextInt();

if(guess == answers[i]){
System.out.println("---------");
System.out.println("CORRECT!");
System.out.println("---------");
total++;
}
else{
System.out.println("------");
System.out.println("WRONG!");
System.out.println("------");
}
}

System.out.println("Your total score is " + total + " out of " + questions.length);
System.out.println("----------");
System.out.println("THANK YOU!");
System.out.println("----------");

}
}