//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Passaro passaro = new Passaro("Papagaio");
        passaro.voar();
        System.out.println("<<<<<<<<<=========================>>>>>>>>>");
        Voavel voador = passaro;
        voador.voar();

        Pato pato = new Pato("Pato Donald");
        Nadavel nadavel = pato;
        nadavel.nadar();
        System.out.println("<<<<<<<<<=========================>>>>>>>>>");
        Voavel voavel = pato;
        pato.voar();
    }
}
//Veiculos elétricos
//1 - Crie duas interfaces: sendo que a primeira é recarregável que imprime x minutos (int),
//com constante tempo máximo de 30 minutos; com método abstrato;
//2 - O segundo é autônomo: teremos método abstrato dirigindo autônomo que recebe o
//parâmetro String destino, e que imprime autonomamente para destino. E dentro dele nós
//temos a constante boolean suporteGPS (igual a true);
//3 - Crie uma classe carro eletrico que implemente as duas interfaces mostradas acima,
//adicionando uma String modelo no construtor e nas implementações o modelo: O modelo y está
//recarregando
//4 - Na classe teste veículo, crie um objeto carro elétrico, chame os objetos via referências
//das interfaces e use as constantes.