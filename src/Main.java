

import Entidades.Partido;
import Entidades.Pronostico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Partido> obtenerResultados() {
        final String NOMBRE_ARCHIVO = "resultados.csv";
        final String SEPARADOR_CAMPO = ",";

        List<Partido> partidos = new ArrayList<>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(NOMBRE_ARCHIVO);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] partidoComoArreglo = linea.split(SEPARADOR_CAMPO);
                partidos.add(new Partido(partidoComoArreglo[0], partidoComoArreglo[3],
                        Integer.valueOf(partidoComoArreglo[1]), Integer.valueOf(partidoComoArreglo[2]),Integer.valueOf(partidoComoArreglo[4]),Integer.valueOf(partidoComoArreglo[5])));
            }

        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            return partidos;
        }
    }

    public static List<Pronostico> obtenerPronosticos() {
        final String NOMBRE_ARCHIVO = "pronosticos.csv";
        final String SEPARADOR_CAMPO = ",";

        List<Pronostico> pronosticos = new ArrayList<>();

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(NOMBRE_ARCHIVO);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] pronosticoComoArreglo = linea.split(SEPARADOR_CAMPO);
                pronosticos.add(new Pronostico(Integer.valueOf(pronosticoComoArreglo[0]), Integer.valueOf(pronosticoComoArreglo[1])));
            }

        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            return pronosticos;
        }
    }

    public static void main(String[] args) throws IOException {



        List<Partido> partidos = new ArrayList<>();
        partidos = obtenerResultados();

        List<Pronostico> pronosticos = new ArrayList<>();
        pronosticos = obtenerPronosticos();


        int aciertos = 0;


        for (int i = 0; i < pronosticos.size(); i++) {
            int nro = pronosticos.get(i).getPartido();
            int pron = pronosticos.get(i).getResultado();
            for (int j = 0; j < partidos.size(); j++) {
                if(nro == partidos.get(j).getNroPartido()){
                    if(pron == partidos.get(j).getResultado()){
                        aciertos++;
                    }
                }

            }

        }

        System.out.println("La cantidad de aciertos fue de: " + aciertos);


    }

}