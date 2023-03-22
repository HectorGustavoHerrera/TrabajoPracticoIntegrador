package Entidades;

public class Partido {
    private int nroPartido;
    private String equipo1;
    private String equipo2;
    private int golesEquipo1;
    private int golesEquipo2;

    private int resultado;

    //Hacer metodo para resultado Equipo


    public Partido() {
    }

    public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2, int nroPartido, int resultado) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        this.nroPartido = nroPartido;
        this.resultado = resultado;
    }

    public Partido(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        this.nroPartido = 0;
        this.resultado = -1;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNroPartido() {
        return nroPartido;
    }

    public void setNroPartido(int nroPartido) {
        this.nroPartido = nroPartido;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipo1='" + equipo1 + '\'' +
                ", equipo2='" + equipo2 + '\'' +
                ", golesEquipo1=" + golesEquipo1 +
                ", golesEquipo2=" + golesEquipo2 +
                '}';
    }


}
