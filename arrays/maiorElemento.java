import java.util.Scanner;

class Vetor{
	private int[] vet;
	private int tamanho;
	
	public Vetor(){
		this.setTamanho(5);
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
		int cont, valor;
		
		Scanner scan = new Scanner(System.in);
		
		for(cont = 0; cont < this.getTamanho(); cont++){
			valor = scan.nextInt();
			this.setElemento(cont, valor);
			
		}
		
	}
	
	public void imprimeMaior50(){
		for(int i = 0; i < this.getTamanho(); i++){
			if(this.getElemento(i) > 50){
				System.out.println(this.getElemento(i));
			}
			
			
		}
	}
}

public class main{
	public static void main(String[] args){
		Vetor maiorElemento = new Vetor();
		
		maiorElemento.inicializaManual();
		maiorElemento.imprimeMaior50();
		
	}
}