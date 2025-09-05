import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner oT = new Scanner(System.in);
	
	double salarioB;
	double salarioL;
	double desconto;
	
	System.out.println("Digite seu salario: ");
	salarioB = oT.nextDouble();
	
	salarioL = (salarioB /100)*8;
	
	System.out.println("Seu salario líquido é: " + salarioL);

	}
};