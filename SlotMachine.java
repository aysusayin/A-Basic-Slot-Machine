import java.util.Random;
import java.util.Scanner;
public class SlotMachine {

	public static void main(String[] args) throws InterruptedException {

		Random dice = new Random();
		Scanner scan = new Scanner(System.in);

		String s= "WELCOME TO THE SLOT MACHINE";
		for(int i=0; i<=(40-s.length())/2; i++){
			System.out.print("*");	
		}
		System.out.print(s); 
		for(int i=0;i<(40-s.length())/2;i++ )
			System.out.print("*");
		System.out.println();
		System.out.println("***MAY THE ODDS BE EVER IN YOUR FAVOR***");
		while(true){

		//		int limit= 1;
		//		for(int counter = 1; counter<=limit; counter++){
		int number1 = 1+ dice.nextInt(10);
		int number2 = 1+ dice.nextInt(10);
		int number3 = 1+ dice.nextInt(10);
		if(number1 == number2 && number2 == number3){
//			System.out.println(counter);

			System.out.print("\n\tYour numbers are\n       "+number1+"       "+number2+"       "+number3);
			Thread.sleep(1500); // Just to give the user a chance to see the statement.
			System.out.print("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
			System.out.print("       $       $       $\n");

			System.out.print("Congrats! You won the prize!\n");
			System.out.print("\nEnter your name...");
			String name= scan.nextLine();

			System.out.println("\t   ___________");
			System.out.println("\t  '._==_==_=_.'");
			System.out.println("\t  .-\\:  $   /-.");
			System.out.println("\t | (|:. $   |) |");
			System.out.println("\t  '-|:. $   |-'");
			System.out.println("\t    \\::.    /");
			System.out.println("\t     '::. .'");
			System.out.println("\t       ) (");
			System.out.println("\t     _.' '._");
			System.out.println("\t    `\"\"\"\"\"\"\"`");
			System.out.printf("\t$$$ %s $$$",name);
			break;

		}else{
			System.out.printf("\n\tYour numbers are\n       %d       %d       %d\n", number1, number2, number3);
			System.out.println("\t  Try again :(");
			System.out.print("Do you want to play again? Press [Y] for yes [N] for no.");
			String ans= scan.next();
			if ("y".equals(ans)|| "Y".equals(ans)){
		continue;
			} else if ("n".equals(ans)|| "N".equals(ans)){
				break;
			}

			
			
			//				limit ++;

			//			}

		}
	}
	}

}
