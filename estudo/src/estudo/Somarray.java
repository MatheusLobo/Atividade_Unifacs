package estudo;

public class Somarray {
public static void main(String[] args) {
	int[] t = {1,2,3,4,5,6,7,8,9,10};
	int soma=0;
		for (int i=0;i<t.length;i++) {
			soma=t[i]+soma;
		}
		System.out.println(soma);
}
}
