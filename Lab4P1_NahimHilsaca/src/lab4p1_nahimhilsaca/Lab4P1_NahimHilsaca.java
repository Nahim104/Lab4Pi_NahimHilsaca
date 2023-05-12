/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_nahimhilsaca;

import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Lab4P1_NahimHilsaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("1.- Conjuntos ");
            System.out.println("2.- Contraseña Mejorada ");
            System.out.println("3. Salir ");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    String conjunto1;
                    String conjunto2;


                    System.out.println(" Ingrese el primer conjunto: ");
                    conjunto1 = leer.next();
                    System.out.println("Ingrese el primer conjunto: ");
                    conjunto2 = leer.next();
                    
                    boolean conjunto=true;

                    int i =  conjunto1.charAt(0);
                    int y =  conjunto2.charAt(0);
                    if ((i>= 65 && i<=90)) {
                                
                        conjunto=true;
                        
                    }

                    if (conjunto1.charAt(2) == '{') {
                        
                        conjunto=true;

                    }

                    if (conjunto1.charAt(conjunto1.length()) == '}') {
                        
                      conjunto=true;

                    }
                    
                    if (!conjunto){
                    
                        System.out.println("Su conjunto debe tener la forma LETRA+ {}");
                    
                    }

                    if ((y >=65 && y<=90)) {
                        
                       conjunto=true;

                    }

                    if (conjunto1.charAt(2) == '{') {
                        
                        conjunto=true;

                    }

                    if (conjunto1.charAt(conjunto1.length()) == '}') {
                        
                        conjunto=true;

                    }

                    if (!conjunto){
                    System.out.println("Su conjunto debe tener la forma LETRA = {} ");
                    }
                    
                    if (conjunto1.equals(conjunto2)){
                    
                        System.out.println("Los conjuntos son iguales");
                    
                    }else{
                    
                        System.out.println("Los conjuntos son diferentes");
                    
                    }
                    
                    
                        
                    
                    break;

                case 2:

                    String contrasena;
                    String contrasena_nueva= "";
                    System.out.println(" Ingrese la contraseña: ");
                    contrasena = leer.next();
                    System.out.println("Ingrese un numero: ");
                    int numero = leer.nextInt();

                    boolean num = false;
                    boolean letra = false;
                    int cont = 0;
                    while (contrasena.length() < 8) {
                        System.out.println("Su contrasena debe tener 8 caracterese por lo menos");
                        contrasena = leer.next();
                    }
                    for (int k = 0; k < contrasena.length(); k++) {

                        char j = contrasena.charAt(k);

                        if ((j > 64 && j < 90) || (j > 96 && j < 123)) {
                            letra = true;
                        }

                        if (j < 58 && j > 47) {

                            num = true;
                        }
                    }
                    if (!letra) {
                        System.out.println("La contrasena debe tener por lo menos una letra ");
                    }
                    if (!num){
                    System.out.println("La contrasena debe tener por lo menos un numero ");
                    }
                    
                    if (num == true && letra == true) {

                        System.out.println("La contraseña es segura ");

                        for (int h = 0; h < contrasena.length(); h++) {

                            

                            if (cont==2) {
                                
                                cont=0;
                                contrasena_nueva+=numero;
                              
                                numero++;
                                
                            }
                            contrasena_nueva += contrasena.charAt(h);
                            cont = cont+1;
                        }
                             System.out.println("La contraseña nueva es:"+ contrasena_nueva);
                    }

                    break;

            }
        }// Fin del while

    }// Fin del main

}// Fin de la clase
