/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 19/03/2018
* programa tem como proposito a criacao de uma  classe(objeto) Rational, 
com o objetivo de ser capaz de interagir com numeros racionais,
simplificando -os, realizando as 4 operações matematicas e devolvendo
o resultado no formato racional e float com limite de 1 a 5 numeros depois
da virgula, utilizando contrutores.*/
package rational;

public class Rational {
    //variaveis
    private int numerator;
    private int denominator;
    //menor denominador comum.
    private int menord;
    //resultado em float, numero quebrado.
    private double numeratorf;
    //construtor padrao.
    public Rational(){
        numerator = 1;
        denominator = 1;
    }
    //construtor parametrizado.
    public Rational(int n,int d){
        numerator = n;
        denominator = d;
    }
    //metodos set.
    public void setNumerator(int n){
        numerator = n;
    }
    public void setDenominator(int d){
        denominator = d;
    }
    //metodos get.
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    //simplificador de racionais.
    public void toSimplifica(){
       for (int i = 1000000; i > 0; i--){
            if (numerator % i == 0 && denominator % i == 0){
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
    }
    /*calculo de Mmc para assistentar na adicao e subtracao 
    de numeros racionais.*/
    public int calculoMmc(int d){
        //calculo de Mmc
        int i,j, denominatortest;  
        j = 1;
        denominatortest = denominator;
        if(denominatortest == d){  
            j = denominatortest;  
        }else{  
            for (i=2;((denominatortest > 1) || (d > 1)); i++) {  
                while(((denominatortest % i) == 0) || ((d % i) == 0)){  
                    if((denominatortest % i) == 0){  
                       denominatortest = denominatortest/i;      
                    }  
                    if((d % i) == 0){  
                       d = d/i;  
                    }  
                    j = j * i;  
               }  
           }  
        } 
        return j;
    }
    //metodo para soma de racionais e ja manda pro simplificador.
    public Rational toAdiciona(int n, int d){
        menord = calculoMmc(d);
        n = ((menord / denominator)* numerator) + ((menord / d)* n);
        d = menord;
        Rational result = new Rational(n, d);
        result.toSimplifica();
        //retornando resultado simplificado como um novo Rational.
        return result;
    }
    //metodo para subtracao de racionais e ja manda pro simplificador.
    public Rational toSubtrai(int n, int d){
        menord =calculoMmc(d);
        n = ((menord / denominator)* numerator) - ((menord / d)* n);
        d = menord;
        Rational result = new Rational(n, d);
        result.toSimplifica();
        //retornando resultado simplificado como um novo Rational.
        return result;
    }
    //metodo para multiplicacao de racionais e ja manda pro simplificador.
    public Rational toMultiplicar(int n, int d){
        n = numerator * n;
        d = denominator * d;
        Rational result = new Rational(n, d);
        result.toSimplifica();
        //retornando resultado simplificado como um novo Rational.
        return result;
    }
    //metodo para divisao de racionais e ja manda pro simplificador.
    public Rational toDivisor(int n, int d){
        int m = n;
        n = numerator * d;
        d = denominator * m;
        Rational result = new Rational(n, d);
        result.toSimplifica();
        //retornando resultado simplificado como um novo Rational.
        return result;
    }
    //devolve uma string no formato desejado: a/b.
    public String toString(){
        return numerator + "/" + denominator;
    }
    /*devolve uma string no formato float com os numeros apos a virgula
    desejados com limite de 5, caso contrario 5 e 3 pontinhos.*/
    public void toStringFloat(int m){
        /*resultado double para aceitar a mudança de uma conta 
        com ints para float.*/
        numeratorf = (numerator*1.0 / denominator*1.0);
        //switch para escolha do usuario.
        switch (m) {
            case 1:
                System.out.printf("O numero racional e: %.1f \n", numeratorf);
                break;
            case 2:
                System.out.printf("O numero racional e: %.2f \n", numeratorf);
                break;
            case 3:
                System.out.printf("O numero racional e: %.3f \n", numeratorf);
                break;
            case 4:
                System.out.printf("O numero racional e: %.4f \n", numeratorf);
                break;
            case 5:
                System.out.printf("O numero racional e: %.5f \n", numeratorf);
                break;
            default:
                System.out.printf("O numero racional e: %.5f...\n", numeratorf);
                break;
        }
    }
    
}
