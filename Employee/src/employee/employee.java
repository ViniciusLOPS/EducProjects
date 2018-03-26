
package employee;
//criando classe
public class employee {

    //utilizando metodos set e get para a obtenção e utilização dos atributos, o public consegue acessar o private.
    public void setNome(String nome_employee)
    {
        nome = nome_employee;
    }
    public void setSobrenome(String sobrenome_employee)
    {
        sobrenome = sobrenome_employee;
    }
    public void setSalario(double salario_employee)
    {
        if (salario_employee > 0)
        {
            salario = salario_employee;
        }
        else
        {
            salario = 0;
        }
    }
    public String getNome()
    {
        return nome;
    }
    public String getSobrenome()
    {
        return sobrenome;
    }
    public double getSalario()
    {
        return salario;
    }
    //metodo para que o empregado receba um aumento de 10% em seu salario.
    void aumento10()
    {
        this.salario = salario*1.1;
    }
    //private é bom para guardar os atributos de modo organizado.
    private String nome;
    private String sobrenome;
    private double salario;
    
}
