package estudo;

public class Cres {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 78;
        int num3 = 87;

     /*  Scanner input = new Scanner(System.in);   
        try {                                      
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
        } finally {                               
            input.close();                         
        }
*/
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " é o maior número.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " é o maior número.");
        } else {
            System.out.println(num3 + " é o maior número.");
        }
    }
}

