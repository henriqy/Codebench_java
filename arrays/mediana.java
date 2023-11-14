import java.util.Scanner;

class Vetor{
	private int[] vet;
	private int tamanho;
	
	public Vetor(){
		this.setTamanho(11);
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
			this.setElemento(i, valor);
		}
	}
	
	public int achaMediana(){
		for(int i = 0; i < this.getTamanho(); i++){
			int contMenor = 0;
			int contMaior = 0;
			
			for(int j = 0; j < this.getTamanho(); j++){
				if(this.getElemento(j) < this.getElemento(i)){
					contMenor++;
				}else {
					contMaior++;
				}
			}
			
			if((contMaior == contMenor) || (contMenor + 1 == contMaior) || (contMaior + 1 == contMenor)){
				return this.getElemento(i);
			}
		}
		return -1;
	}
	
	public void print(){
		System.out.println(achaMediana());
		
		for(int i = 0 ; i < this.getTamanho(); i++){
			System.out.print(this.getElemento(i) + " ");
		}
	}
}

public class main{
	public static void main(String[] args){
		Vetor v1 = new Vetor();
		
		v1.inicializaManual();
		v1.achaMediana();
		v1.print();
	}
}