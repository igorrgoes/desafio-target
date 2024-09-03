package exercicio.dois;

import java.util.Scanner;

public class verificaString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String isThereA = input.nextLine().toLowerCase();
		char[] arrayIsThereA = isThereA.toCharArray();
		int countAs = 0;
		for(int i = 0; i < arrayIsThereA.length;i++) { 
			if((arrayIsThereA[i]) == 'a'){
				countAs++; 				  
			}
		}
		if(countAs > 0) {
			System.out.printf("A String digitada possui %d letra(s) A(s)", countAs);
		}else {
			System.out.println("A String digitada não possui a letra A");
		}
		input.close();			 
	}
	
}
