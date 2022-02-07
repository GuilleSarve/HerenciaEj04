package herenciaejercicio04;

import herencias.Circulo;
import herencias.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class HerenciaEjercicio04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo circulo = new Circulo();
        Rectangulo rec = new Rectangulo();
        circulo.setRadio(leer.nextDouble());
        circulo.calcularArea();
        circulo.calcularPerimetro();
        rec.setAltura(leer.nextDouble());
        rec.setBase(leer.nextDouble());
        rec.calcularArea();
        rec.calcularPerimetro();
        
    }

}
//Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
//de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
//calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
//llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
//perímetro y el valor de PI como constante.
//Desarrollar el ejercicio para que las formas implementen los métodos de la
//interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
//formas y se mostrará el resultado final.
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
