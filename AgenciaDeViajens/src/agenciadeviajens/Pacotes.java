package agenciadeviajens;

public class Pacotes {

    double transporte;
    double hospedagem;
    String destino;
    double quantDias;
    double margem;
    double valorTotal;
    String tipoHospedagem;
    String tipoTransporte;

    public Pacotes() {

    }

    public Pacotes(float transporte, float hospedagem, String destino, int quantDias, float margem, float valorTotal, String tipoHospedagem, String tipoTransporte) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantDias = quantDias;
        this.margem = margem;
        this.valorTotal = valorTotal;
        this.tipoHospedagem = tipoHospedagem;
        this.tipoTransporte = tipoTransporte;
    }

    /* OK */
    public double calcularHospedagem(double quantDias, double hospedagem) {
        double total;
        total = quantDias * hospedagem;
        return total;

    }

    public double margemDeLucro(double margem, double valorTotal) {
        double total;
        total = valorTotal + (valorTotal * margem);
        return total;
    }

    public double totalPacote(double transporte, double hospedagem) {
        double pacoteTotal;
        pacoteTotal = transporte + hospedagem;
        return pacoteTotal;
    }

    public double aplicaDu(double porcentagem, double total2) {
        double taxa;
        taxa = total2*porcentagem;
        return taxa;
    }
}
