import java.util.ArrayList;
import java.util.Arrays;

/*2) Escreva em Java uma classe Continente. Um continente possui um nome e é composto
por um conjunto de países. Forneça os membros de classe a seguir:
a) Construtor que inicialize o nome do continente; ok
b) Um método que permita adicionar países aos continentes; ok
c) Um método que retorne a dimensão total do continente; ok
d) Um método que retorne a população total do continente; ok
e) Um método que retorne a densidade populacional do continente; ok
f) Um método que retorne o país com maior população no continente; ok
g) Um método que retorne o país com menor população no continente; ok
h) Um método que retorne o país de maior dimensão territorial no continente; ok
i) Um método que retorne o país de menor dimensão territorial no continente; ok
j) Um método que retorne a razão territorial do maior pais em relação ao menor país.*/
public class Continente {
    String nome;
    ArrayList<String> paises;
    ArrayList<Integer> dimensoes;
    ArrayList<Integer> populacoes;
    double razao = 0.0;

    public ArrayList<String> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<String> paises) {
        this.paises = paises;
    }

    public ArrayList<Integer> getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(ArrayList<Integer> dimensoes) {
        this.dimensoes = dimensoes;
    }

    public ArrayList<Integer> getPopulacoes() {
        return populacoes;
    }

    public void setPopulacoes(ArrayList<Integer> populacoes) {
        this.populacoes = populacoes;
    }

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
        this.dimensoes = new ArrayList<>();
        this.populacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void AddPais(String pais, int populacao, int dimensao) {
        paises.add(pais);
        populacoes.add(populacao);
        dimensoes.add(dimensao);
        System.out.println("País adicionado- " + paises);
    }

    public void DimensaoContinente() {
        switch (nome) {
            case "Africa":
                System.out.println("A dimensão total deste continente é: 30.365.000 km²");
                break;
            case "América":
                System.out.println("A dimensão total deste continente é: 42.044.000 km²");
                break;
            case "Ásia":
                System.out.println("A dimensão total deste continente é: 44.614.000 km²");
                break;
            case "Europa":
                System.out.println("A dimensão total deste continente é: 10.000.000 km².");
                break;
            case "Oceania":
                System.out.println("A dimensão total deste continente é: 8.564.000 km²");
                break;
            case "Antártida":
                System.out.println("A dimensão total deste continente é: 14.200.000 km²");
                break;
            default:
                System.out.println("Continente não reconhecido.");
        }
    }

    public void PopulacaoContinente() {
        switch (nome) {
            case "Africa":
                System.out.println("A população total deste continente é: 1.373.486.000 habitantes");
                break;
            case "América":
                System.out.println("A população total deste continente é: 1.030.851.000 habitantes");
                break;
            case "Ásia":
                System.out.println("A população total deste continente é: 4.679.661.000 habitantes");
                break;
            case "Europa":
                System.out.println("A população total deste continente é: 747.747.000 habitantes.");
                break;
            case "Oceania":
                System.out.println("A população total deste continente é: 43.220.000 habitantes");
                break;
            case "Antártida":
                System.out.println("A Antártida é um continente não habitado");
                break;
            default:
                System.out.println("Continente não reconhecido.");
        }
    }

    public void DensidadePopulacionalContinente() {
        switch (nome) {
            case "Africa":
                System.out.println("A densidade populacional deste continente é: 40,5 hab/km2");
                break;
            case "América":
                System.out.println("A densidade populacionall deste continente é: 21,40 hab/km2");
                break;
            case "Ásia":
                System.out.println("A densidade populacional deste continente é: 101,86 hab/km2");
                break;
            case "Europa":
                System.out.println("A densidade populacional deste continente é: 72,8 hab/km2");
                break;
            case "Oceania":
                System.out.println("A densidade populacional deste continente é: 4,45 hab/km2");
                break;
            case "Antártida":
                System.out.println("A Antártida é um continente não habitado");
                break;
            default:
                System.out.println("Continente não reconhecido.");
        }
    }

    public double maiorPopulacao() {
        double maior = populacoes.get(0);
        int index = 0;

        for (int i = 1; i < populacoes.size(); i++) {
            if (populacoes.get(i) > maior) {
                maior = populacoes.get(i);
                index = i;
            }
        }
        String formated = String.format("%,d", (int) populacoes.get(index));
        System.out.println("O país com maior população no continente é: "
                + paises.get(index) + ", com " + formated + " de habitantes.");
        return maior;
    }

    public double menorPopulacao() {
        double menor = populacoes.get(0);
        int index = 0;

        for (int i = 1; i < populacoes.size(); i++) {
            if (populacoes.get(i) < menor) {
                menor = populacoes.get(i);
                index = i;
            }
        }
        String formated = String.format("%,d", (int) populacoes.get(index));
        System.out.println("O país com menor população no continente é: "
                + paises.get(index) + ", com " + formated + " de habitantes.");
        return menor;
    }

    public double maiorDimensao(boolean imprimirMensagem) {
        double maior = dimensoes.get(0);
        int index = 0;

        for (int i = 1; i < dimensoes.size(); i++) {
            if (dimensoes.get(i) > maior) {
                maior = dimensoes.get(i);
                index = i;
            }
        }
        if (imprimirMensagem) {
            String formated = String.format("%,d", (int) dimensoes.get(index));
            System.out.println("O país com maior dimensão territorial no continente é: "
                    + paises.get(index) + ". Com " + formated + " km².");
        }
        return maior;
    }

    public double menorDimensao(boolean imprimirMensagem) {
        double menor = dimensoes.get(0);
        int index = 0;

        for (int i = 1; i < dimensoes.size(); i++) {
            if (dimensoes.get(i) < menor) {
                menor = dimensoes.get(i);
                index = i;
            }
        }
        if (imprimirMensagem) {
            String formated = String.format("%,d", (int) dimensoes.get(index));
            System.out.println("O país com menor dimensão territorial no continente é: "
                    + paises.get(index) + ". Com " + formated + " km².");
        }
        return menor;
    }

    public double razaoTerritorial() {
        Double razaoMaior = maiorDimensao(false);
        Double razaoMenor = menorDimensao(false);
        razao = razaoMaior / razaoMenor;

        System.out.println("A razão territorial do maior pais em relação ao menor país é de: " + razao);
        return 0;
    }

}
