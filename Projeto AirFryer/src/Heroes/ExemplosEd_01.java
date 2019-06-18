package Heroes;

import java.util.Scanner;
public class ExemplosEd_01 {
	public static void main(String[]args) {
		
		Scanner shallow = new Scanner(System.in);
		
		int X;
		
		System.out.println("Digite um número");
		X = shallow.nextInt();
		
		if (X <= 14) {
			System.out.println("O número é menor que 15");
		}else if (X >= 101) {
			System.out.println("O número é maior que 100");
		}else {
			System.out.println("O número esta entre 15 e 100");
			shallow.close();
		}
		
	}

}
