/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.integrador.joseph.salazar.guzmán;

/**
 *
 * @author Joseph
 */
import java.util.Random;
import java.util.Scanner;

public class EjercicioIntegradorJosephSalazarGuzmán {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos deseados: ");
        int CantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Añade la nueva línea para el siguiente producto

        SuperEsperanza tienda = new SuperEsperanza(CantidadProductos);
        tienda.AñadirProductos();
        tienda.VentasRandom();
        tienda.VentasSemanales();
        tienda.CalcularVentasProducto();
        tienda.DiaMasVendido();
        tienda.ProductoMasVendido();
    }

}
