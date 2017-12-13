//se pretende aprender a usar el polimorfismo,es decir,
//como diferentes objetos captan un mensaje  
#include<iostream>
#include<stdlib.h>
using namespace std;

class persona{
      private:
                string nombre;
              int edad;
           
      public:
          persona(string,int);
             virtual void mostrar();//virtual es palabra reservada para polimorfismo
            

      };
class alumno : public persona{
      private:
              float notafinal;
      public:
             alumno(string,int,float);
             void mostrar();
      };
class profesor : public persona{
      private:
              string materia;
      public:
             profesor(string,int,string);
             void mostrar();
      };
      persona::persona(string _nombre,int _edad){//constructor
      edad=_edad;
      nombre=_nombre;
      }                                       
      void persona::mostrar(){//accion
                   cout<<"nombre:"<<nombre<<endl;
                   cout<<"edad"<<edad<<endl;
                    } 
      alumno::alumno(string _nombre,int _edad,float _notafinal) : persona(_nombre,_edad){//constructor ocupando herencia
                            notafinal= _notafinal;
                            }                             
      void alumno::mostrar(){
           persona::mostrar();
           cout<<"notafinal"<<notafinal<<endl;
           }
      profesor::profesor(string _nombre, int _edad, string _materia) : persona(_nombre, _edad){
                           materia= _materia;     
                                }
      void profesor::mostrar(){
           persona::mostrar();
           cout<<"materia"<<materia<<endl;
           }
      int main(){
         persona *vector[3];//apuntador a un vector
         vector[0]= new alumno ("armando",20, 10);
          vector[1]= new alumno ("cesar",18, 9);
           vector[2]= new profesor ("alex",30,"sistemas" );
           vector[0]->mostrar();
           cout<<"\n";
           vector[1]->mostrar();
            cout<<"\n";
           vector[2]->mostrar();
           
           
      system("pause");
      return 0;
      }
