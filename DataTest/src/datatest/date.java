package datatest;

//criando classe
public class date {
    //utilizando metodos set e get para a obtenção e utilização dos atributos, o public consegue acessar o private.
    //mes contem até o mes 12 portanto maior que 0 menor que 13.
    public void setMes(int mes)
    {
        if (mes > 0 && mes < 13){
            month = mes;
        //de certa forma se o usuario digitar errado auto corrigira ao primeiro mes do ano.
        }else{
            month = 1;
        }
    }
    //dia é dependente do mes, e em raros casos(fevereiro mes 2) depende do ano ser bissexto ou não.
    public void setDia(int dia)
    {
        if (month == 2)
        {
            //ano bissexto.
            if (year % 4 == 0)
            {
                if (dia > 0 && dia < 30)
                {
                    day = dia;
                }
                else
                {
                    day = 1;
                }
            }
            //mes de fevereiro sem ano bissexto.
            else 
            {
                if (dia > 0 && dia < 29)
                {
                    day = dia;
                }
                else
                {
                    day = 1;
                }
            }
        }
        //meses com 30 dias.
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            if (dia > 0 && dia < 31)
            {
                day = dia;
            }
            else
            {
                day = 1;
            }
        }
        //meses com 31 dias.
        else
        {
            if (dia > 0 && dia < 32)
            {
                day = dia;
            }
            else
            {
                day = 1;
            }
        }
    }
    //ano é de certa forma ilimitado, considerei como somente anos depois de cristo porque afinal o cout so contera números e barras.
    public void setAno(int ano)
    {
        if (ano >= 0)
        {
            year = ano;
        }
        else
        {
            year = ano*(-1);
        }
    }
    public int getMes()
    {
        return month;
    }
    public int getDia()
    {
        return day;
    }
    public int getAno()
    {
        return year;
    }
    //private é bom para guardar os atributos de modo organizado.
    private int month;
    private int day;
    private int year;
    
}
