/*
* Calculadora de IMC: Crie uma nova classe CalculadoraIMC.java. Declare
* duas variáveis do tipo double: peso (em kg) e altura (em metros). Calcule o
* Índice de Massa Corporal (IMC) usando a fórmula: IMC = peso / (altura
* altura). Imprima o resultado no console.
* */

package mix.florinda;

public class CalculadoraImc {
 public static void main(String[] args) {
     
     double peso = 60.0;
     double altura = 1.55;
     
     double imc = peso / (altura * altura);
     
     System.out.printf("IMC: %.2f%n", imc );
 
 }

}
