package Chapter;
import java.util.Scanner;

class Scanner3{
	public static void main(String[] args) {
	
	String name = null;
	
	int age;
	String gender;

	Scanner sc = new Scanner(System.in);
	System.out.println("please type your name  and your age and your gender:");

	name=sc.next();
	age = sc.nextInt();
	gender = sc.next();

	if(gender.equals("male")){
		System.out.println(name+", you're " +age+ "years old man");
	} else if(gender.equals("female")){
		System.out.println(name+", you're "+age+"years old woman");
	}else{
	System.out.println("hmm.. interestin");
	}

	sc.close();
}

}