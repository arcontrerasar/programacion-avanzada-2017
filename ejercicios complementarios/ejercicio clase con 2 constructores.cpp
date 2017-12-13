//clase tiempo contiene atributos y varios constructores

#include<iostream>
#include<stdlib.h>
using namespace std;

class Tiempo{
	private: 
		int horas,minutos,segundos;
	public: 
		Tiempo(int,int,int); //para Constructor1
		Tiempo(int); //para Constructor2
		void mostrarTiempo();
};

//Constructor1
Tiempo::Tiempo(int _horas,int _minutos,int _segundos){
	horas = _horas;
	minutos = _minutos;
	segundos = _segundos;
}

//Constructor2 esta modificado para utilizar un unico parametro
Tiempo::Tiempo(int totalSeg){
	horas = totalSeg/3600; //Extraer las horas
	totalSeg %= 3600;
	minutos = totalSeg/60; //Extraer los minutos
	segundos = totalSeg%60;	//Extraer los segundos
}
//accion
void Tiempo::mostrarTiempo(){
	cout<<"La Hora exacta es: "<<horas<<":"<<minutos<<":"<<segundos<<endl;
}

int main(){//semuestra hora mediante ambos constructores
	Tiempo hora1(14,40,10); //horas:minutos:segundos
	Tiempo hora2(55400); 
	
	hora1.mostrarTiempo();
	hora2.mostrarTiempo();
	
	system("pause");
	return 0;
}


