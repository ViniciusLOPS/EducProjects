/*Autor:Vinicius Luiz O. P. Dos Santos, CC3642 Orientacao a Objetos
Realizado em 16/03/2018
* programa tem como proposito a criação de uma  classe(objeto) Invoice, 
capaz de administrar produtos e obter seu arrecadamento, 
utilizando contrutores de preferencia.*/
#include <cstdlib>
#include <iostream>
#include <string>
#include "Invoice.h"
/*adicionado biblioteca Invoice que foi criada no
mesmo diretorio que a main e a classe.*/
using namespace std;

int main(int argc, char *argv[])
{
	//variaveis
	string id, info;
	int amount, price;
	//adquirindo variaveis do usuario.
	cout << "Digite o ID do produto 1:" << endl;
	cin >> id;
	/*utilizando de ignore para quebra de linha e
	utilização do getline da descrição.*/
	cin.ignore();
	cout << "Digite a descricao do produto:" << endl;
	getline(cin, info);
	cout << "Digite a quantidade:" << endl;
	cin >> amount;
	cout << "Digite o preco:" << endl;
	cin >> price;
	/*invoice criado no final chamando o contrutor,
	e sendo usado como um ponteiro.*/
	Invoice *i1 = new Invoice(id, info, amount, price);
	//repetindo o processo para confirmação de funcionamento.
	cout << "Digite o ID do produto 2:" << endl;
	cin >> id;
	cin.ignore();
	cout << "Digite a descricao do produto:" << endl;
	getline(cin, info);
	cout << "Digite a quantidade:" << endl;
	cin >> amount;
	cout << "Digite o preco:" << endl;
	cin >> price;
	Invoice *i2 = new Invoice(id, info, amount, price);
	/*uma unica linha que descreve tudo sobre o produto tentando
	obedecer a boa conduta de limite de 70 letras*/
	cout << "O produto indentificado como " << i1->id <<
	 " descrito como " << i1->info << " teve " << i1->amount <<
	  " unidades compradas por R$" << i1->price <<
	   " cada unidade arrecadando um total de R$" <<
	    i1->getInvoiceAmount() << endl << endl;
	/*uma unica linha que descreve tudo sobre o produto tentando
	obedecer a boa conduta de limite de 70 letras*/
	cout << "O produto indentificado como " << i2->id <<
	 " descrito como " << i2->info << " teve " << i2->amount <<
	  " unidades compradas por R$" << i2->price <<
	   " cada unidade arrecadando um total de R$" <<
	    i2->getInvoiceAmount() << endl;	
	//usando destrutores para liberar o heap antes da finalização do executavel.
	delete i1;
	delete i2;
	
    system("pause");
	return 0;
};
