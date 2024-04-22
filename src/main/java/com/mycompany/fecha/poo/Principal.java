package com.mycompany.fecha.poo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes 1-12: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int ano = scanner.nextInt();
        Fecha fecha = new Fecha(dia, mes, ano);
        if (fecha.validarFecha()) {
            System.out.println("La fecha es válida.");
            System.out.println("Fecha en formato largo: " + fecha.fechaLarga());
        } else {
            System.out.println("La fecha no es válida.");
        }
    }
}
