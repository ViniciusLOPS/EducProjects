/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 16/03/2018
* programa tem como proposito a criação de uma  classe(objeto) Invoice, 
capaz de administrar produtos e obter seu arrecadamento, 
utilizando contrutores de preferencia.*/
#include <cstdlib>
#include <iostream>
#include <string>
#include "Invoice.h"
//incluindo a biblioteca invoice
using namespace std;
//criando os diversos metodos a serem utilizados e construtores.
Invoice::Invoice(string id, string info, int amount, int price)
{
	this->id = id;
	this->info = info;
	setAmount(amount);
	setPrice(price);
};
//limitando a quantidade e o preço para não serem negativos.
void Invoice::setAmount(int amount)
{
	if (amount > 0)
	{
		this->amount = amount;
	}
	else
	{
		this->amount = 0;
	}
};
void Invoice::setPrice(int price)
{
	if (price > 0)
	{
		this->price = price;
	}
	else
	{
		this->price = 0;
	}
};
//retornando o total arrecadado.
int Invoice::getInvoiceAmount()
{
	return amount * price;
};
