import java.util.Scanner;
public class Counting{
	
	public static void main(String[] args) {
		int count=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("How many times should the statement be printed?");
		int response= scan.nextInt();
		while(count<=response)
		{
			System.out.println(count +"Computer Science is cool!!");
			count++;
			
		}
	}
}