import java.util.Scanner;

class  QuadradoDePares{
    private int num;
    
    public QuadradoDePares(int num){
        setNum(num);
        
    }
    
    public int getNum(){
        return this.num;
        
    }
    
    public void setNum(int num){
        this.num = num;
        
    }
    
    public void quadradoDePares(){
        int cont = 1;
        
        while(cont <= getNum()){
            if(cont % 2 == 0){
                int quadrado = cont * cont;
                System.out.println(quadrado);
                
            }
            cont++;
        }
    }
    
}

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        
        QuadradoDePares pares = new QuadradoDePares(num);
        
        pares.quadradoDePares();
    }
}