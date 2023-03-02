package programas;

import java.util.Scanner;

public class Calculadora {
	
	    public static void main(String[] args) {
	        Scanner Santos = new Scanner(System.in);
	        double nome1;
	        double nome2;
	        char operador;

	        System.out.println("Digite o primeiro numero:");
	        nome1 = Santos.nextDouble();
	        System.out.println("Digite o segundo numero");
	        nome2 = Santos.nextDouble();
	        System.out.println("Digite o operador: + - / *");
	        operador = Santos.next().charAt(0);

	        if(operador == '+') {
	            System.out.printf("O resultado %.2f %c %.2f = %.2f\n", nome1, operador, nome2, nome1 + nome2);
	        }else if(operador == '-'){
	            System.out.printf("O resultado %.2f %c %.2f = %.2f\n", nome1,operador,nome2,nome1-nome2);
	        }else if(operador == '/'){
	            System.out.printf("O resultado %.2f %c %.2f = %.2f\n", nome1,operador,nome2,nome1/nome2);
	        }else if(operador == '*') {
	            System.out.printf("O resultado %.2f %c %.2f = %.2f\n", nome1, operador, nome2, nome1 * nome2);
	        }
	        Santos.close();
	    }
	}
