package agenciadeviajens;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {

    String nome;
    String formaPagamento;
    double pacoteViajem;
    
    

    public Venda() {

    }

    public Venda(String nome, String formaPagamento, double pacoteViajem) {
        this.nome = nome;
        this.formaPagamento = formaPagamento;
        this.pacoteViajem = pacoteViajem;
    }

    public double converteDolar(double valorDolar, double cotDolar) {
        double valReal;
        valReal = cotDolar * valorDolar;
        return valReal;
    }

    public void exibeResult(String nome, String formaPagamento,
            String meioT, String hotEscolhido, int quantDias, String destino,
            double cotDolar, double lucro, double pacoteReal, double pacoteDolar) {

        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Meio de Transporte: " + meioT);
        System.out.println("Hospedagem: " + hotEscolhido);
        System.out.println("Quantidade de dias hospedado: " + quantDias);
        System.out.println("Destino: " + destino);
        System.out.println("Cotação atual Dólar: " + cotDolar);
        System.out.println("Margem de lucro aplicada - " + lucro);
        System.out.println("Taxa DU fixa: 10%");
        System.out.println("\nValor do pacote em Real: R$ " + pacoteReal);
        System.out.println("Valor do pacote em Dólar: U$ " + pacoteDolar);
        
          }

        String retornaData() {
        DateFormat formaData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        return formaData.format(data);
        }
    }
