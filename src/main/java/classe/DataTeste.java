package classe;

public class DataTeste {

    public static void main(String[] args) {
        // Estanciando data
        Data d1 = new Data(); // chamando construtor.

        var d2 = new Data(31, 12, 2020); //modificando data pelo contrutor.

        String dataFormatada1 = d1.obterDataFormatada();
        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());
        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
