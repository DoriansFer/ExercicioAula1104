public class Main {
    public static void main(String[] args) {
        Continente continente1 = new Continente("Africa");
        continente1.DimensaoContinente();
        continente1.AddPais("Argélia" , 44009000, 2382000);
        continente1.AddPais("Angola", 35059000,1247000);
        continente1.AddPais("Nigéria", 218005000,923768);
        continente1.AddPais("Gana", 33048000,238533);
        continente1.maiorDimensao(true);
        continente1.menorDimensao(true);
        continente1.DensidadePopulacionalContinente();
         continente1.razaoTerritorial();
        continente1.maiorPopulacao();
        continente1.menorPopulacao();


        Continente continente2 = new Continente("America");
        continente2.AddPais("Brasil", 215003000, 8510000);
        continente2.AddPais("El Salvador", 6336000, 21041);

    }
}
