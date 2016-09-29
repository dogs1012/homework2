import java.util.*;

	class D05{
		public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요 : ");
		int k = s.nextInt();
		System.out.printf("영어 점수를 입력하세요 : ");
		int e = s.nextInt();
		System.out.printf("수학 점수를 입력하세요 : ");
		int m = s.nextInt();
		int hap = m + k + e;
		System.out.printf("입력하신 점수의 총점은"+ hap +"이고" );
		double avg = hap/3;
		System.out.printf("평균은 : "+ avg +"입니다 ");
		if(k > 90){
		System.out.println("국어점수가 우수합니다");
		}
		if(e>90){
		System.out.println("영어점수가 우수합니다");
		}
		if(m>90)
		{System.out.println("수학점수가 우수합니다");
		}
		


}
}
