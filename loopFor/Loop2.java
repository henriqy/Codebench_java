import java.util.Scanner;

class Loop2{
	private int num1, num2;
	
	public int getNum1(){
		return num1;
	
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
	
	public void loop(){
		int maior = getNum1();
		if(maior < getNum2()){
			maior = getNum2();
			
			for(int i = getNum1(); i <= maior ; i++){
			System.out.print(i + " ");

			}
			
		}else{
			for(int i = maior; i >= getNum2(); i--){
				System.out.print(i + " ");
			}
		}
		
		
	}
}

public class main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		Loop2 compila = new Loop2();
		
		compila.setNum1(num1);
		compila.setNum2(num2);
		
		compila.loop();
	}
}