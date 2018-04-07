/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 19/03/2018
* programa tem como proposito a criacao de uma  classe(objeto) Rational, 
com o objetivo de ser capaz de interagir com numeros racionais,
simplificando -os, realizando as 4 operações matematicas e devolvendo
o resultado no formato racional e float com limite de 1 a 5 numeros depois
da virgula, utilizando contrutores.*/
package rational;
import java.util.Scanner;

public class MainRational {

    public static void main(String[] args) {
        //variaveis
        int n, d, e, m;
        //Scanner para interacao com o usuario.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numerador:");
        //recebendo variavel int.
        n = scan.nextInt();
        System.out.println("Digite o denominador:");
        //recebendo variavel int.
        d = scan.nextInt();
        //criando Rational atravez do construtor parametrizado.
        Rational r1 = new Rational(n, d);
        //simplificando o racional.
        r1.toSimplifica();
        System.out.println("Digite o numerador:");
        //recebendo variavel int.
        n = scan.nextInt();
        System.out.println("Digite o denominador:");
        //recebendo variavel int.
        d = scan.nextInt();
        //criando Rational atravez do construtor parametrizado.
        Rational r2 = new Rational(n, d);
        //simplificando o racional.
        r2.toSimplifica();
        System.out.println("o que fazer:");
        System.out.println("1-somar");
        System.out.println("2-subtrair");
        System.out.println("3-Dividir");
        System.out.println("4-Multiplicar");
        System.out.println("5...- Somente printar os numeros Racionais");
        //recebendo variavel int para decisao no switch.
        e = scan.nextInt();
        Rational result;
        //switch para escolher o que fazer com os dois racionais.
        switch (e) {
            //somar.
            case 1:
                result = r1.toAdiciona(r2.getNumerator(), r2.getDenominator());
                System.out.println("Numeros depois da virgula( 1 a 5 ):");
                m = scan.nextInt();
                System.out.println("O numero racional simplificado e: " + result.toString());
                result.toStringFloat(m);
                break;
            //subtrair.
            case 2:
                result = r1.toSubtrai(r2.getNumerator(), r2.getDenominator());
                System.out.println("Numeros depois da virgula( 1 a 5 ):");
                m = scan.nextInt();
                System.out.println("O numero racional simplificado e: " + result.toString());
                result.toStringFloat(m);
                break;
            //dividir.
            case 3:
                result = r1.toDivisor(r2.getNumerator(), r2.getDenominator());
                System.out.println("Numeros depois da virgula( 1 a 5 ):");
                m = scan.nextInt();
                System.out.println("O numero racional simplificado e: " + result.toString());
                result.toStringFloat(m);
                break;
            //multiplicar.
            case 4:
                result = r1.toMultiplicar(r2.getNumerator(), r2.getDenominator());
                System.out.println("Numeros depois da virgula( 1 a 5 ):");
                m = scan.nextInt();
                System.out.println("O numero racional simplificado e: " + result.toString());
                result.toStringFloat(m);
                break;
            //so printar os dois racionais.
            default:
                System.out.println("Numeros depois da virgula( 1 a 5 ):");
                m = scan.nextInt();
                System.out.println("O numero racional simplificado e: " + r1.toString());
                r1.toStringFloat(m);
                System.out.println("O numero racional simplificado e: " + r2.toString());
                r2.toStringFloat(m);
                break;
        }
     
    }
    
}
