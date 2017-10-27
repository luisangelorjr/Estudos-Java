//Criado por Luís Ângelo Rodrigues Jr. em 20171027 - 16h37

import java.util.Scanner;

public class NumerosPrimos {
  public static void main (String [] args) {
    
    int num, i, count=0;
    
    Scanner scan = new Scanner (System.in);
        System.out.print("Insira um número: ");
        num = scan.nextInt();
    
    for (i=2; i<num; i++) {
      if (num % i == 0){
        count++;
        break;
      }
	}
	if (count==0){
	  System.out.print("Esse é um número primo: ");
	}else{
	  System.out.print("Esse não é um número primo: ");
	  }
	}
}
