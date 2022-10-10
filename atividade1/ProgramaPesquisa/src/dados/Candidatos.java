/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

//Desenvolvido por Lucas Muniz
public class Candidatos {

//Declarando atributos.
    private String nome;
    private int quantVotos;
    private double porcentagem;
    private int totalPesquisados;

//Implementando os métodos sets e gets dos atributos.
    public void setTotal(int totalPesquisados) {
        this.totalPesquisados = totalPesquisados;
    }

    public int getTotal() {
        return totalPesquisados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantVotos(int quantVotos) {
        this.quantVotos = quantVotos;
    }

    public int getquantVotos() {
        return quantVotos;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

//Implementando os constructs.    
    public Candidatos() {
        this.setNome("");
        this.setQuantVotos(0);
        this.setPorcentagem(0);
        this.setTotal(0);
    }

    public Candidatos(String nom, int quant, double porc, int tot) {
        this.setNome(nom);
        this.setQuantVotos(quant);
        this.setPorcentagem(porc);
        this.setTotal(tot);
    }

//Método para calcular quantidade de votos por candidato.
    public int calcularVotos() {
        int total = quantVotos;
        total++;
        return total;
    }

//Método para calcular a porcentagem por candidato.    
    public double calcularPorcentagem() {
        double resultado = (quantVotos * 100) / totalPesquisados;
        return resultado;
    }

//Método para return do resultado da pesquisa. 
    public String mostrar() {
        String retorno = "Candidato(a): " + this.getNome() + "\nVotos recebidos: " + this.getquantVotos() + "\nPorcentagem: " + this.getPorcentagem() + "%.\n\n";
        return retorno;
    }
}
