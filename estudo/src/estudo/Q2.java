package estudo;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	int soma,a,b;

	Scanner input = new Scanner(System.in);   
    try {                                      
        a = input.nextInt();
        b = input.nextInt();
    } finally {                               
        input.close();                         
    }
    soma=a+b;
    System.out.println(soma);
}
}
