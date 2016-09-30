import java.util.*;
	
	class A06{
		public static void main(String[] args){
			Scanner s = new Scanner(System.in);			
			System.out.print("이름 :" );
			String name = s.next();
			
			System.out.println("국어점수 입력 :" );
			int k = s.nextInt();
			System.out.println("수학점수 입력 :" );
			int m = s.nextInt();
			System.out.println("영어점수 입력 :" );
			int e = s.nextInt();
			System.out.println("["+name+"]님은");
			double avg = (k+m+e)/3;
			System.out.println("평균은"+avg +"이고");

			if(avg>95){
			System.out.println("학점은 A+ 입니다");
	 		}
			else if(avg > 90){
			System.out.println("학점은 A입니다");
			}
			else if(avg > 85){
			System.out.println("학점은 B+입니다");
			}
			
}
}
