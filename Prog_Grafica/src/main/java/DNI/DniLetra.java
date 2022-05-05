/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DNI;

/**
 *
 * @author DAW
 */
public class DniLetra {

    private int numeroDNI;
    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public DniLetra(int num) {
        this.numeroDNI = num;
    }

    public void setNumeroDNI(int nuevoNum) {
        this.numeroDNI = nuevoNum;
    }

    public int getNumeroDNI() {
        return numeroDNI;
    }

    public char obtenerLetra() {
        int resto;
        resto = this.getNumeroDNI() % 23;
         
         
        return this.letras[resto];
    }
}
