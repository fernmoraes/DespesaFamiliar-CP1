/*
    Nome / RM:
    Fernando Navajas Moraes RM555080;
    José Guilherme Sipaúba Costas RM557274;
    Henrique Botti RM556187;
*/

package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.bean.DespesaFamiliar;

public class Main {
    public static void main(String[] args) {

        // Inicia o Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da renda familiar: ");
        double rendaFamiliar = scanner.nextDouble();
        System.out.print("Digite o número de moradores: ");
        int numeroDeMoradores = scanner.nextInt();
        System.out.print("Digite o gasto com luz: ");
        double gastoComLuz = scanner.nextDouble();
        System.out.print("Digite o gasto com água: ");
        double gastoComAgua = scanner.nextDouble();
        System.out.print("Digite o gasto com internet: ");
        double gastoComInternet = scanner.nextDouble();
        System.out.print("Digite o valor da mensalidade da academia: ");
        double valorMensalidadeDaAcademia = scanner.nextDouble();

        // Instância da classe DespesaFamiliar
        DespesaFamiliar despesa = new DespesaFamiliar();

        // Dados inseridos salvos
        despesa.setRendaFamiliar(rendaFamiliar);
        despesa.setNumeroDeMoradores(numeroDeMoradores);
        despesa.setGastoComLuz(gastoComLuz);
        despesa.setGastoComAgua(gastoComAgua);
        despesa.setGastoComInternet(gastoComInternet);
        despesa.setValorMensalidadeDaAcademia(valorMensalidadeDaAcademia);

        // Calcula o total de despesas
        double totalDespesas = despesa.calcularTotalDeDespesas();
        double rendaLiquida = despesa.calcularRendaFamiliarLiquida();

        // Exibir no terminal
        System.out.printf("Renda Familiar: %.3f%n", rendaFamiliar);
        System.out.printf("Total de Despesas: %.3f%n", totalDespesas);
        System.out.printf("Renda Familiar Líquida: %.3f%n", rendaLiquida);
    }
}
