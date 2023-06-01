
package tareaprograiipoo;
/*Se agrega el extends para herencia de la clase padre-->"Calculadora" hacia  la clase hija
"CalculadoraEspecial" para asi heredar los metodos de la clase padre calculadora*/
public class CalculadoraEspecial extends Calculadora {
    public String tipoCalculadora;

    public CalculadoraEspecial(String tipoCalculadora) {
        this.tipoCalculadora = "Calculadora Especial";
    }
    
    //1. se calcula la factorial de un numero
    public double factorial(int numero){
    double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    
    }
    
    //2.Determinacion de la potencia de un numero(base,exponente)
     public double potencia (double base, int exponente) {
        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        return potencia;
    }
    //Metodo para el calculo del seno
    public double calSeno(double numero1){
          double anguRadianes=Math.toRadians(numero1);
          numero1=Math.sin(anguRadianes);
          return numero1;
    }
    //Metodo para el calculo del coseno
    public double calCoseno(double numero2){
          double anguRadianes=Math.toRadians(numero2);
          numero2=Math.cos(anguRadianes);
          return numero2;
    }
    //Metodo para el calculo de la tangente
    public double calTangente(double numero3){
          double b=Math.toRadians(numero3);
          numero3=Math.tan(b);
          return numero3;
          
    }
    //Metodo para el calculo de arcotangente
    public double calArcTangente(double numero4){
          numero4=Math.atan(numero4);
          double c=Math.toDegrees(numero4);
        return c;
    }
}
