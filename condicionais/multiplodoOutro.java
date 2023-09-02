import java.util.Scanner;

class Multiplos{
	private int num1, num2;
	
	public Multiplos(int num1, int num2){
		setNum1(num1);
		setNum2(num2);
		
	}
	
	public int getNum1(){
		return this.num1;
		
	}
	
	public void setNum1(int num1){
		this.num1 = num1;
		
	}
	
	public int getNum2(){
		return this.num2;
		
	}
	
	public void setNum2(int num2){
		this.num2 = num2;
		
	}
	
	public void acharMultiplo(){
		if(getNum1() > getNum2()){
			
			if(getNum1() % getNum2() == 0){
				System.out.println("Numero " + getNum1() + " eh multiplo de " + getNum2());
			}
			
		}else if(getNum2() > getNum1() ){
			
			if(getNum2() % getNum1() == 0){
				System.out.println("Numero " + getNum2() + " eh multiplo de " + getNum1());
			}
		}
		System.out.println("The last mission is over");
	}
}

public class main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		Multiplos encontra = new Multiplos(num1, num2);
		
		encontra.acharMultiplo();
	}
}