import java.util.Scanner;

class Vetor{
	private int[] vet;
	private int tamanho;
	
	public Vetor(){
		this.setTamanho(10);
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
	
	public void imprimeProdutoEscalar(Vetor v2){
		int produto = 0;
		
		for(int i = 0; i < this.getTamanho(); i++){
			produto += getElemento(i) * v2.getElemento(i);	
			
		}
		System.out.print(produto);
		
	}
}

public class main{
	public static void main(String[] args){
		Vetor v1 = new Vetor();
		Vetor v2 = new Vetor();

		v1.inicializaManual();
		v2.inicializaManual();
		
		v1.imprimeProdutoEscalar(v2);
		
	}
}