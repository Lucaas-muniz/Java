/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;

import javax.swing.JOptionPane;

/**
 * Desenvolvido por Lucas Muniz da Silva
 */
public class Pesquisa {

    public static void main(String[] args) {

//Declarando atributos.
        String candidato1 = "Zé da Farmácia";
        String candidato2 = "Rita da Padaria";
        float quantVotos1 = 0;
        float quantVotos2 = 0;
        float porcentagem1 = 0;
        float porcentagem2 = 0;
        int totalPesquisados = 0;

        
//Fazendo leitura do total de pessoas a serem pesquisadas.        
        String totalPesquisadosStr = JOptionPane.showInputDialog("Informe total de pessoas a serem pesquisadas.");
        totalPesquisados = Integer.parseInt(totalPesquisadosStr);

        
//Estrutura de repetição e contagem de votos.  
        int op = 0;
        int i = 1;
        while (i <= totalPesquisados) {
            String opstr = JOptionPane.showInputDialog(i + "- Escolha entre os candidatos:\n"
                    + "1-" + candidato1 + "\n2-" + candidato2 + "\n");
            op = Integer.parseInt(opstr);
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Voto computado com sucesso.\n");
                    quantVotos1++;
                    i++;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Voto computado com sucesso.\n");
                    quantVotos2++;
                    i++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite um numero valido.\n");
                    break;
            }
        }

        
//Calculando a porcentagem por candidato.
        porcentagem1 = (quantVotos1 * 100) / totalPesquisados;
        porcentagem2 = (quantVotos2 * 100) / totalPesquisados;

        
//Formatando as saídas e exibindo resultado da pesquisa.
        String porc1 = String.format("%.2f", porcentagem1);
        String porc2 = String.format("%.2f", porcentagem2);
        String qt1 = String.format("%.0f", quantVotos1);
        String qt2 = String.format("%.0f", quantVotos2);
        JOptionPane.showMessageDialog(null, "RESULTADO FINAL:\n"
                + "Total de pessoas pesquisadas: " + totalPesquisados + "\n\n"
                + "Candidato(a): " + candidato1 + ".\n"
                + "Votos recebidos: " + qt1 + "   Porcentagem: " + porc1 + "%.\n\n"
                + "Candidato(a): " + candidato2 + ".\n"
                + "Votos recebidos: " + qt2 + "   Porcentagem: " + porc2 + "%.\n");
    }
}
;