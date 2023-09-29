import java.util.Scanner;

class Numero {
    private int num1, num2, num3;

    public Numero(int num1, int num2, int num3) {
        setNum1(num1);
        setNum2(num2);
        setNum3(num3);
    }

    public int getNum1() {
        return this.num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return this.num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public void ordemDecrescente() {
        int aux;
        if (getNum1() < getNum2()) {
            aux = getNum1();
            setNum1(getNum2());
            setNum2(aux);
        }

        if (getNum1() < getNum3()) {
            aux = getNum1();
            setNum1(getNum3());
            setNum3(aux);
        }

        if (getNum2() < getNum3()) {
            aux = getNum2();
            setNum2(getNum3());
            setNum3(aux);
        }
		 
		 System.out.println( getNum1() + " " + getNum2() + " " + getNum3());
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        Numero ordem = new Numero(num1, num2, num3);
        ordem.ordemDecrescente();

    }
}
