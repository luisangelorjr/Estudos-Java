import java.util.Scanner;

//Criado por Luís Ângelo Rodrigues Jr. em 20171027 - 15h59

public class ParOuImpar{
	public static void main (String [] args){
		int x;
		System.out.println("Insira um número inteiro para checar se ele é par ou ímpar");
		Scanner in = new Scanner (System.in); // Verificar o que a linha esta linha e a abaixo executam
		x = in.nextInt();	
		
		if ( x % 2 == 0 ) {
			System.out.println("Você inseriu um número par");
		}else{
			System.out.println("Você inseriu um número par");
		}
	}
}	