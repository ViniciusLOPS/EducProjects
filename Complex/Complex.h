/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 22/03/2018
* programa tem como proposito a criação de uma  classe(objeto) Complex, 
capaz de realizar calculos com numeros complexos, 
utilizando contrutores de preferencia.*/
#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;
/*criando a biblioteca contendo as variaveis,
que no case seram public para o acesso da main, e construtores.*/
class Complex
{
	private:
		double partereal;
		double parteimaginaria;
	public:
		Complex();
		Complex(double partereal, double parteimaginaria);
		double getReal();
		double getImaginario();
		Complex* toSoma(double a, double b);
		Complex* toSubtracao(double a, double b);
};
