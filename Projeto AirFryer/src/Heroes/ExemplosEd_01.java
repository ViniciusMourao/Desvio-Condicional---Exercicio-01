package Heroes;

import java.util.Scanner;
public class ExemplosEd_01 {
	public static void main(String[]args) {
		
		Scanner shallow = new Scanner(System.in);
		
		int X;
		
		System.out.println("Digite um n�mero");
		X = shallow.nextInt();
		
		if (X <= 14) {
			System.out.println("O n�mero � menor que 15");
		}else if (X >= 101) {
			System.out.println("O n�mero � maior que 100");
		}else {
			System.out.println("O n�mero esta entre 15 e 100");
			shallow.close();
		}
		
	}

}
