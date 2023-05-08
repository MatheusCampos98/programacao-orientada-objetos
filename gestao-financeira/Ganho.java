public class Ganho {
    private String tipo;
    private String data;
    private double valor;

    public Ganho(String tipo, String data, double valor) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}
