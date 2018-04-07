/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 22/03/2018
* programa tem como proposito a criação de uma  classe(objeto) Complex, 
capaz de realizar calculos com numeros complexos,  
utilizando contrutores de preferencia.*/
#include <cstdlib>
#include <iostream>
#include <string>
#include "Complex.h"
//incluindo a biblioteca Complex
//construtor padrao.
using namespace std;
Complex::Complex(){
	partereal = 0.0;
	parteimaginaria = 0.0;
}
//construtor com parametros.
Complex::Complex(double partereal, double parteimaginaria){
	this->partereal = partereal;
	this->parteimaginaria = parteimaginaria;
}
//metodos get para obtencao de variaveis na main.
double Complex::getReal(){
	return partereal;
}
double Complex::getImaginario(){
	return parteimaginaria;
}
//metodo para soma de numeros complexos retornando um novo complex de resultado.
Complex* Complex::toSoma(double a, double b){
	a = partereal + a;
	b = parteimaginaria + b;
	return new Complex(a, b);
}
//metodo para subtracao de numeros complexos retornando um novo complex de resultado.
Complex* Complex::toSubtracao(double a, double b){
	a = partereal - a;
	b = parteimaginaria - b;
	return new Complex(a, b);
}
