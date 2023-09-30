import java.util.Scanner;

class Loop1{
	private int num;
	
	public int getNum(){
		return num;
	
	}
	
	public void setNum(int num){
		this.num = num;
		
	}
	
	public void loop(){
		for(int i = 0; i <= getNum(); i++){
			System.out.print(i + " ");
			
		}
		
	}
}

public class main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		Loop1 compila = new Loop1();
		
		compila.setNum(num);
		
		compila.loop();
	}
}