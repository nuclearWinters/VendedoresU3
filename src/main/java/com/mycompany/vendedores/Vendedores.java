/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendedores;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class Vendedores {
    private BigDecimal total = new BigDecimal("200");
    public Vendedores(){
    }
    public BigDecimal getTotal () { return total; } 
    public void setTotal(BigDecimal precio, BigDecimal cantidad){
        this.total = this.total.add(precio.multiply(new BigDecimal("0.09")).multiply(cantidad));
    }
    public static void main(String[] args) {
        Vendedores total = new Vendedores();
        //total.setTotal(new BigDecimal(0), 0);
        String isYORN = "";
        while (true) {
            if (isYORN.equals("N")) {
                System.out.println("Los ingresos del vendedor de la semana son: " + total.getTotal());
                break;
            }
            System.out.println("Introduce el número de un producto (1, 2, 3 ó 4): ");
            Scanner inputNumero = new Scanner(System.in);
            String numero = inputNumero.next();
            System.out.println("Introduce la cantidad que vendió: ");
            Scanner inputCantidad = new Scanner(System.in);
            int cantidad = inputCantidad.nextInt();
            switch(numero) {
                case "1":
                    total.setTotal(new BigDecimal("239.99"), new BigDecimal(cantidad));
                    break;
                case "2":
                    total.setTotal(new BigDecimal("129.75"), new BigDecimal(cantidad));
                    break;
                case "3":
                    total.setTotal(new BigDecimal("99.95"), new BigDecimal(cantidad));
                    break;
                case "4":
                    total.setTotal(new BigDecimal("350.89"), new BigDecimal(cantidad));
                    break;
                default:
            }
            isYORN = "";
            while (true) {
                if (isYORN.equals("Y") || isYORN.equals("N")) {
                    break;
                }
                System.out.println("¿Desea continuar (Y/N)?: ");
                Scanner inputContinuar = new Scanner(System.in);
                isYORN = inputContinuar.next();
            }
        }
    }
}