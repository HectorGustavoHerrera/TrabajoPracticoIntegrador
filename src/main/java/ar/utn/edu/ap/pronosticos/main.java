package ar.utn.edu.ap.pronosticos;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {
    public static void main(String[] args) {
                                                            //partido

        Collection<Partido> partidos = new ArrayList<Partido>();

        Path pathResultados = Paths.get("C:\\Users\\Gustavo\\IdeaProjects\\TrabajoIntegrador3\\src\\main\\resources\\resultadoTest1.csv");
        List<String> lineasResultados = null;
        try {
            lineasResultados = Files.readAllLines(pathResultados);
        }catch (IOException e){
            System.out.println("No se puedo leer la linea de resultado.....");
            System.out.println(e.getMessage());
            System.exit(1);
        }
        boolean primera = true;
        for (String lineaResultado:lineasResultados) {
            if(primera){
                primera = false;
            }else {

               String[] campos = lineaResultado.split(",");                     //cada vez que lee la linea, hay que guardar el resultado en la variable lineaResultado
               Equipo equipo1 = new Equipo(campos[0].trim());
               Equipo equipo2 = new Equipo(campos[3].trim());
               Partido partido = new Partido(equipo1,equipo2);
               partido.setGolesEq1(Integer.parseInt(campos[1].trim()));
               partido.setGolesEq2(Integer.parseInt(campos[2].trim()));
               partidos.add(partido);
            }
        }
                                                                //pronostico

        int puntos = 0;  // puntos

        Path pathPronosticos = Paths.get("C:\\Users\\Gustavo\\IdeaProjects\\TrabajoIntegrador3\\src\\main\\resources\\pronosticoTest.csv");
        List<String> lineasPronosticos = null;
        try {
            lineasPronosticos = Files.readAllLines(pathPronosticos);
        }catch (IOException e){
            System.out.println("No se puedo leer la linea de pronosticos.....");
            System.out.println(e.getMessage());
            System.exit(1);
        }
         primera = true;
        for (String lineapronostico:lineasPronosticos) {
            if(primera){
                primera = false;
            }else {
                String[] campos = lineapronostico.split(",");
                Equipo equipo1 = new Equipo(campos[0].trim());
                Equipo equipo2 = new Equipo(campos[4].trim());
                Partido partido = null;
                for (Partido partidoCol:partidos) {
                    if(partidoCol.getEquipo1().getNombre()
                            .equals(equipo1.getNombre())
                            && partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())){
                       partido = partidoCol;
                    }
                }
                Equipo equipo = null;
                EnumResultado resultado = null;
                //String resultado = null;
                if("X".equals(campos[1])){
                    equipo = equipo1;
                    resultado = EnumResultado.GANADOR;
                }
                if("X".equals(campos[2])){
                    equipo = equipo1;
                    resultado = EnumResultado.EMPATE;
                }
                if("X".equals(campos[3])){
                    equipo = equipo1;
                    resultado = EnumResultado.PERDEDOR;
                }
                Pronostico pronostico = new Pronostico(partido,equipo,resultado);
                //sumar los puntos correspondientes
                System.out.println(lineapronostico);
                puntos += pronostico.puntos();



            }
        }
        System.out.println("los puntos obtenidos por el usuario fueron: ");
        System.out.println(puntos);
        //mostrar los puntos

    }
}
