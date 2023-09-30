import java.util.Scanner;

public class Piramide {
    private int N;

    public Piramide(int N) {
        this.N = N;
    }

    public void desenharPiramide() {
        for (int i = 1; i <= N; i++) {
            // Imprimir espaços em branco à esquerda para alinhar a pirâmide
            for (int j = 1; j <= N - i; j++) {
                System.out.print(".");
            }

            // Imprimir asteriscos para o nível atual
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
			  
			  // Imprimir espaços em branco à direita da pirâmide
            for (int l = 1; l <= N - i; l++) {
                System.out.print(".");
            }

            // Ir para a próxima linha
            System.out.println();
        }
    }

    public static void main(String[] args) {
		 	Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // Defina aqui o valor de N para o tamanho da pirâmide desejado

        Piramide piramide = new Piramide(N);
        piramide.desenharPiramide();
    }
}
