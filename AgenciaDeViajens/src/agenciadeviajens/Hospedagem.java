package agenciadeviajens;

public class Hospedagem {

    double valorDiaria;
    String descricao;

    /* Metodos Construtores*/
    public Hospedagem() {
      this.descricao = "Valor Padrão para Hotéis, Pousadas, Resorts e Casas de campo!";
    }

    public Hospedagem(double valorDiaria) {
        this.valorDiaria = valorDiaria;
        
    }

}
