package prova;
import java.util.Scanner;
public class Prova {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
float salario = 0, media_num_filhos = 0, renda_familiar = 0, maior_renda_f = 0, menor_renda_f = 0, maior_salario = 0, menor_salario = 0, perct_1500 = 0;
float num_filhos = 0;
int contador = 0;
boolean primeiraI = true;

while (true) {
System.out.println("Digite o salario do marido: ");
salario = scan.nextFloat();
if (salario == -1) {
break;
}
renda_familiar += salario;
if (salario < 1500.00) {
perct_1500++;
}
if (primeiraI || salario > maior_salario) {
maior_salario = salario;
}
if (primeiraI || salario < menor_salario) {
menor_salario = salario;
}

System.out.println("Digite o salario da esposa: ");
salario = scan.nextFloat();
if (salario == -1) {
break;
}

if (salario < 1500.00) {
perct_1500++;
}
if (primeiraI || salario > maior_salario) {
maior_salario = salario;
}
if (primeiraI || salario < menor_salario) {
menor_salario = salario;
}

System.out.println("Digite o número de filhos: ");
num_filhos = scan.nextFloat();
media_num_filhos += num_filhos;

renda_familiar = (renda_familiar+salario)/(2+num_filhos);

if (primeiraI || renda_familiar > maior_renda_f) {
maior_renda_f = renda_familiar;
}
if (primeiraI || renda_familiar < menor_renda_f) {
menor_renda_f = renda_familiar;
}

contador++;

primeiraI = false;
}

media_num_filhos /= contador;

System.out.println("Media de renda familiar: " + (renda_familiar / contador));
System.out.println("Media do número de filhos por familia: " + media_num_filhos);
System.out.println("Maior renda familiar: " + maior_renda_f);
System.out.println("Menor renda familiar: " + menor_renda_f);
System.out.println("Maior salario individual: " + maior_salario);
System.out.println("Menor salario individual: " + menor_salario);
System.out.println("Percentual de pessoas com salario menor que R$ 1500.00: " + ((perct_1500 / (contador * 2)) * 100) + "%");
}
}