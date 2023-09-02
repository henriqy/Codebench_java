import java.util.Scanner;

class Algarismos{
	private int num;
	
	public Algarismos(int num){
		setNum(num);
		
	}
	
	public int getNum(){
		return this.num;
		
	}
	
	public void setNum(int num){
		this.num = num;
		
	}
	
	public void somaAlgarismos(){
		if(getNum() % 2 == 0){
			
			int centena = getNum()/100;
			int dezena = (getNum()/10) % 10;
			int unidade = getNum() % 10;
			int soma = centena + dezena + unidade;
			
			System.out.println("Numero " + getNum() + " eh par e a soma dos seus algarismos eh " + soma);
		} 
		System.out.println("Bye Bye");
		
	}	
}

public class main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		Algarismos soma = new Algarismos(num);
		
		soma.somaAlgarismos();
	}
}