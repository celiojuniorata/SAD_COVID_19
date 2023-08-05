package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
   public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("SISTEMA DE AJUDA NO DIAGNÓSTICO DA COVID-19 (SAD-COVID)");
        System.out.println("------------------------------------------------------------------\n");

        System.out.print("Informe o seu nome: ");
        String nome = entrada.nextLine().toUpperCase();
        
        System.out.printf("%s, informe a sua idade (em anos): ", nome);
        double idade;
        while (true) { // Enquanto não digitar um número válido, continua no while
         try {
            idade = Double.parseDouble(entrada.nextLine().replace(",", "."));
            break;
         } catch (NumberFormatException e) {
            System.out.println("Digite um número válido");
         }
        }

        String fumante; 
        do {
         System.out.printf("%s, voce é fumante [s/n]: ", nome);
         fumante = entrada.nextLine().toLowerCase();
        } while (!fumante.equals("s") && !fumante.equals("n"));


        System.out.println("------------------------------------------------------------------");
        System.out.println("DOENÇAS PRÉ-EXISTENTES");
        System.out.println("------------------------------------------------------------------\n");

        List<String> doencasPreExistentes = new ArrayList<>(); // Cria uma lista para armazenar os valores "s"

        String hipertenso;
        do {
         System.out.print("Voce é hipertenso(a) [s/n]: ");
         hipertenso = entrada.nextLine().toLowerCase();
        } while (!hipertenso.equals("s") && !hipertenso.equals("n"));

        if(hipertenso.equals("s")) {
         doencasPreExistentes.add("hipertenso");
        }


        String asmatico;
        do {
         System.out.print("Você é asmático(a) [s/n]: ");
         asmatico = entrada.nextLine().toLowerCase();
        } while (!asmatico.equals("s") && !asmatico.equals("n"));

        if (asmatico.equals("s")) {
         doencasPreExistentes.add("asmatico");
        }


        String diabetico;
        do {
         System.out.print("Você é diabético(a) [s/n]: ");
         diabetico = entrada.nextLine().toLowerCase();
        } while (!diabetico.equals("s") && !diabetico.equals("n"));

        if(diabetico.equals("s")) {
         doencasPreExistentes.add("diabetico");
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("SINTOMAS APRESENTADOS");
        System.out.println("------------------------------------------------------------------\n");

        List<String> sintomasApresentados = new ArrayList<>();

        String tosseSeca;
        do {
         System.out.print("Você está com tosse seca? [s/n]: ");
         tosseSeca = entrada.nextLine().toLowerCase();
        } while (!tosseSeca.equals("s") && !tosseSeca.equals("n"));

        if(tosseSeca.equals("s")) {
         sintomasApresentados.add("Tosse Seca");
        }


        String exausto;
        do {
         System.out.print("Você está com cansaço exessivo? [s/n]: ");
         exausto = entrada.nextLine().toLowerCase();
        } while (!exausto.equals("s") && !exausto.equals("n"));

        if(exausto.equals("s")) {
         sintomasApresentados.add("Cansaço Execessivo");
        }


        String febre;
        do {
         System.out.print("Você está com febre persistente? [s/n]: ");
         febre = entrada.nextLine().toLowerCase();
        } while (!febre.equals("s") && !febre.equals("n"));

        if(febre.equals("s")) {
         sintomasApresentados.add("Febre Persistente");
        }


        String respirar;
        do {
         System.out.print("Você está com dificuldade de respirar? [s/n]: ");
         respirar = entrada.nextLine().toLowerCase();
        } while (!respirar.equals("s") && !respirar.equals("n"));

        if(respirar.equals("s")) {
         sintomasApresentados.add("Dificuldade para respirar");
        }


        System.out.println("------------------------------------------------------------------");
        System.out.println("RELATÓRIO DOS DADOS INFORMADOS");
        System.out.println("------------------------------------------------------------------\n");

        System.out.printf("%s, segue o relatório baseado em suas respostas: ",nome);

        if (idade >= 60) {
         System.out.printf("\nVocê está com %.0f anos, portanto está em grupo de risco pela idade.\n", idade);
        } else {
         System.out.printf("\nVocê está com %.0f anos, portanto não está em grupo de risco pela idade.\n", idade);
        }

        if (fumante.equals("s")) {
           System.out.println("Você é fumante. Cuidado! Isso pode agravar seu quadro respiratório\n");
         } else {
         System.out.println("Você não é fumante. Parabéns! Isso pode não agravar seu quadro respiratório\n");
        }

        
         // Verifica se há doenças pré-existentes e imprime a mensagem adequada
         if (!doencasPreExistentes.isEmpty()) {
            System.out.println("Você possui os seguintes quadros de doenças pré-existentes:");
            for (String doenca : doencasPreExistentes) {
                System.out.println("-> " + doenca);
            }
        } else {
            System.out.println("Você não possui nenhum quadro de doenças pré-existentes.");
        }

        if(!sintomasApresentados.isEmpty()) {
         System.out.println("Você possui sintomas da COVID-19, procure URGENTEMENTE um posto de saúde!");
         for(String sintomas : sintomasApresentados) {
            System.out.println("-> " + sintomas);
         }
        } else {
         System.out.println("Você não possui nenhum sintoma da COVID-19, continue utilizando máscara e lavando as mãos.");
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("SALVE VIDAS, USE MÁSCARA E LAVE AS MÃOS!");
        System.out.println("------------------------------------------------------------------");
        System.out.println("OBRIGADO POR UTILIZAR O SISTEMA");
        System.out.println("------------------------------------------------------------------");
        entrada.close();
   }
}
