
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        int salida;
        // bandera en este caso he optado por el uso de una bandera que su valor
        // en este momento es verdadero
        boolean bandera = true;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        // System.out.println("-------------------------------------------------");
        
        /*
        comienzo reciclando codigo, en este caso el ciclo del paquete 4,
        ademas de eso he optado por dejar los comentarios previamente colocados
        por el docente ya que me parecen muy adecuados para la explicacion de 
        algunas de las lineas de codigo, aunque hare mi explicacion de las cosas
        añadidas e importantes para que el codigo funcione
        *
        
        /*
        Este ciclo se repetira hasta que se cumpla su condicion, es decir
        se interactuara con el mismo hasta que bandera se haga falso
        */
        
        do{
            
            // le pedimos al usuario ingresar un numero para realizar una de las
            // dos acciones
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            // se captura el valor ingresado por el usuario en 
            // la variable tipoEstudiante
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            // Solicitar el ingreso de valores para las variables

            // Solicitar nombresEst, apellidosEst, identificacionEst, edadEst
            // Leer nombresEst, apellidosEst, identificacionEst, edadEst
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                /* 
                                        PARTE IMPORTANTE
                    Luego de ingresar los datos y llamar cada metodo establecer
                    para asignar valores, lo que hacemos es que mediante 
                    el ".add" guardar el objeto en este caso "estudianteP"
                    en cada interaccion del ciclo va a guardar este mismo objeto
                    en una posicion del:
                    ArrayList<Estudiante> estudiantes = new ArrayList<>();
                    se guardaran todos los objetos hasta el momento en el que
                    el usuario decida es decir hasta que la bandera se haga
                    falsa.
                    
                    */
                estudiantes.add(estudianteP);
                
                /*
                En esta parte lo que hacemos es pedir al usuario ingresar un 
                entero que tomara el valor de salida
                */
                
                System.out.println("Para salir ingrese (1)");
                salida = entrada.nextInt();
                /*
                Esta es una condicion en la que se evalua el valor que el 
                usuario le dio a la variable salida, en caso que el usuario
                ingrese 1 entonces bandera se hara falso y si de lo contrario
                el usuario ingresa cualquier otro numero, el ciclo se repetira
                hasta que salida sea igual a 1. Esto es porque en ambos tipos
                de estudiantes se ha colocado las mismas condiciones
                para que bandera se haga falso.
                */
                
                if (salida == 1) {
                    bandera = false;
                }
            } else {
                // Si el usuario ingresa un número diferente del valor 1 para 
                // tipoEstudiante se procede a crear los procesos necesarios para 
                // crear un objeto de tipo EstudianteDistancia
                
                    // Declarar,crear e iniciar objeto tipo EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    // Solicitar ingreso de valores para variables 
                    // Solicitar numeroAsigs, costoAsig 
                    // Leer numeroAsigs, costoAsig
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    // se hace uso de los métodos establecer para asignar valores
                    // a los datos (atributos) del objeto
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    
                    // Se agrega al arreglo estudiantes un objeto de tipo
                    // EstudianteDistancia
                    /* 
                                        PARTE IMPORTANTE
                    Luego de ingresar los datos y llamar cada metodo establecer
                    para asignar valores, lo que hacemos es que mediante 
                    el ".add" guardar el objeto en este caso "estudianteD"
                    en cada interaccion del ciclo va a guardar este mismo objeto
                    en una posicion del:
                    ArrayList<Estudiante> estudiantes = new ArrayList<>();
                    se guardaran todos los objetos hasta el momento en el que
                    el usuario decida es decir hasta que la bandera se haga
                    falsa.
                    
                    */
                    estudiantes.add(estudianteD);
                    System.out.println("Para salir ingrese (1)");
                salida = entrada.nextInt();
                if (salida == 1) {
                    bandera = false;
                }
                                                      
            }
            
        }while (bandera);
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        
        /*
        Para que este codigo funcione correctamente se debe añadir a cada una de
        las clases el metodo toString, de lo contrario unicamente imprimira la
        direccion de la clase.
        
        Por ultimo me parece oportuno explicar la siguiente linea:  
        
        estudiantes.get(i).calcularMatricula();
        
        Esta linea llama al metodO ABSTRACTO calcularMatricula(); metodo
        que recibe su logica o su cuerpo en las clases que heredan de la Super
        clase Estudiante
        */
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}