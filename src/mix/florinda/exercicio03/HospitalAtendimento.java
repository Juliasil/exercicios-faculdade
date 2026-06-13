/*
* DESCRIÇÃO DO DESAFIO
* Crie um programa que represente três médicos de um hospital e seus respectivos atendimentos.
*Cada médico tem um nome, uma idade e um atendimento atribuído a ele, com o nome do paciente, nível de urgência e status de conclusão.

*DICAS EXTRAS

* Identifique os tipos de dados que você vai precisar. Ex: String, int
* Crie variáveis, por exemplo: String nomeMedico1 = "Dr. Carlos"; para o nome do médico
* Imprima os dados: use System.out.println para mostrar as informações


* QUER MAIS DIFICULDADE?
* Use condicionais para verificar se o médico pode realizar o atendimento baseado na sua idade:

* Altere o status do atendimento para "concluído" ou "não concluído" de acordo com essa lógica e imprima o resultado
* Médicos com menos de 30 anos só podem realizar atendimentos de nível C ou D (baixa urgência). Médicos com 30 anos ou mais podem realizar atendimentos de qualquer nível
*Altere o status do atendimento para "concluído" ou "não concluído" de acordo com essa lógica e imprima o resultado
* */

package mix.florinda.exercicio03;

public class HospitalAtendimento {
 public static void main(String[] args) {
     
     String nomeMedico1 = "Dr. Carlos";
     int idadeMedico1 = 30;
     String nomeAtendimento1 = "Clinico Geral";
     String nomeDoPaciente1 = "Gustavo Lira";
     String statusPaciente1 = "Prioridade";
     char nivelDeUrgencia1 = 'A';
     
     
     if (idadeMedico1 < 30) {
         if (nivelDeUrgencia1 == 'C' || nivelDeUrgencia1 == 'D') {
             statusPaciente1 = "Concluido";
         } else {
             statusPaciente1 = "Não concluido";
         }
     } else {
         statusPaciente1 = "Concluida";
     }
     
     
     System.out.println("Nome do medico " + nomeMedico1);
     System.out.println("Idade:" + idadeMedico1);
     System.out.println("Nome do Atendimento:" + nomeAtendimento1);
     System.out.println("Nome do paciente:" + nomeDoPaciente1);
     System.out.println("Nivel de urgência: " + nivelDeUrgencia1);
     System.out.println("Status do Paciente: " + statusPaciente1);
     
     System.out.println("-------------------------------------");
     
     String nomeMedico2 = "Dr. Felipe";
     int idadeMedico2 = 38;
     String nomeAtendimento2 = "Ortopedia";
     String nomeDoPaciente2 = "Julia Alves";
     String statusPaciente2 = "Triagem";
     char nivelDeUrgencia2 = 'C';
     
     
     if (idadeMedico2 < 30) {
         if (nivelDeUrgencia2 == 'C' || nivelDeUrgencia2 == 'D') {
             statusPaciente2 = "Concluido";
         } else {
             statusPaciente2 = "Não concluido, você ainda é um residente";
         }
     } else {
         statusPaciente2 = "Atendimento concluido, você é um médico formado!";
     }
     
     
     System.out.println("Nome do medico:" + nomeMedico2);
     System.out.println("Idade:" + idadeMedico2);
     System.out.println("Nome do Atendimento:" + nomeAtendimento2);
     System.out.println("Nome do paciente:" + nomeDoPaciente2);
     System.out.println(" Nivel de urgência: " + nivelDeUrgencia2);
     System.out.println(" O ststus: " + statusPaciente2);
     
     System.out.println("-------------------------------------");
     
     String nomeMedico3 = "Dr. Marco";
     int idadeMedico3 = 25;
     String nomeAtendimento3 = "Obstetra";
     String nomeDoPaciente3 = "Neuza Sampaio";
     String statusPaciente3 = "Observação";
     char nivelDeUrgencia3 = 'A';
     
     
     if (idadeMedico3 < 30) {
         if (nivelDeUrgencia3 == 'C' || nivelDeUrgencia3 == 'D') {
             statusPaciente3 = "Concluido";
         } else {
             statusPaciente3 = "Não concluido, você ainda é um residente";
         }
     } else {
         statusPaciente3 = "Atendimento concluido, você é um médico formado!";
     }
     
     
     System.out.println("Nome do medico:" + nomeMedico3);
     System.out.println("Idade:" + idadeMedico3);
     System.out.println("Nome do Atendimento:" + nomeAtendimento3);
     System.out.println("Nome do paciente:" + nomeDoPaciente3);
     System.out.println("Nivel de urgência: " + nivelDeUrgencia3);
     System.out.println("O ststus: " + statusPaciente3);
     
     
 }
}



