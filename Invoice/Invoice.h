/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 16/03/2018
* programa tem como proposito a criação de uma  classe(objeto) Invoice, 
capaz de administrar produtos e obter seu arrecadamento, 
utilizando contrutores de preferencia.*/
#include <cstdlib>
#include <iostream>
#include <string>
using namespace std;
/*criando a biblioteca contendo as variaveis,
que no case seram public para o acesso da main, e construtores.*/
class Invoice
{
	public:
		string id;
		string info;
		int amount;
		int price;
	public:
		Invoice(string id, string info, int amount, int price);
		void setAmount(int amount);
		void setPrice(int price);
		int getInvoiceAmount();
};