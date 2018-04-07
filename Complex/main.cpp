/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 22/03/2018
* programa tem como proposito a criação de uma  classe(objeto) Complex, 
capaz de realizar calculos com numeros complexos,  
utilizando contrutores de preferencia.*/
#include <cstdlib>
#include <iostream>
#include <string>
#include "Complex.h"
/*adicionado biblioteca Complex que foi criada no
mesmo diretorio que a main e a classe.*/
using namespace std;

int main(int argc, char *argv[])
{
	//variaveis
	double real, imaginario;
	//adquirindo primeiro numero complexo.
	cout << "Digite a parte Real do primeiro numero complexo:" << endl;
	cin >> real;
	cout << "Digite sua parte imaginaria:" << endl;
	cin >> imaginario;
	/*Complex criado no final chamando o contrutor,
	e sendo usado como um ponteiro.*/
	Complex *c1 = new Complex(real, imaginario);
	//adiquirindo o segundo numero complexo.
	cout << "Digite a parte Real do Segundo numero complexo:" << endl;
	cin >> real;
	cout << "Digite sua parte imaginaria:" << endl;
	cin >> imaginario;
	Complex *c2 = new Complex(real, imaginario);
	//realizando a soma.
	Complex *c3 = c1->toSoma(c2->getReal(), c2->getImaginario());
	//realizando a subtracao.
	Complex *c4 = c1->toSubtracao(c2->getReal(), c2->getImaginario());
	//printando resultados obtidos.
	cout << "A soma dos numeros complexos (" << c1->getReal() << "," <<
	  c1->getImaginario() << ") + (" << c2->getReal() << "," <<
	  c2->getImaginario() << ") = (" << c3->getReal() << "," <<
	   c3->getImaginario() << ")" <<endl;
	cout << "A subtracao dos numeros complexos (" << c1->getReal() << "," <<
	 c1->getImaginario() << ") - (" << c2->getReal() << "," <<
	  c2->getImaginario() << ") = (" << c4->getReal() << "," <<
	   c4->getImaginario() << ")" <<endl;
	 
	//usando destrutores para liberar o heap antes da finalização do executavel.
	delete c1;
	delete c2;
	delete c3;
	delete c4;
	
    system("pause");
	return 0;
};
