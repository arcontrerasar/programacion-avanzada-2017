#include<iostream>
#include<stdlib.h>
using namespace std;

class humano{
      private://privados y solo visibles a la clase
              int edad;//son los atributos
              string nombre;
      public://se pueden utilizar mediante otras clases
             humano(int,string);
             void correr();
             void saltar();

      };//las clases terminan en ;
      humano::humano(int_edad,string_nombre){//constructor por defecto
      edad=miedad;
      nombre=minombre;
      }                                       
               void humano::correr(){
                    cout<<"soy"<<nombre<<"y corro"<<endl;
                    }                              
               void humano::saltar(){
                      cout<<"soy"<<nombre<<"y salto tengo"<<edad<<"años"<<endl;
                    }
      int main(){
          humano armando=humano(19,"armando");
          armando.correr();
          armando.saltar();
      system("pause");
      return 0;
      }
