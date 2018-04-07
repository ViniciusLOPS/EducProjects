/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 19/03/2018
* programa tem como proposito a criacao de uma  classe(objeto) Rectangle, 
com o objetivo de ser capaz de retornar sua largura e comprimento,
e realizar as contas de perimetro e area de um retangulo qualquer, 
utilizando contrutores.*/
package rectangle;

public class Rectangle {
    //construtor padrao.
    public Rectangle(){
        width = 1;
        length = 1;
    }
    //construtor com passagem de parametros.
    public Rectangle(float width, float length){
        setwidth(width);
        setlength(length);
    }
    //metodos set para controlar o valor da variavel(0 a 20).
    public void setwidth( float width){
        if(width > 0.0 && width < 20.0){
            this.width = width;
        }
        else{
            this.width = 1;
        }
    }
    public void setlength( float length){
        if(length > 0.0 && length < 20.0){
            this.length = length;
        }
        else{
            this.length = 1;
        }
    }
    //metodos get.
    public float getwidth(){
        return width;
    }
    public float getlength(){
       return length;
    }
    //calculo de perimetro.
    public float perimetro(){
        return (width*2) + (length*2);
    }
    //calculo de area.
    public float area(){
        return width* length;
    }
    //variaveis.
    private float width;
    private float length;
    
}
