/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

public class DateAndTime {
    private int month;  //1-12
    private int day;   //1-31 conforme o mes
    private int year;   //qualquer ano
    private int hour;   //horasde 0 a 23
    private int minute;  // minutos de 0 a 59
    private int second;   //segundos de 0 a 59
    //construtor:chama checkMonth para confirmar o valor adequado para month;
    //chama checkDay para para confirmar o valor adequado para day
    public DateAndTime( int theMonth, int theDay, int theYear, int h,int m,int s)
    {
        month = checkMonth( theMonth ); //valida month
        year = theYear; //poderia validar year
        day = checkDay( theDay );  //valida day
        setTime(h,m,s);  //set no tempo
        
    } //fim do constructor Date
    
    //metodo utilitario para confirmar o valor adequado de month
    private int checkMonth( int testMonth )
    {
        if ( testMonth > 0 && testMonth <=12 ) //valida month
            return testMonth;
        else  //month e invalido
        {
            System.out.printf(
                "Invalid month (%d) set to 1.", testMonth );
            return 1;  //mantem o objeto em estado consistente
        } //fim do else
    }  //fim do metodo CheckMonth
    
    /*metodo utilitario para confirmar o valor adequado de day 
    com base em month e year*/
    private int checkDay( int testDay )
    {
        int daysPerMonth[] =
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        //verifica se day esta no intervalo para month
        if ( testDay > 0 && testDay < daysPerMonth[ month ] )
            return testDay;
        
        //verifica ano bissexto
        if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0 )))
            return testDay;
        
        System.out.printf("invalid day (%d) set to 1.", testDay);
        return 1;  //mantem objeto em estado consistente
    }  //fim do metodo checkDay
    
       //faz set para hora, minuto e segundo
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
    } //fim dos sets para hora, minuto e segundo
    //metodos get para obtercao de variaveis
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }  
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    } //fim dos metodos get
    
    /*tick é um somador de segundo que quando estoura soma minutos,
    e se minutos estourarem soma horas.*/
    public void tick(){
        if (getSecond() == 59){
            second = 0;
            incrementMinute();
        }
        else {
            second += 1;
        }
    } //fim do metodo incrementSecond
    //incrementa minuto.
    public void incrementMinute(){
        if ( getMinute() == 59){
            minute = 0;
            incrementHour();
        }
        else{
            minute +=1;
        }
    } //fim do metodo incrementMinute
    
    //incrementa hora.
    public void incrementHour(){
        if ( getHour() == 23 ){
            hour = 0;
            nextDay();
        }
        else{
            hour +=1;
        }
    } //fim do metodo incrementHour
    
    //metodo para incrementacao do dia
    public void nextDay()
    {
        int daysPerMonth[] =
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        //verificando o momento em que se passa um mes
        if (  (day + 1) <= daysPerMonth[ month ] )
            day += 1;
        //considera o dia 29 no ano bissexto
        else if ( month == 2 && (day + 1) == 29 && ( year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0 )))
            day += 1;
        else 
        {
            day = 1;
            nextMonth();
        }
    }  //fim do metodo nextDay
    
    //metodo para incrementar mes
    public void nextMonth()
    {
        //verificando um momento que se passa um ano
        if ( (month + 1) <= 12 )
            month += 1;
        else
        {
            month = 1;
            nextYear();                    
        }
    }  //fim do metodo nextMonth
    
    //metodo para incrementar ano
    public void nextYear()
    {
        year += 1;
    }  //fim do metodo nextYear
    
    //retorna uma String no formato mes/dia/ano
    public String toStringDate()
    {
        return String.format( "%d/%d/%d", month, day, year );
    }  //fim do metodo toString
    /*retorna em formato string de maneira que exista apenas de 1 a 12 horas da 
    manha e noite : hh:mm:ss AM/PM.*/
    public String toStringTime(){
        return String.format("%02d:%02d:%02d %s",
            ((getHour() == 0 || getHour() == 12) ? getHour() : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
