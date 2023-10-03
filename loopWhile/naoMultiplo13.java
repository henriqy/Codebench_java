import java.util.Scanner;

class NaoMultiplo{
    private int v1, v2;
    
    public  NaoMultiplo(int v1, int v2){
        setV1(v1);
        setV2(v2);
    }
    
    public int getV1(){
        return this.v1;
        
    }
    
    public void setV1(int v1){
        this.v1 = v1;
        
    }
    
    public int getV2(){
        return this.v2;
        
    }
    
    public void setV2(int v2){
        this.v2 = v2;
        
    }
    
    public void soma(){
        int soma = 0;
        
        while(getV1() <= getV2()){
            if((getV1() % 13 != 0) ){
                soma += getV1();
            }
            
            this.v1++;
        }
        
        System.out.println(soma);
        
    } 
}

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        
        NaoMultiplo somaMulti = new NaoMultiplo(v1, v2);
        
        somaMulti.soma();
        
        
    }
}