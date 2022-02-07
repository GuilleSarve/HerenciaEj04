
package herencias;


public class Rectangulo implements calculosFormas {
private double base;
private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        System.out.println("el area es: "+(this.base*this.altura));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("el perimetro es: "+(this.base*2)+(this.altura*2));
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