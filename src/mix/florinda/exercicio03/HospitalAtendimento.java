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
             statusPaciente1 = "Concluida";
         } else {
             statusPaciente1 = "Não concluida";
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
     char nivelDeUrgencia3 = 'D';
     
     
     System.out.println("Nome do medico:" + nomeMedico3);
     System.out.println("Idade:" + idadeMedico3);
     System.out.println("Nome do Atendimento:" + nomeAtendimento3);
     System.out.println("Nome do paciente:" + nomeDoPaciente3);
     System.out.println("Nivel de urgência: " + nivelDeUrgencia3);
     System.out.println("O ststus: " + statusPaciente3);
     
     
 }
}



