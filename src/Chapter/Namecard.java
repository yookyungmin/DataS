package Chapter;

import java.util.Scanner;

public class Namecard {

	public static void main(String[] args) {
		
		int phnum;
		String company;
		String name;
		
		
	
		while(true) {
		System.out.println("1. 명함 입력");
		System.out.println("2. 명함 검색");
		System.out.println("3. 종료");

		
		System.out.println("=======================");
		System.out.println("메뉴를 입력 하세요:");
		Scanner sc = new Scanner(System.in);
		
		
	
			int num = Integer.parseInt(sc.nextLine()); //문자열로 받아서 숫자로 변환
			if(num==1) {
				System.out.println("이름을 입력하세요");
				System.out.println("전화번호를 입력하세요");
				System.out.println("회사 이름을 입력하세요");
				name = sc.nextLine();
				phnum = Integer.parseInt(sc.nextLine());
				company = sc.nextLine();
				System.out.println("정상적으로 입력되었습니다");
				
				
			}
			if(num ==2) {
				System.out.println("검색할 이름을 입력하세요 (like검색)");
				name = sc.nextLine();
				System.out.println(name+"을 검색하셨습니다");
				
			}
			if(num==3) {
				System.out.println("종료하겠습니다");
				break;
			} else {
				System.out.println("번호를 다시 입력하세요");
			}
		}
		
	}

}
