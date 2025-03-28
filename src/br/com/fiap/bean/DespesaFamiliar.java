package br.com.fiap.bean;

public class DespesaFamiliar {
    // Atributos privados que armazenam os dados das despesas e renda da família.
    private double rendaFamiliar;               // Renda total da família mensalmente.
    private int numeroDeMoradores;              // Número total de moradores da residência.
    private double gastoComLuz;                 // Gasto mensal com luz.
    private double gastoComAgua;                // Gasto mensal com água.
    private double gastoComInternet;            // Gasto mensal com internet.
    private double valorMensalidadeDaAcademia;  // Valor da mensalidade da academia.

    // Construtor padrão.
    public DespesaFamiliar() {
        // Inicializa os atributos, se necessário.
    }

    // Métodos getters e setters para cada atributo.

    public double getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(double rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public int getNumeroDeMoradores() {
        return numeroDeMoradores;
    }

    public void setNumeroDeMoradores(int numeroDeMoradores) {
        this.numeroDeMoradores = numeroDeMoradores;
    }

    public double getGastoComLuz() {
        return gastoComLuz;
    }

    public void setGastoComLuz(double gastoComLuz) {
        this.gastoComLuz = gastoComLuz;
    }

    public double getGastoComAgua() {
        return gastoComAgua;
    }

    public void setGastoComAgua(double gastoComAgua) {
        this.gastoComAgua = gastoComAgua;
    }

    public double getGastoComInternet() {
        return gastoComInternet;
    }

    public void setGastoComInternet(double gastoComInternet) {
        this.gastoComInternet = gastoComInternet;
    }

    public double getValorMensalidadeDaAcademia() {
        return valorMensalidadeDaAcademia;
    }

    public void setValorMensalidadeDaAcademia(double valorMensalidadeDaAcademia) {
        this.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;
    }

    // Método para calcular o total de despesas.
    // Considera: gasto com luz, água, internet e o custo da academia para cada morador.
    public double calcularTotalDeDespesas() {
        double totalAcademia = numeroDeMoradores * valorMensalidadeDaAcademia; // Calcula o gasto total com academia.
        double totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + totalAcademia; // Soma todas as despesas.
        return totalDespesas; // Retorna o valor total das despesas.
    }

    // Método para calcular a renda familiar líquida.
    // Calcula o valor restante após subtrair o total de despesas da renda familiar.
    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas(); // Retorna a renda líquida.
    }
}
