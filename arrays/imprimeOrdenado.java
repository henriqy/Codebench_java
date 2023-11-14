import java.util.Scanner;

class Vetor{
	private int[] vet;
	private int tamanho;
	
	public Vetor(){
		this.setTamanho(6);
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
		Scanner scan = new Scanner(System.in);
		int valor;
		
		for(int i = 0; i < this.getTamanho(); i++){
			valor = scan.nextInt();
			setElemento(i, valor);
			
		}
		
	}
	
	public void  ImpressaoOrdenada(){
		int aux;
		for(int i = 1; i < this.getTamanho(); i++){
			for(int j = 0; j < i; j++){
				if(this.getElemento(j) > this.getElemento(i)){
					aux = getElemento(j);
					setElemento(j, this.getElemento(i));
					setElemento(i,aux);
				}
			}
			
		}
		
	}
	
	public void imprime(){
		
		
		for(int i = 0; i < this.getTamanho(); i++){
			System.out.println(this.getElemento(i));
		}
	}
}

public class main{
	public static void main(String[] args){
		Vetor ordem = new Vetor();
		
		ordem.inicializaManual();
		ordem.ImpressaoOrdenada();
		ordem.imprime();
	}
}