package Chapter;
import java.util.Scanner;
class Arrays2{

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] data = new int[n];

	for(int i = 0; i<n; i++)
		data[i] = sc.nextInt(); //n개의 정수를 하나씩입력
	sc.close();

	int sum=0;
	int max=data[0];//음수도 나올수도 있어서
	for(int i=0; i<n; i++){
	sum+= data[i]; // 합에다가 각각의 정수를 더해줌 sum = sum+data[i];
		
		if(data[i]>max)
			max=data[i]; //데이터를 순서대로 보며 해당 데이터가 현재 알고 있는 데이터보다 크다면 새로운 최댓값이다
	}
		System.out.println("This sum is " + sum + " and the maximum is " +  max);
}

}