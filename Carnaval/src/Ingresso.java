import java.util.Scanner;

class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    public void imprimirValor() {
        System.out.println("Ingresso Normal");
        System.out.println("Valor do ingresso: R$" + getValor());
    }
}

class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimirValor() {
        double valorTotal = getValor() + valorAdicional;
        System.out.println("Ingresso VIP");
        System.out.println("Valor do ingresso: R$" + valorTotal);
    }
}

class Camarote extends Ingresso {
    private String localizacao;
    private double valorAdicional;

    public Camarote(double valor, double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public void imprimirValor() {
        double valorTotal = getValor() + valorAdicional;
        System.out.println("Ingresso Camarote");
        System.out.println("Valor do ingresso: R$" + valorTotal);
        System.out.println("Localização do camarote: " + localizacao);
    }
}