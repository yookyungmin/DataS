package Chapter;
class Arrays1{

	public static void main(String[] args){
	//크기가 5인 정수배열 만들기
	//                                                                                                                                                                                                                                                                                                                   
	//int[] grades;
	//grades= new int[5];

	int[] grades = new int[5]; //배열의 크기는 항
	
	//grades[0] =100;
	//grades[1]=75;
	//grades[2] = 74;
	//grades[3]=68;
	//grades[4]= 50;

	for(int i= 0; i<grades.length; i++){
	System.out.println("grade"+(i+1)+":"+grades[i]);
	}
	
	
	/*
	int i = 0;
	while(i<grades.length) {
	System.out.println("grade"+(i+1)+";"+grades[i]);
	i++;
	} //while문
		*/
	

}


}

