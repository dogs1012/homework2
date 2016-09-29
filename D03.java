import java.util.Scanner;

 	class D03{
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
		 	System.out.printf("날수를 입력하세요");
			int days = s.nextInt();
			int seconds = days * 24 * 60 * 60;
			System.out.printf("날수에 해당되는 기간은 모드", seconds ,"초입니다");
			int m_count =seconds/10000 ;
			System.out.printf("100만 초가 모두 "+ m_count+ "번 포함됩니다" );
		}

	
	}

