import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Saldo saldo = new Saldo();

        System.out.println("Adicione os ganhos:");
        System.out.print("Tipo de ganho (salario, freelancer ou dividendos): ");
        String tipoGanho = sc.nextLine();
        System.out.print("Data do ganho (dd/mm/yyyy): ");
        String dataGanho = sc.nextLine();
        System.out.print("Valor do ganho: ");
        double valorGanho = sc.nextDouble();
        saldo.addGanho(tipoGanho, dataGanho, valorGanho);

        sc.nextLine();

        System.out.println("\nAdicione os gastos:");
        System.out.print("Tipo de gasto (alimentacao, transporte, saude ou imposto): ");
        String tipoGasto = sc.nextLine();
        System.out.print("Data do gasto (dd/mm/yyyy): ");
        String dataGasto = sc.nextLine();
        System.out.print("Valor do gasto: ");
        double valorGasto = sc.nextDouble();
        sc.nextLine();
        System.out.print("Forma de pagamento do gasto (debito, credito, pix ou cheque): ");
        String formaPagamento = sc.nextLine();
        saldo.addGasto(tipoGasto, dataGasto, valorGasto, formaPagamento);

        System.out.print("\n" + saldo.mostraBalanco());
    }
}
