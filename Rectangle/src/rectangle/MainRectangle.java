/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 19/03/2018
* programa tem como proposito a criacao de uma  classe(objeto) Rectangle, 
com o objetivo de ser capaz de retornar sua largura e comprimento,
e realizar as contas de perimetro e area de um retangulo qualquer, 
utilizando contrutores.*/
package rectangle;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        //variaveis
        float width, length;
        //Scanner para interacao com o usuario.
        Scanner scan = new Scanner(System.in);
        System.out.println("Teste 1");
        System.out.println("Digite uma largura:");
        //recebendo variavel float.
        width = scan.nextFloat();
        System.out.println("Digite um comprimento:");
        //recebendo variavel float.
        length = scan.nextFloat();
        //criando Rectangle atravez do construtor parametrizado.
        Rectangle r1 = new Rectangle(width, length);
        
        System.out.printf("O retangulo com largura %.2f cm e comprimento de "
            + "%.2f cm tem perimetro %.2f cm e area %.2f cm", (r1.getwidth()),
            (r1.getlength()), (r1.perimetro()), (r1.area()));
        
        System.out.println("Teste 2");
        System.out.println("Digite uma largura:");
        //recebendo variavel float.
        width = scan.nextFloat();
        System.out.println("Digite um comprimento:");
        //recebendo variavel float.
        length = scan.nextFloat();
        //criando Rectangle atravez do construtor parametrizado.
        Rectangle r2 = new Rectangle(width, length);
        /*imprimindo resultados com passagem de parametro utilizando get,
        o perimetro e a area*/
        System.out.printf("O retangulo com largura %.2f cm e comprimento de "
            + "%.2f cm tem perimetro %.2f cm e area %.2f cm", (r2.getwidth()),
            (r2.getlength()), (r2.perimetro()), (r2.area()));
        
    }
    
}
