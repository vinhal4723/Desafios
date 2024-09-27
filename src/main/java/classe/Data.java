package classe;

public class Data {
 // definindo atributos.
    int dia;
    int mes;
    int ano;
 // definindo construtor padrão.
    Data() {
        // definindo data padrão.
        dia = 1;
        mes = 1;
        ano = 1970;
    }
 // Defindo outro construtor
    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }
    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
