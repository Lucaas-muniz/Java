
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * Desenvolvido por Lucas Muniz da Silva
 */
import dados.Candidatos;

public class principal {

    public static void main(String[] args) {

//Instânciando objetos e setando os nomes dos candidatos.
        Candidatos can1 = new Candidatos();
        Candidatos can2 = new Candidatos();
        can1.setNome("Ze da Farmacia");
        can2.setNome("Rita da Padaria");

//Fazendo leitura do total de pessoas a serem pesquisadas.        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe total de pessoas a serem pesquisadas.\n");
        int var = ler.nextInt();
        can1.setTotal(var);
        can2.setTotal(var);

//Estrutura de repetição e contagem de votos.  
        int op = 0;
        int i = 1;
        while (i <= var) {
            System.out.println(i + "- Escolha entre os candidatos:\n");
            System.out.println("1-" + can1.getNome() + "\n");
            System.out.println("2-" + can2.getNome() + "\n");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Voto computado com sucesso.\n");
                    can1.setQuantVotos(can1.calcularVotos());
                    can1.setPorcentagem(can1.calcularPorcentagem());
                    i++;
                    break;
                case 2:
                    System.out.println("Voto computado com sucesso.\n");
                    can2.setQuantVotos(can2.calcularVotos());
                    can2.setPorcentagem(can2.calcularPorcentagem());
                    i++;
                    break;
                default:
                    System.out.println("Digite uma opcao valida.\n");
                    break;
            }

        }

//Exibindo resultado final.    
        System.out.print("Resultado final:\n");
        System.out.print("Total de pessoas pesquisadas: " + var + "\n\n");
        System.out.print(can1.mostrar());
        System.out.print(can2.mostrar());

    }

}
