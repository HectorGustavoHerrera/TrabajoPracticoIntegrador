package Entidades;

public class Pronostico {

    private  int partido;

    private int resultado;


    public Pronostico() {
    }

    public Pronostico(int partido, int resultado) {
        this.partido = partido;
        this.resultado = resultado;
    }

    public int getPartido() {
        return partido;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{" +
                "partido=" + partido +
                ", resultado=" + resultado +
                '}';
    }
}
