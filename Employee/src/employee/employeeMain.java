package employee;
//para a utilização do scanner.
import java.util.Scanner;

public class employeeMain {
    
    public static void main(String[] args) {
        //criando variaveis para utilização de set/get.
	String nome;
	String sobrenome;
	double salario;
        //criando scanner.
        Scanner scan = new Scanner(System.in);
	//criando 2 empregados para teste.
	employee e1 = new employee();
	employee e2 = new employee();
	//utilização de uma interação com o usuario para a obtenção de variaveis.
	System.out.println("Digite o Nome do Funcionario 1");
	nome = scan.nextLine();
	System.out.println("Digite o Sobrenome do Funcionario 1");
	sobrenome =  scan.nextLine();
	System.out.println("Digite o Salario do Funcionario 1");
	salario =  scan.nextDouble();
        //passando para a proxima linha.
        scan.nextLine();
	//salvando com metodo set
	e1.setNome(nome);
	e1.setSobrenome(sobrenome);
	e1.setSalario(salario);
	//utilização de uma interação com o usuario para a obtenção de variaveis.
	System.out.println("Digite o Nome do Funcionario 2");
	nome = scan.nextLine();
	System.out.println("Digite o Sobrenome do Funcionario 2");
	sobrenome =  scan.nextLine();
	System.out.println("Digite o Salario do Funcionario 2");
	salario =  scan.nextDouble();
        //passando para a proxima linha.
        scan.nextLine();
	//salvando com metodo set.
	e2.setNome(nome);
	e2.setSobrenome(sobrenome);
	e2.setSalario(salario);
	//saida com os resultados obtidos.
        //printf para limitação de numeros pós virgula.
	System.out.println("O Funcionario: " + e1.getNome() + " " + e1.getSobrenome());
	System.out.printf("Recebe: R$%.2f Mensais %n", (e1.getSalario()));
	System.out.printf("Recebe: R$%.2f Anuais %n", (e1.getSalario()*12));
	//saida com os resultados obtidos.
	System.out.println("O Funcionario: " + e2.getNome() + " " + e2.getSobrenome());
	System.out.printf("Recebe: R$%.2f Mensais %n", (e2.getSalario()));
	System.out.printf("Recebe: R$%.2f Anuais %n", (e2.getSalario()*12));
	//dando um aumento para ambos os funcionarios.
	e1.aumento10();
	e2.aumento10();
	//saida com os resultados obtidos apos aumento.
	System.out.println("O Funcionario: " + e1.getNome() + " " + e1.getSobrenome());
	System.out.printf("Agora recebe: R$%.2f Anuais %n", (e1.getSalario()*12));
	//saida com os resultados obtidos apos aumento.
	System.out.println("O Funcionario: " + e2.getNome() + " " + e2.getSobrenome());
	System.out.printf("Agora recebe: R$%.2f Anuais %n", (e2.getSalario()*12));
    }
}
