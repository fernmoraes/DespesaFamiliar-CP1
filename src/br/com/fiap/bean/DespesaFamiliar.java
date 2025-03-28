/*
    Nome / RM:
    Fernando Navajas Moraes RM555080;
    José Guilherme Sipaúba Costas RM557274;
    Henrique Botti RM556187;
*/

package br.com.fiap.bean;

public class DespesaFamiliar {

    // Atributos privados
    private double rendaFamiliar;
    private int numeroDeMoradores;
    private double gastoComLuz;
    private double gastoComAgua;
    private double gastoComInternet;
    private double valorMensalidadeDaAcademia;

    // Metodos getters e setters
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

    // Metodo para calcular o total de despesas
    // Multiplica o valor da academia pelo numero de membros e soma com as outras despesas
    public double calcularTotalDeDespesas() {
        double totalAcademia = numeroDeMoradores * valorMensalidadeDaAcademia; // Calcula o gasto total com academia
        double totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + totalAcademia; // Soma todas as despesas
        return totalDespesas;
    }

    // Metodo para calcular a renda familiar líquida
    // Calcula o valor restante após subtrair o total de despesas da renda familiar
    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}
