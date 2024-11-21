/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.integrador.joseph.salazar.guzmán;

/**
 *
 * @author Joseph
 */
//Se importan las librerias Random y Scanner
import java.util.Random;
import java.util.Scanner;

public class SuperEsperanza {

    private String[] Productos;
    private int[][] VentasSemanales;
    private final int Dias = 7;

    public SuperEsperanza(int cantidadProductos) {
        Productos = new String[cantidadProductos];
        VentasSemanales = new int[Dias][cantidadProductos];
    }

    //Añade los porductos deseados con ayuda del scanner 
    public void AñadirProductos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombres de los productos deseados:");
        for (int i = 0; i < Productos.length; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            Productos[i] = scanner.nextLine();
        }
    }

    //Genera las ventas random gracias a la libreria Random importada
    public void VentasRandom() {
        Random random = new Random();
        for (int i = 0; i < Dias; i++) {
            for (int j = 0; j < Productos.length; j++) {
                VentasSemanales[i][j] = random.nextInt(10);
            }
        }
    }

    //Calcula las ventas por cada producto gracias al length
    public void CalcularVentasProducto() {
        System.out.println("Total de ventas por producto:");
        for (int j = 0; j < Productos.length; j++) {
            int total = 0;
            for (int i = 0; i < Dias; i++) {
                total += VentasSemanales[i][j];
            }
            System.out.println(Productos[j] + ": " + total);
        }
    }

    //Busca cula fue el dia en el que super la esperanza vendio mas 
    public void DiaMasVendido() {
        int DiaMayor = 0;
        int ventasMaximas = 0;
        for (int i = 0; i < Dias; i++) {
            int totalDia = 0;
            for (int j = 0; j < Productos.length; j++) {
                totalDia += VentasSemanales[i][j];
            }
            if (totalDia > ventasMaximas) {
                ventasMaximas = totalDia;
                DiaMayor = i;
            }
        }
        String[] Dias3 = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println("El dia con mayores ventas es " + Dias3[DiaMayor] + " con un total de " + ventasMaximas + " ventas.");
    }

    //Muestra el producto mas vendido en el super la esperanza
    public void ProductoMasVendido() {
        int ProductoMasVendido = 0;
        int VentasMaximas = 0;
        for (int j = 0; j < Productos.length; j++) {
            int total = 0;
            for (int i = 0; i < Dias; i++) {
                total += VentasSemanales[i][j];
            }
            if (total > VentasMaximas) {
                VentasMaximas = total;
                ProductoMasVendido = j;
            }
        }
        System.out.println("El producto mas vendido es " + Productos[ProductoMasVendido] + " con " + VentasMaximas + " unidades.");
    }

    //Muestra las ventas semanale del super la esperanzA
    public void VentasSemanales() {
        System.out.println("Matriz de ventas semanales:");
        String[] DiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.print("\t");
        for (String producto : Productos) {
            System.out.print(producto + "\t");
        }
        System.out.println();
        for (int i = 0; i < Dias; i++) {
            System.out.print(DiasSemana[i] + "\t");
            for (int j = 0; j < Productos.length; j++) {
                System.out.print(VentasSemanales[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
