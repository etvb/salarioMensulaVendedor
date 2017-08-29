/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author edgardo
 */
public class ejecutable {
    
    public static void main(String[] args){
        //Constantes
        final float SALARIO = 1000, COMISION = 150;
        //Variables
        //el porcentaje es de 5% de valor de la venta
        float porcentaje, salarioMensual, valorCarro, comisionTotal;
        int carrosVendidos;
        Scanner teclado = new Scanner(System.in);
        
        //Por el momento solo se venderan carros con el mismo valor
        //en un futuro, cambiar para que sean carros de diferentes precios.
        
        System.out.print("¿Cuantos carros vendidos en el mes? : ");
        carrosVendidos = teclado.nextInt();
        System.out.print("¿Costo de los carros? : ");
        valorCarro = teclado.nextFloat();
        
        porcentaje = (float) ((carrosVendidos * valorCarro)*.05);
        comisionTotal = COMISION*carrosVendidos; 
        salarioMensual = SALARIO + (COMISION*carrosVendidos)+porcentaje;
        
        System.out.println("La comision por " + carrosVendidos + " carros vendidos es: " + "$" + comisionTotal);
        System.out.println("+ el 5% del total de la venta es: " + "$" + porcentaje);
        System.out.println("El salario total es: " + "$" + salarioMensual);
        
    }
    
}
