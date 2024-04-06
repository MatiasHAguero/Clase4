/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase4;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class Clase4 {

    public static void main(String[] args) {
        Scanner ñ = new Scanner(System.in);
        int cantidad = 0;
        boolean esta = false;

        System.out.print("Ingrese la cantidad de empleados a ingresar: ");
        cantidad = ñ.nextInt();
        String nombre[] = new String[cantidad];
        int cedula[] = new int[cantidad];
        int salario[] = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            nombre[i] = ñ.nextLine();
            System.out.print("Ingrese el nombre: ");
            nombre[i] = ñ.nextLine();
            System.out.print("Ingrese la cedula: ");
            cedula[i] = ñ.nextInt();
            System.out.print("Ingrese el salario: ");
            salario[i] = ñ.nextInt();
        }
        
        System.out.print("Ingrese id el empleado a buscar: ");
        int buscar = ñ.nextInt();
        
        for (int i = 0; i < nombre.length; i++) {
            if (cedula[i]== buscar){
                System.out.print("Ingrese la cantidad de horas trabajadas: ");
                int horas = ñ.nextInt();
                System.out.print("Se le pagara un total de: "+horas*salario[i]);
                esta = true;
            }
        }
        if (esta==false) System.out.print("El empleado no existe");
    }
}
