import java.util.Scanner;

class TabuadaV1{
	private int num;
	
	public int getNum(){
		return num;
	
	}
	
	public void setNum(int num){
		this.num = num;
		
	}
	
	public void tabuada(){
		for(int i = 0; i <= getNum(); i++){
			int multiplica = getNum() * i;
			
			System.out.println(getNum() + " x " + i + " = " + multiplica );
			
		}
		
	}
}

public class main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		TabuadaV1 compila = new TabuadaV1();
		
		compila.setNum(num);
		
		compila.tabuada();
	}
}