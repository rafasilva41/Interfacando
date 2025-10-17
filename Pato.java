public class Pato implements Nadavel, Voavel {

    private String nome;

    public Pato(String nome) {
        this.nome = nome;
    }

    @Override
    public void nadar() {
        System.out.println(nome + " esta nadando a " + VELOCIDADE_MAXIMA + " km/h.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " esta voando a " + ALTITUDE_MAXIMA + " metros acima do solo.");
    }
}
