package ar.utn.edu.ap.pronosticos;

public class Pronostico {

    private Partido partido;
    private Equipo equipo;
    //private String resultado;
    private EnumResultado resultado;

    /*public Pronostico(Partido partido, Equipo equipo, EnumResultado resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }*/

    public Pronostico(Partido partido, Equipo equipo, EnumResultado resultado) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return this.equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public EnumResultado getResultado() {
        return resultado;
    }

    public void setResultado(EnumResultado resultado) {
        this.resultado = resultado;
    }


    /*public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }*/

    /*public int puntos(){
        //this.resultado -> pred
        String resultadoReal = this.partido.resultado(this.equipo);
        if(this.resultado.equals(resultadoReal)){
            return 1;
        }else {
            return 0;
        }

    }*/

    public int puntos() {
        // this.resultado -> pred
        EnumResultado resultadoReal = this.partido.resultado(this.equipo);
        if (this.resultado.equals(resultadoReal)) {
            return 1;
        } else {
            return 0;
        }

    }
}
