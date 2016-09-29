import java.util.Scanner;


class D02 {

 public static void main(String[] args) {

   Scanner s = new Scanner(System.in);

   System.out.println("온도를 입력하세요");

   double input_degree = s.nextDouble();
   System.out.println("입력하신 온도가 섭씨온도이면 C를 , 화씨온도이면 F를 입력 :");
   String kind = s.next();


	     double output_degree = ( input_degree - 32) / 1.8;

	     double output_degree2 = input_degree * 1.8 + 32;

	     if (kind.equals("C")) {

		System.out.println("변환된 화씨온도는 " + output_degree + " 입니다 ");




		      }



		        if (kind.equals("F")) {

			   System.out.println("변환된 섭씨온도는 " + output_degree + " 입니다 ");

			     }


			      }

			      }

			


