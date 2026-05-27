package com.tarea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        //registro de los numeros
        int[] numeros = new int[10];
        System.out.println("por favor, ingresa 10 numeros:");
        

        for (int i = 0; i < 10; i++) {
            int numero = sca.nextInt();
            numeros[i] = numero;
        }

        //suma y promedio
        int suma = 0;
        double promedio = 0;

        for(int i: numeros){
            System.out.println(i);
            suma += i;
        }
        System.out.println("La suma de los numeros es: " + suma);

        promedio = suma / numeros.length;

        System.out.println("El promedio de los numeros es: " + promedio);
        

        //mayor y menor
        int menor = numeros[0], mayor = numeros[0];
        for(int i: numeros){
            if(i < menor){
                menor = i;
            }
            if(i > mayor){
                mayor = i;
            }
        }
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);


        //divisor y multliplos
        System.out.print("Por favor ingrese un numero divisor: ");
        boolean valido = true;
        int divisor = 0;

            //probando que no vamos a dividir por 0
            while(valido){
                try {                
                    divisor = sca.nextInt();
                    @SuppressWarnings("unused")
                    double r = 1/divisor;
                    valido = false;
                } catch (Exception e) {
                    System.out.print("Ese numero no es valido: ");
                }
            }
        
        int[] multliplos = new int[10];

        for(int i = 0; i < numeros.length; i++){
            int c = 0;
            if(numeros[i] % divisor == 0){
                multliplos[c] = numeros[i];
                c++;
            }
        }
        
        System.out.println("Multiplos de " + divisor + ": ");   
        for(int i: multliplos){
            if(i != 0){
                System.out.println(i);
            }
        }

        //remplazo de un numero en el arreglo

        System.out.print("por favor, ingrese un numero para el reemplazo: ");

        int numeroReemplazo = sca.nextInt();
        int muerto = numeros[4];
        numeros[4] = numeroReemplazo;
        System.out.println("El numero " + muerto + " ha sido reemplazado por " + numeroReemplazo);

        //lo de las matrices en un archivo aparte porque ya se esta haciendo dificil de navegar
        OperacionesMatrices.arranque();
        sca.close();
    }
}