package Chapter;
import java.util.Scanner;

class Scanner2{
	public static void main(String[] args) {

	String str = "Hello";
	String input = null; // 하나의 스트링을 input에 저장 가능 // 아무입력 안된 input
 
	Scanner sc = new Scanner(System.in);

	System.out.println("please Type a String ");

	input = sc.next(); //문자열 입력 next // 실수는 nextDouble., 한 라인을 읽을때는 nextLine()

	if(str.equals(input)){ //input.equals(str) 가능  문자열은 rquals로
	System.out.println("String match! :-)");
	}
	else{
	System.out.println("String do not match!:-(");
	}
	sc.close();

}

}