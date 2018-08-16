//Primer Ejercicio

package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class Ejercecio1
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
        public static void turnRight(Robot estudiante){ //Gira el robot hacia la derecha
            for(int ii=1; ii<=2; ii++){
                estudiante.turnLeft();
            }
        }
        public static void turnRight_2(Robot estudiante){ //Gira el robot hacia la derecha
            for(int ii=1; ii<=3; ii++){
                estudiante.turnLeft();
            }
        }
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,0, 2, Direction.WEST, 10); //El robot inicia mirando al oeste en la posicion 0 2
	    
            turnRight(estudiante);
            for(int ii=0; ii<=3; ii++){
                estudiante.move();
                turnRight_2(estudiante);
            }
            turnRight(estudiante);
            
        }
}

