//Criado por Luís Ângelo Rodrigues Jr. em 20171027 - 16h01

import java.util.Scanner;

public class MaiorDeTresNumeros{
	public static void main (String [] args){
		
		int x, y, z;
		System.out.println("Insira três números inteiros");
		Scanner in = new Scanner (System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		if ( x > y && x > z){
		System.out.println("O primeiro número digitado é o maior");
			}else if ( y > x && y > z){
				System.out.println("O segundo número digitado é o maior");
				}else if ( z > x && z > y){
					System.out.println("O terceiro número digitado é o maior");
					}else {
						System.out.println("Números iguais foram inseridos");
					}
	}
}
