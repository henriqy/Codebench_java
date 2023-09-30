import java.util.Scanner;

class Loop3 {
    private int num;

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void calcula() {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < getNum(); i++) {
            if (i >= 0 && i <= 100) {
                a++;
            } else if (i >= 101 && i <= 200) {
                b++;
            } else {
                c++;
            }
        }

        System.out.println("Entre 0 e 100: " + a);
        System.out.println("Entre 101 e 200: " + b);
        System.out.println("Maior que 200: " + c);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        Loop3 loop = new Loop3();
        loop.setNum(num);

        loop.calcula();

        scan.close();
    }
}
