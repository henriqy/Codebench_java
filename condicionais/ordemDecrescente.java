import java.util.Scanner;

class Numero{
	private int n1, n2, n3;
	
	public  Numero(int n1, int n2, int n3){
		setN1(n1);
		setN2(n2);
		setN3(n3);
		
	}
	
	public int getN1(){
		return this.n1;
		
	}
	
	public void setN1(int n1){
		this.n1 = n1;
		
	}
	
	public int getN2(){
		return this.n2;
			
	}
	
	public void setN2(int n2){
		this.n2 = n2;
		
	}
	
	public int getN3(){
		return this.n3;
		
	}
	
	public void setN3(int n3){
		this.n3 = n3;
		
	}
	
	public void ordemCrescente(){
		int aux;
		
		if(getN1() > getN2()){
			aux = getN1();
			setN1(getN2());
			setN2(aux);
			
		}
		
		if(getN1() > getN3()){
			aux = getN1();
			setN1(getN3());
			setN3(aux);
			
		}
		
		if(getN2() > getN3()){
			aux = getN2();
			setN2(getN3());
			setN3(aux);
			
		}
		
		System.out.println(getN1() + " " + getN2() + " " + getN3());
		
	}
}

public class main{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		Numero ordem = new Numero(n1, n2, n3);
		
		ordem.ordemCrescente();
	}
	
	
}