import java.util.*;

     class D04{
	public static void main(String[] args){
         Scanner s = new Scanner(System.in);   
              System.out.printf("태어난 연도를 입력하세요 : ");
               int birth_year = s.nextInt();

		int age = 2012 - birth_year+1;
		 
             	 if(age<7){
              		System.out.println("유아입니다");
                 }
                          if(age>=7 && age<13){
                          System.out.println("어린이입니다");
                                      }
                 if(age>=13 && age<20){
                 System.out.println("청소년입니다");
                 }
                 if(age>=20 && age<30){
                 System.out.println("청년입니다");
                 }
                 if(age>=30 && age<60){
                 System.out.println("중년입니다");
                 }
                 if(age>=60){
                 System.out.println("노년입니다");
                 }
               

        }
}
