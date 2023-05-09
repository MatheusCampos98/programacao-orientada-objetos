import java.util.ArrayList;
import java.util.List;

public class Saldo {
    private List<Ganho> ganhos;
    private List<Gasto> gastos;

    public Saldo() {
        this.ganhos = new ArrayList<Ganho>();
        this.gastos = new ArrayList<Gasto>();
    }

    public void addGanho(String tipo, String data, double valor) {
        Ganho ganho = new Ganho(tipo, data, valor);
        ganhos.add(ganho);
    }

    public void addGasto(String tipo, String data, double valor, String formaPagamento) {
        Gasto gasto = new Gasto(tipo, data, valor, formaPagamento);
        gastos.add(gasto);
    }

    public double calculaTotalGanhos() {
        double totalGanhos = 0;
        for (Ganho ganho : ganhos) {
            totalGanhos += ganho.getValor();
        }
        return totalGanhos;
    }

    public double calculaTotalGastos() {
        double totalGastos = 0;
        for (Gasto gasto : gastos) {
            totalGastos += gasto.getValor();
        }
        return totalGastos;
    }

    public double calculaSaldo() {
        double totalGanhos = calculaTotalGanhos();
        double totalGastos = calculaTotalGastos();
        return totalGanhos - totalGastos;
    }

    public void mostraBalanco() {
        System.out.println("-----Balanco-----");
        System.out.println("Total de ganhos: R$" + calculaTotalGanhos());
        System.out.println("Total de gastos: R$" + calculaTotalGastos());
        System.out.println("Saldo final: R$" + calculaSaldo());
    }
}
