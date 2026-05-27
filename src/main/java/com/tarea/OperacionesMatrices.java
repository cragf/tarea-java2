package com.tarea;

public class OperacionesMatrices {
    public static void arranque(){
         //matrices

        int[][] matriza = {{1,3,5},{2,4,6},{9,7,5}};
        int[][] matrizb = {{6,0,2},{1,6,9},{2,8,4}};
        System.out.println("Matriz A: ");
        for(int i = 0; i < matriza.length; i++){
            for(int j = 0; j < matriza[i].length; j++){
                System.out.print(matriza[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B: ");
        for(int i = 0; i < matrizb.length; i++){
            for(int j = 0; j < matrizb[i].length; j++){
                System.out.print(matrizb[i][j] + " ");
            }
            System.out.println();
        }
        //multiplicaciones a matrices

        int[][] matrizresultados = new int[3][3];

        System.out.println("Matriz A multiplicada por 4: ");
        for(int i = 0; i < matriza.length; i++){
            for(int j = 0; j < matriza[i].length; j++){
                matrizresultados[i][j] = matriza[i][j] * 4;
                
                System.out.print(matrizresultados[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz B multiplicada por 4: ");
        for(int i = 0; i < matrizb.length; i++){
            for(int j = 0; j < matrizb[i].length; j++){
                matrizresultados[i][j] = matrizb[i][j] * 4;
                
                System.out.print(matrizresultados[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma de las matrices: ");
        for(int i = 0; i < matriza.length; i++){
            for(int j = 0; j < matriza[i].length; j++){
                matrizresultados[i][j] = matriza[i][j] + matrizb[i][j];
                
                System.out.print(matrizresultados[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplicacion de las matrices: ");
        for(int i = 0; i < matriza.length; i++){
            for(int j = 0; j < matriza[i].length; j++){
                matrizresultados[i][j] = matriza[i][j] * matrizb[j][i];
                
                System.out.print(matrizresultados[i][j] + " ");
            }
            System.out.println();
        }
    }
}
