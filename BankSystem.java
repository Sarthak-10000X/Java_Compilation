import java.util.Scanner;

public class BankSystem{
	static Scanner sc=new Scanner(System.in);
	static double balance=0;
public static void main(String[] args) throws InterruptedException {

double amount=0;
int time = 0;
double withdraw;
double deposit;
double interestRate;
boolean run=true;
while(run==true){
System.out.println("-----Banking System-----");
System.out.println("Press 1 - To check the balance");
System.out.println("Press 2 - To deposit Money");
System.out.println("Press 3 - To withdraw Money");
System.out.println("Press 4 - To find interest rate");
System.out.println("Press 5 - To Exit");

System.out.print("Enter your choice (1-5): ");
int choice=sc.nextInt();

switch(choice){
case 1-> showBalance();
case 2-> balance+=deposit(amount); 
case 3-> balance -= withdraw(amount , balance);
case 4-> System.out.printf("The Compound Interest Rate is: %.2f ",interestRate(amount , time, balance));
case 5-> run = false;
default-> System.out.println("INVALID ENTRY!");
}
}

System.out.println("THANK YOU ! SEE YOU AGAIN!");
sc.close();
}
static void showBalance(){
System.out.println("-------------------------");
System.out.printf("Amount: $%.2f\n", balance);
System.out.println("-------------------------");
}
static double deposit(double amount){

System.out.print("Enter the amount: ");
amount= sc.nextDouble();
if(amount<0){
System.out.println("Amount cannot be negative!");
return 0;
}else{
return amount;
}
}
static double withdraw(double amount, double balance){

System.out.print("Enter the amount to be withdrawn: ");
amount = sc.nextDouble();
if(balance < amount ){
System.out.println("INSUFFIECIENT MONEY!");
return 0;
}
else if(amount<0){
System.out.println("Amount cannot be in negative!");
return 0;
}
else{
return amount;
}
}
static double interestRate(double amount , int time, double balance){
	double r=0.12;
System.out.println("---Our bank Interest Rate is 12% a year!---\n");
System.out.print("Enter the principal amount: ");
amount = sc.nextDouble();
System.out.print("Enter the time (in years): ");
time = sc.nextInt();
double Interest = amount*(Math.pow(1 + r , time));
if (amount > balance || time % 1 != 0){
System.out.print("NOT SUFFIECIENT MONEY IN BANK TO INVEST OR CHOOSE APPROPRIATE TIME!\n");
return 0;
}
else if(amount<0){
System.out.print("AMOUNT CANNOT BE NEGATIVE!\n");
return 0;
}
else{
return Interest;
}
}
}