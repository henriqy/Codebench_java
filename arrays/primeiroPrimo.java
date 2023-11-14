import java.util.Scanner;

class Vetor{
	private int[] vet;
	private int tamanho;
	
	public Vetor(){
		this.setTamanho(7);
		vet = new int[this.getTamanho()];
	
	}
	
	public int getElemento(int index){
		return this.vet[index];
		
	}
	
	public void setElemento(int index, int valor){
		this.vet[index] = valor;
		
	}
	
	public int getTamanho(){
		return this.tamanho;
		
	}
	
	public void setTamanho(int valor){
		this.tamanho = valor;
		
	}
	
	public void inicializaManual(){
		int valor;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < this.getTamanho(); i++){
			valor = scan.nextInt();
			setElemento(i, valor);
		}
	}
	
	public boolean ehPrimo(int num){
		if(num <= 1){
			return false;
		}
		
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return false;
				
			}
		}
		
		return true;
	}
	
	public void imprimePrimeiroPrimo(){
		for(int i = 0; i < this.getTamanho(); i++){
			if(ehPrimo(getElemento(i))){
				System.out.println(getElemento(i));
				return;	
			}
		}	
		
		 System.out.println("-1");
	}
	
}

public class main{
	public static void main(String[] args){
		Vetor primo = new Vetor();
		
		primo.inicializaManual();
		primo.imprimePrimeiroPrimo();
	}
}