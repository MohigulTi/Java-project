import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter=1;
		int sum=0;
		while(counter<11){
		
		System.out.println("Please enter "+counter+"-number");
		boolean bool =scanner.hasNextInt();
		
		if(bool) {
			counter++;
			int number=scanner.nextInt();
			sum+=number;
		}else {
			System.out.println("Invalid  number! Please enter valid Number");
		}
		scanner.nextLine();
		
		}
		System.out.println("Total entered numbers are "+sum);
		scanner.close();

	}

}
