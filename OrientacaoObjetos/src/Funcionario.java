public class Funcionario {

    //Classe é um tipo e objeto é a instancia

    //ATRIBUTOS (DADOS)

    public String nome;
    public double valorPorHora;
    public int horas;


    //METODOS ((FUNÇÕES) COMPORTAMENTO) - algo que é executado e gera resultado

    public double total() {
        return valorPorHora * horas;
    }

}
