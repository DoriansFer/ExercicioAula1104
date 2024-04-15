/*1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem
de itens ou eventos. A classe deve oferecer métodos que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.*/

public class Contador {
    int n = 0;
    int nInicial;

    public Contador(int n) {
        this.n = n;
        nInicial = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getnInicial() {
        return nInicial;
    }

    public void setnInicial(int nInicial) {
        this.nInicial = nInicial;
    }

    public void zerar() {
        n = 0;
        System.out.println("Contador zerado: "+n);
    }

    public void incrementar() {
        n++;
        System.out.println("Contador incrementado: "+n);
    }

    public void exibirContInicial() {
        System.out.println("Contador inicial: "+nInicial);
    }

    public void imprimir() {
        System.out.println("Contador: "+n);
    }


    public static void main(String[] args) {
        Contador cont1 = new Contador(4);
        cont1.imprimir();
        cont1.incrementar();
        cont1.zerar();
        cont1.exibirContInicial();
    }
}