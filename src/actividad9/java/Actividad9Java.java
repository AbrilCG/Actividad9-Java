package actividad9.java;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LyrisseC
 */
public class Actividad9Java {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean False = false;
        boolean salir = False;
        int opcion;
        while (!salir) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Bienvenido a Pocker!");
            System.out.println("Selecciona una opcion");
            System.out.println("1. Mezclar Deck");
            System.out.println("2. Sacar una carta");
            System.out.println("3. Carta al azar");
            System.out.println("4. Generar una mano de 5 cartas");
            System.out.println("0. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();
            System.out.println("--------------------------------------------------------------");
            
                    try{
                switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1");
                    Deck de = new Deck();
                    de.suffle();
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("Seleccionaste la opcion 2");
                    Deck da = new Deck();
                    da.head();
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("Seleccionste la opcion 3");
                    Deck di = new Deck();
                    di.pick();
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("Seleccionaste la opcion 4");
                    Deck du = new Deck();
                    du.hand();
                    System.out.println("\n");
                    break;

                case 0:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                }     
                    }catch(InputMismatchException e){
                        System.out.println("Opcion no valida");
                    }
            }
        }
}
