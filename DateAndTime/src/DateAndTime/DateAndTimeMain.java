/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 26/03/2018
* programa tem como proposito a junção das classes(objetos) Date e Time, 
tornando-a capaz adicionar dias, meses , anos, horas, minutos e segundos.
utilizando arrays*/
package DateAndTime;
//importa o scanner para obtencao de variaveis
import java.util.Scanner;

public class DateAndTimeMain {
     public static void main(String[] args) {
        //variaveis
        int month, day, year, h, m, s;
        //array contendo dois date and time.
        DateAndTime[] dt = new DateAndTime[2];
        //utilizando scanner para obtencao de variaveis do usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia de inicio");
        //recebendo variavel int.
        day = scan.nextInt();
        System.out.println("Digite o mes de inicio");
        //recebendo variavel int.
        month = scan.nextInt();
        System.out.println("Digite o ano de inicio");
        //recebendo variavel int.
        year = scan.nextInt();
        System.out.println("Digite a hora de inicio");
        //recebendo variavel int.
        h = scan.nextInt();
        System.out.println("Digite o minuto de inicio");
        //recebendo variavel int.
        m = scan.nextInt();
        System.out.println("Digite o Segundo de inicio");
        //recebendo variavel int.
        s = scan.nextInt();
        //criando Dateandtime atravez do construtor parametrizado.
        dt[0] = new DateAndTime(month, day, year, h, m, s);
        //criando Dateandtime atravez do construtor parametrizado.
        dt[1] = new DateAndTime(month, day+1, year, 0, 0, 0);
        //primeiro print para testar o metodo toString.
        System.out.printf("Data: %s e hora: %s" , dt[0].toStringDate(),
                dt[0].toStringTime());
        /*um teste parecido com um calendario que corre de uma data a outra*/
        while (dt[0].getDay() != dt[1].getDay() 
                || dt[0].getMonth() != dt[1].getMonth() 
                || dt[0].getYear() != dt[1].getYear() 
                || dt[0].getHour() != dt[1].getHour() 
                || dt[0].getMinute() != dt[1].getMinute()
                || dt[0].getSecond() != dt[1].getSecond()){
            dt[0].tick();
            System.out.printf("Data: %s e hora: %s" , dt[0].toStringDate(), 
                    dt[0].toStringTime());
        }
    }
}
