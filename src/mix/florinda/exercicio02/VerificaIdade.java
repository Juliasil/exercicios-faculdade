/*
* Verificação de Maioridade: Crie uma classe VerificaIdade.java. Declare
* uma variável int idade = 17;. Use uma estrutura if-else para verificar
* se a idade é maior ou igual a 18. Se for, imprima "Acesso permitido". Caso
* contrário, imprima "Acesso negado"
*/
package mix.florinda.exercicio02;

public class VerificaIdade {
public static void main(String[] args) {
    int idade = 17;
    
    if (idade >= 18) {
        System.out.println("Acesso permitido");
    } else {
        System.out.println("Acesso negado");
    }
    
}

}
