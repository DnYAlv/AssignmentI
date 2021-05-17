import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {
	
	public static void cls() {
		for(int i = 0 ; i < 30 ; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("BJ - JPTable");
		System.out.print("Press any key to continue...");
		scan.nextLine();
		cls();
		int choose = 0;
		int number1 = 0;
		int number2 = 0;
		do {
			cls();
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.print("Choose >> ");
			choose = scan.nextInt();
			scan.nextLine();
			if(choose == 1) {
				do {
					System.out.print("Input the first number [1 - 100](inclusive): ");
					number1 = scan.nextInt();
					scan.nextLine();
				}while(number1 < 1 || number1 > 100);
				
				do {
					System.out.print("Input the second number [1 - 100](inclusive): ");
					number2 = scan.nextInt();
					scan.nextLine();
				}while(number2 < 1 || number2 > 100);
				
				cls();
				System.out.println("+=========================================================================================================================+");
				System.out.println("+  + (String Type)  |  (Character Type)  |  * (Integer Type)  |  / (Floating Type)  |  input 1 == input 2 (Boolean Type)  +");
				System.out.println("+=========================================================================================================================+");
				System.out.printf("+ %7d + %-7d | %7c  %-9c |       %-12d |       %-13.3f | ", number1, number2, number1, number2, number1*number2,(float) number1/number2);
				System.out.print(number1 == number2);
				if(number1 == number2) System.out.println("                                +");
				else if(number1 != number2) System.out.println("                               +");
				System.out.println("+=========================================================================================================================+");
				System.out.print("Press enter to proceed...");
				scan.nextLine();
				
				int sum = number1 + number2;
				cls();
				System.out.println("+==========================================================+");
				System.out.println("+Data Type : " + ((Object)sum).getClass().getSimpleName() + "                                       +");
				System.out.println("+==========================================================+");
				System.out.println("+    +    |     -     |     *     |     /     |     %      +");
				System.out.println("+==========================================================+");
				System.out.printf ("+   %-5d |     %-5d |    %-6d |     %-5d |     %-6d +\n", number1+number2, number1-number2, number1*number2, number1/number2, number1%number2);
				System.out.println("+==========================================================+");
				System.out.print("Press enter to proceed...");
				scan.nextLine();
				
				boolean p1 = true,p2 = true;
				char cp1 = 0,cp2 = 0;
				int i,j;
				cls();
				do {
					try {
						System.out.print("Give me value for p1 [true | false]: ");
						p1 = scan.nextBoolean();
						scan.nextLine();
						i = 1;
					}catch(Exception e) {
						scan.nextLine();
						i = 0;
					}
					
				}while(i == 0);
				
				do {
					try {
						System.out.print("Give me value for p2 [true | false]: ");
						p2 = scan.nextBoolean();
						scan.nextLine();
						j = 1;
					}catch(Exception e) {
						scan.nextLine();
						j = 0;
					}
				}while(j == 0);
				
				if(p1) cp1 = 'T';
				else if(!p1) cp1 = 'F';
				if(p2) cp2 = 'T';
				else if(!p2) cp2 = 'F';
				
				cls();
				System.out.println("+===================================================+");
				System.out.println("+Logical Table                                             +");
				System.out.println("+===================================================+");
				System.out.println("+ P1 = " + cp1 + " , P2 = " + cp2 + "                                   +");
				System.out.println("+===================================================+");
				System.out.println("+    !P1    |     !P2     |     &&     |     ||     +");
				System.out.println("+===================================================+");
				System.out.print("+   " + (!p1) + "   ");
				System.out.print("|    " + (!p2) + "     ");
				System.out.print("|    " + (p1 && p2) + "   ");
				System.out.println("|    " + (p1 || p2) + "    +");
				System.out.println("+===================================================+");
				System.out.print("Press enter to proceed...");
				scan.nextLine();
				
				choose = 3;
			}else if(choose == 2) {
				System.out.print("Thank you for using the apps!");
				break;
			}
		}while(choose != 1 && choose != 2);
		scan.close();
		
	}

}
