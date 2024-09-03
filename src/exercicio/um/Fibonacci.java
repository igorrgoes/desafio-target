package exercicio.um;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro(maior ou igual a zero): ");
		int number = input.nextInt(); 
		List<Integer> fiboSeq = new ArrayList<>(); 
		if(number == 0) {
			fiboSeq.add(0);
			System.out.print("A sequência de Fibonacci até o número digitado é: ");
			System.out.println(fiboSeq);
			System.out.println("O número digitado pertence a sequência de Fibonacci");			
		}else if(number == 1) {
			fiboSeq.add(0);
			fiboSeq.add(1);
			System.out.print("A sequência de Fibonacci até o número digitado é: " + fiboSeq + " ou ");
			fiboSeq.add(1);			
			System.out.println(fiboSeq);
			System.out.println("O número digitado pertence a sequência de Fibonacci");			
		}else {
			fiboSeq.add(0);
			fiboSeq.add(1);
			fiboSeq.add(1);	
			while(fiboSeq.get(fiboSeq.size()-1) < number) {
				int nextNumber = fiboSeq.get(fiboSeq.size()-1) + fiboSeq.get(fiboSeq.size()-2); 
				if (nextNumber <= number){					
					fiboSeq.add(nextNumber);
				}else {
					break;
				}
			}			
			System.out.print("A sequência de Fibonacci até o número digitado é: ");
			System.out.println(fiboSeq);
			if(fiboSeq.contains(number)) {
				System.out.println("O número digitado pertence a sequência de Fibonacci");
			}else {
				System.out.println("O número digitado não pertence a sequência de Fibonacci");				
			}
		}		
		input.close();		
	}

}
