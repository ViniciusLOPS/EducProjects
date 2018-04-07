/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 19/03/2018
* programa tem como proposito a modificacao de uma  classe(objeto) Time2, 
tornando-a capaz adicionar segundos, minutos e horas, 
utilizando contrutores.*/
package time2;

public class Time2 {
    //variaveis
    private int hour;
    private int minute;
    private int second;
    //construtor padrao.
    public Time2(){
        this(0,0,0);
    }
    //construtor passando apenas um parametro.
    public Time2(int h){
        this(h,0,0);
    }
    //construtor passando apenas dois parametros.
    public Time2(int h, int m){
        this(h,m,0);
    }
    //construtor passando todos os parametros.
    public Time2(int h,int m,int s){
        setTime(h,m,s);
    }
    //construtor passando um objeto Time2 como parametro.
    public Time2(Time2 time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }
    //metodos set.
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = (( h >= 0 && h < 24 ) ? h : 0 );
    }
    public void setMinute(int m){
        minute = (( m >= 0 && m < 60 ) ? m : 0 );
    }
    public void setSecond(int s){
        second= (( s >= 0 && s < 60 ) ? s : 0 );
    }
    //metodos get
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    //retorna em formato string de forma universal: hh:mm:ss.
    public String toUniversalString(){
        return String.format(
            "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    /*retorna em formato string de maneira que exista apenas de 1 a 12 horas da 
    manha e noite : hh:mm:ss AM/PM.*/
    public String toString(){
        return String.format("%02d:%02d:%02d %s",
            ((getHour() == 0 || getHour() == 12) ? getHour() : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
    /*tick é um somador de segundo que quando estoura soma minutos,
    e se minutos estourarem soma horas.*/
    public void tick(){
        if (getSecond() == 59 && getMinute() != 59){
            second = 0;
            incrementMinute(); 
        }
        else if (getSecond() == 59 && getMinute() == 59 && getHour() !=23){
            second = 0;
            incrementMinute();
            incrementHour();
        }
        else if (getSecond() == 59 && getMinute() == 59 && getHour() ==23){
            second = 0;
            incrementMinute();
            incrementHour();
        }
        else {
            second += 1;
        }
    }
    //incrementa minuto.
    public void incrementMinute(){
        if ( getMinute() == 59){
            minute = 0;
        }
        else{
            minute +=1;
        }
    }
    //incrementa hora.
    public void incrementHour(){
        if ( getHour() == 23 ){
            hour = 0;
        }
        else{
            hour +=1;
        }
    }
}