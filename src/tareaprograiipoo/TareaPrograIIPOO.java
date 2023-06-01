
package tareaprograiipoo;

import java.util.Scanner;

public class TareaPrograIIPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       Calculadora calculadora = new Calculadora("JP");
       CalculadoraEspecial calEspecial= new CalculadoraEspecial("Especial");//Creacion de objeto para clase CalculadoraEspecial
       boolean salir = false;
       int opcion; 
       
       do{
           System.out.println("");
           System.out.println("=================================================");
           System.out.println("Selecciona una opcion de la calculadora Basica:");
           System.out.println("=================================================");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Raiz Cuadrada");
           System.out.println("6. Verificar numero Primo");
            System.out.println("==================================================");
           System.out.println("Selecciona una opcion de la calculadora Especial:");
           System.out.println("===================================================");
           System.out.println("7. Factorial");
           System.out.println("8. Potencia");
           System.out.println("9. Seno");
           System.out.println("10. Coseno");
           System.out.println("11. Tangente");
           System.out.println("12.ArcoTangente");
           System.out.println("13. Salir");
           System.out.println("===================================================");
           opcion = sn.nextInt();
            switch(opcion){
                case 1:
                    /*Se cambia el objeto de la clase calculadora por el objeto de la clase CalculadoraEspecial
                    ya que este objeto tiene los metodos heredados de la clase calculadora, por que funcionaria igual.
                    Se cambian desde el case 1 al case 6, que es donde estaba el objeto de la clase calculadora*/
                   System.out.println("El resultado de la suma es = " + calEspecial.sumar(10, 5));
                   break;
                case 2:
                   System.out.println("El resultado de la resta es = " +calEspecial.restar(10, 5));
                   break;
                case 3:
                   System.out.println("El resultado de la multiplicacion es = " +calEspecial.multiplicar(10, 5));
                   break;
                case 4:
                    System.out.println("El resultado de la division es = " +calEspecial.dividir(10, 5));
                    break;
                case 5:
                    System.out.println("El resultado de la raiz cuadrada es = " +calEspecial.raizCuadrada(16));
                    break;
                case 6:
                    System.out.println("Es primo? = " +calEspecial.esPrimo(11));
                    break;
                case 7:
                    Scanner nume= new Scanner(System.in);
                    int numero;
                    System.out.println("Ingrese la base para la potencia");
                    numero=nume.nextInt();
                    System.out.println("El factorial del numero es: = " + calEspecial.factorial(numero));
                    break;
                case 8:
                    //Se ingresa por teclado la base y el exponente
                    Scanner num= new Scanner(System.in);
                    int base,exponente;
                    System.out.println("Ingrese la base para la potencia");
                    base=num.nextInt();
                    System.out.println("Ingrese el exponente para la potencia");
                    exponente=num.nextInt();
                    System.out.println("El calculo de la potencia es: = " + calEspecial.potencia(base, exponente));
                    break;
                 case 9:
                     //Se le pide al usuario que ingrese el numero por teclado.
                    Scanner num1= new Scanner(System.in);
                    int numero1;
                    System.out.println("Ingrese un numero para calcular el seno");
                    numero1=num1.nextInt();
                    System.out.println("El seno del numero es: = " + calEspecial.calSeno(numero1));
                    break;
                case 10:
                    //Se le pide al usuario que ingrese el numero por teclado.
                    Scanner num2= new Scanner(System.in);
                    int numero2;
                    System.out.println("Ingrese un numero para calcular el coseno");
                    numero2=num2.nextInt();
                    System.out.println("El coseno del numero es: = " + calEspecial.calCoseno(numero2));
                    break;
                case 11:
                    //Se le pide al usuario que ingrese el numero por teclado.
                    Scanner num3= new Scanner(System.in);
                    int numero3;
                    System.out.println("Ingrese un numero para calcular la Tangente");
                    numero3=num3.nextInt();
                    System.out.println("La tangente del numero es: = " + calEspecial.calTangente(numero3));
                    break;
                case 12:
                    //Se le pide al usuario que ingrese el numero por teclado.
                    Scanner num4= new Scanner(System.in);
                    int numero4;
                    System.out.println("Ingrese un numero para calcular la ArcoTangente");
                    numero4=num4.nextInt();
                    System.out.println("La Arcotangente del numero es: = " + calEspecial.calArcTangente(numero4));
                    break;
                case 13:
                   salir=true;
                   break;
                default:
                   System.out.println("Solo números entre 1 y 13");
            }
       }
        while(!salir);   
        
    }
}
