package model;

public class Calculadora {
    private int num;
    private  int num2;

    public Calculadora(int num,int num2){
        this.num=num;
        this.num2=num2;
    }


    public int Somar(){
        int soma=num+num2;
        return soma;
        
    }
    public int Subtrair(){
        int subt=num-num2;
    
        return subt;
    }
    public int Mult(){
        int mult=num*num2;
        return mult;
    }
    public double Divisao(int num,int num2){
        double div=0;
            if(num2!=0){
            div=(double)num/num2;
            return div;
            }
            else{
                System.out.println("Erro: Divisão por zero!");
                return 0;
        }
    
    }
}
