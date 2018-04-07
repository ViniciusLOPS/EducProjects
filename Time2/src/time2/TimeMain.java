/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 19/03/2018
* programa tem como proposito a modificacao de uma  classe(objeto) Time2, 
tornando-a capaz adicionar segundos, minutos e horas, 
utilizando contrutores.*/
package time2;
import java.util.Scanner;
public class TimeMain {

    public static void main(String[] args) {
        //Scanner para interacao com o usuario.
        Scanner scan = new Scanner(System.in);
        //variaveis
        int h, m, s ,hf, mf, sf;
        System.out.println("Digite a hora de começo");
        //recebendo variavel int.
        h = scan.nextInt();
        System.out.println("Digite o minuto");
        //recebendo variavel int.
        m = scan.nextInt();
        System.out.println("Digite o Segundo");
        //recebendo variavel int.
        s = scan.nextInt();
        //criando Time2 atravez do construtor parametrizado.
        Time2 t1 = new Time2(h, m, s);
        System.out.println("Digite a hora de finalização do programa");
        //recebendo variavel int.
        hf = scan.nextInt();
        System.out.println("Digite o minuto");
        //recebendo variavel int.
        mf = scan.nextInt();
        System.out.println("Digite o Segundo");
        //recebendo variavel int.
        sf = scan.nextInt();
        //criando Time2 atravez do construtor parametrizado.
        Time2 t2 = new Time2(hf, mf, sf);
        //primeiro print para testar a string universal.
        System.out.println("Hora:" + t1.toUniversalString());
        /*um teste parecido com um relogio so que sem delay de segundos,
        me pareceu um metodo eficiente para testes de incrementacao,
        ele percorre da primeira hora digitada ate a segunda hora*/
        while (t1.getHour() != t2.getHour() || t1.getMinute() != t2.getMinute()
                || t1.getSecond() != t2.getSecond()){
            t1.tick();
            System.out.println("Hora:" + t1.toString());
        }        
        
    }
    
}
