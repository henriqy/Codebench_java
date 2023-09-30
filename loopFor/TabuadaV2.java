import java.util.Scanner;

public class Tabuada {
    private int N;
    private int Q;

    public Tabuada(int N, int Q) {
        this.N = N;
        this.Q = Q;
    }
	
    public void imprimirTabuada() {
		 // Imprime o cabeçalho da tabuada com os números de N a Q
        System.out.print(" |");
        for (int i = N; i <= Q; i++) {
            System.out.printf("%3d", i);
			  
        }
		 // Pula para a próxima linha
        System.out.println();
		// Loop externo para iterar sobre os números de N a Q
        for (int i = N; i <= Q; i++) {
            System.out.printf("%d|", i);// Imprime o número atual seguido de "|"
			  
			  // Loop interno para calcular e imprimir os resultados da tabuada
            for (int j = N; j <= Q; j++) {
                int resultado = i * j;
                System.out.printf("%3d", resultado);// Formata o resultado
            }
            System.out.println();// Pula para a próxima linha após uma linha de resultados
        }
    }

    public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
        int N = scan.nextInt();
        int Q = scan.nextInt();

        Tabuada tabuada = new Tabuada(N, Q);
        tabuada.imprimirTabuada();
    }
}
