import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
     double boleto1, boleto2, boleto3, boleto4, total, total2;  
     double salarioB, salarioL;
		Scanner ler = new 
    Scanner(System.in);
    
		System.out.println("Digite o valor do 1º boleto:");
		boleto1 = ler.nextDouble();

		System.out.println("Digite o valor do 2º boleto:");
		boleto2 = ler.nextDouble();

		System.out.println("Digite o valor do 3º boleto:");
		boleto3 = ler.nextDouble();
    
		System.out.println("Digite o valor do 4º boleto:");
		boleto4 = ler.nextDouble();
    
		total = boleto1+boleto2+boleto3+boleto4;
		
		System.out.println("Digite o seu salário bruto:");
		salarioB = ler.nextDouble();
		salarioL = salarioB - (0.14*salarioB);
		
		System.out.print("\nO total das suas contas é: R$ " + total);
		total2 = salarioL-total;
		
		System.out.println("\n\nO seu salário líquido, após o desconto em folha (14% do salário bruto) é de R$ " + salarioL);
		
		if (total > salarioL){
            System.out.println("\nPara pagar suas contas, ficará faltando o valor de R$" + total2*-1 );
        } else{
            System.out.println("\nAo pagar suas contas, irá sobrar um valor de R$" + total2);
        }
		

  }
}


