package Chapter;
import java.util.Scanner;

class Scanner1{

	public static void main(String[] args) {
	
	int number = 123;

		
	Scanner sc = new Scanner(System.in);
	System.out.println("please ented an i=Integer :");
	int input = sc.nextInt();
	
	if(input==number){
	System.out.println("number match! :-)");
	}else{
	System.out.println("numbers do not match! :-(");
}
	
	sc.close();
}
}