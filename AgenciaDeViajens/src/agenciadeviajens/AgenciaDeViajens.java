package agenciadeviajens;

import java.util.Scanner;

public class AgenciaDeViajens {

    double meioTransporte;
    double hospedagem;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        Scanner entrada5 = new Scanner(System.in);
        Scanner entrada6 = new Scanner(System.in);
        Scanner entrada7 = new Scanner(System.in);

        meioTransporte transporte = new meioTransporte();
        Hospedagem hospedagem = new Hospedagem();
        Pacotes pacote = new Pacotes();
        Venda venda = new Venda();
        AgenciaDeViajens agencia = new AgenciaDeViajens();
        double cotDolar, real, dolar;

        System.out.println("---- Sistema de Viagens JKA ----\n");

        System.out.println("      Valores para Calculo \n");

        /* Entrada valores meios de Transporte */
        System.out.println("// Meios de transporte //");
        System.out.print("Rodoviario - U$ ");
        transporte.rodoviario = entrada.nextDouble();
        System.out.print("Aéreo - U$ ");
        transporte.aereo = entrada.nextDouble();
        System.out.print("Maritimo - U$ ");
        transporte.maritimo = entrada.nextDouble();
        System.out.print("Carro Particular - U$ ");
        transporte.carroParticular = entrada.nextDouble();

        /* Entrada Valores Hospedagem e descrição */
        System.out.print("\nValor para hospedagem - U$ ");
        hospedagem.valorDiaria = entrada.nextFloat();
        System.out.println(hospedagem.descricao);

        /* Entrada de dados para Venda */
        System.out.println("\n // Dados para a venda //");
        System.out.print("Nome do Cliente - ");
        venda.nome = entrada2.nextLine();
        System.out.print("Forma de Pagamento - ");
        venda.formaPagamento = entrada3.nextLine();
        System.out.print("Meio de Transporte - ");
        pacote.tipoTransporte = entrada4.nextLine();
        System.out.print("Hospedagem - ");
        pacote.tipoHospedagem = entrada5.nextLine();
        System.out.print("Quantidade de dias - ");
        pacote.quantDias = entrada6.nextInt();
        System.out.print("Destino - ");
        pacote.destino = entrada7.nextLine();

        agencia.hospedagem = pacote.calcularHospedagem(pacote.quantDias, hospedagem.valorDiaria);

        /* Validação do Tipo de Transporte */
        if (pacote.tipoTransporte.equals("Aereo")) {
            agencia.meioTransporte = transporte.aereo;
        } else if (pacote.tipoTransporte.equals("Rodoviario")) {
            agencia.meioTransporte = transporte.rodoviario;
        } else if (pacote.tipoTransporte.equals("Maritimo")) {
            agencia.meioTransporte = transporte.maritimo;
        } else if (pacote.tipoTransporte.equals("Carro Particular")) {
            agencia.meioTransporte = transporte.carroParticular;
        } else {
            System.out.println("\nTransporte Invalido");
        }


        /* Entrada de dados Margem de Lucro */
        System.out.println("\nInforme a margem de lucro em Porcentagem: ");
        System.out.print("Exemplo: 1,0 = 100% - ");
        pacote.margem = entrada.nextDouble();

        /* Calculando Margem de Lucro através do Método margemDeLucro()*/
        
        System.out.println("Valor do transporte aplicando Lucro: "
                + pacote.margemDeLucro(pacote.margem, agencia.meioTransporte));
        System.out.println("Valor da hospedagem aplicando Lucro: "
                + pacote.margemDeLucro(pacote.margem, agencia.hospedagem));

        System.out.print("\nDigite a cotação atual do Dólar - ");
        cotDolar = entrada.nextDouble();

        /* Mostrando valores totais do Pacote */
        System.out.println("\n// INFORMAÇÕES GERAIS DA VENDA //");
        
        /* Atribuindo calculos a Variavel dolar */
        dolar = pacote.totalPacote(pacote.margemDeLucro(pacote.margem, agencia.meioTransporte),
                pacote.margemDeLucro(pacote.margem, agencia.hospedagem));
        
        /* Atribuindo calculos a Variavel real */
        real = venda.converteDolar(pacote.totalPacote(pacote.margemDeLucro(pacote.margem, agencia.meioTransporte),
                pacote.margemDeLucro(pacote.margem, agencia.hospedagem)), cotDolar);
       
        /* Aplicando Taxa DU, fixa para todas Agencias de Viajens */
        dolar += pacote.aplicaDu(0.10, dolar);
        real += pacote.aplicaDu(0.10, real);
        
        /* Exibindo através do Método exibeResult() */
        venda.exibeResult(venda.nome, venda.formaPagamento, pacote.tipoTransporte,
                pacote.tipoHospedagem, (int) pacote.quantDias, pacote.destino, cotDolar, pacote.margem, real, dolar);
       
        /* Mostrando data do sistema através do Método retornaData() */
        System.out.print("Data da Venda - ");
        System.out.println(venda.retornaData());

        System.out.println("\nFim do Programa ");

    }

}
