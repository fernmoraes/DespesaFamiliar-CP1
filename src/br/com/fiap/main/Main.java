package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.bean.DespesaFamiliar;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar as entradas do usuário.
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o valor da renda familiar.
        System.out.print("Digite o valor da renda familiar: ");
        double rendaFamiliar = scanner.nextDouble();

        // Solicita e lê o número de moradores da residência.
        System.out.print("Digite o número de moradores: ");
        int numeroDeMoradores = scanner.nextInt();

        // Solicita e lê o valor do gasto com luz.
        System.out.print("Digite o gasto com luz: ");
        double gastoComLuz = scanner.nextDouble();

        // Solicita e lê o valor do gasto com água.
        System.out.print("Digite o gasto com água: ");
        double gastoComAgua = scanner.nextDouble();

        // Solicita e lê o valor do gasto com internet.
        System.out.print("Digite o gasto com internet: ");
        double gastoComInternet = scanner.nextDouble();

        // Solicita e lê o valor da mensalidade da academia.
        System.out.print("Digite o valor da mensalidade da academia: ");
        double valorMensalidadeDaAcademia = scanner.nextDouble();

        // Fecha o Scanner para liberar o recurso.
        scanner.close();

        // Cria uma instância da classe DespesaFamiliar e atribui os valores lidos.
        DespesaFamiliar despesa = new DespesaFamiliar();
        despesa.setRendaFamiliar(rendaFamiliar);
        despesa.setNumeroDeMoradores(numeroDeMoradores);
        despesa.setGastoComLuz(gastoComLuz);
        despesa.setGastoComAgua(gastoComAgua);
        despesa.setGastoComInternet(gastoComInternet);
        despesa.setValorMensalidadeDaAcademia(valorMensalidadeDaAcademia);

        // Calcula o total de despesas e a renda familiar líquida utilizando os métodos da classe.
        double totalDespesas = despesa.calcularTotalDeDespesas();
        double rendaLiquida = despesa.calcularRendaFamiliarLiquida();

        // Exibe os resultados com três casas decimais utilizando o método printf.
        System.out.printf("Renda Familiar: %.3f%n", rendaFamiliar);
        System.out.printf("Total de Despesas: %.3f%n", totalDespesas);
        System.out.printf("Renda Familiar Líquida: %.3f%n", rendaLiquida);
    }
}
