package com.mycompany.fecha.poo;
import java.util.HashMap;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String fechaCorta() {
        return dia + "/" + mes + "/" + ano;
    }
    public boolean validarFecha() {
        if (ano <= 0 || mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > obtenerDiasEnMes()) {
            return false;
        }
        return true;
    }
    private int obtenerDiasEnMes() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && esBisiesto()) {
            return 29;
        }
        return diasPorMes[mes - 1];
    }
    private boolean esBisiesto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    public String mesLetra() {
        HashMap<Integer, String> nombresMeses = new HashMap<>();
        nombresMeses.put(1, "enero");
        nombresMeses.put(2, "febrero");
        nombresMeses.put(3, "marzo");
        nombresMeses.put(4, "abril");
        nombresMeses.put(5, "mayo");
        nombresMeses.put(6, "junio");
        nombresMeses.put(7, "julio");
        nombresMeses.put(8, "agosto");
        nombresMeses.put(9, "septiembre");
        nombresMeses.put(10, "octubre");
        nombresMeses.put(11, "noviembre");
        nombresMeses.put(12, "diciembre");
        return nombresMeses.getOrDefault(mes, "mes inválido");
    }
public String fechaLarga() {
        return dia + " de " + mesLetra() + " de " + ano;
    }
}
