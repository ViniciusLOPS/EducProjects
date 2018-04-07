package datatest;

import java.util.Scanner;

public class DataTest {

    
    public static void main(String[] args) {
        //criando variaveis para utilização de set/get.
	int dia, mes, ano;
        //criando scaner.
        Scanner scan = new Scanner(System.in);
	//criando a data.
	date d1 = new date();
	//utilização de uma interação com o usuario para a obtenção de variaveis.
	System.out.println("Digite o Mes");
	mes = scan.nextInt();
        //limpando
        scan.nextLine();
	System.out.println("Digite o Dia");
	dia = scan.nextInt();
        //limpando
        scan.nextLine();
	System.out.println("Digite o Ano");
	ano = scan.nextInt();
        //limpando
        scan.nextLine();
	//salvando com metodo set
	d1.setMes(mes);
	d1.setAno(ano);
	d1.setDia(dia);
	
	//saida com os resultados obtidosde acordo com datas americanas, mes/dia/ano.
	System.out.println("The date is(americana): " + d1.getMes() + "/" + d1.getDia() + "/" + d1.getAno());
        
    }
    
}
