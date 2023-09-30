package loopFor;
import java.util.Scanner;

class Fatorial{
	private int num;
	
	public int getNum(){
		return this.num;
		
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public void calculaFatorial(){
		int fatorial = 1;
		for(int i = 0; i <= getNum(); i++){
			fatorial *= i;
			
		}
		
		System.out.println("Fatorial de " + getNum() + ": " + fatorial);
		
	}
}

public class main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		Fatorial calcula = new Fatorial();
		
		
		calcula.calculaFatorial(num);
	}
}