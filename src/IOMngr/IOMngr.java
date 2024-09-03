package IOMngr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import models.Candidato;
import models.Etnia;


public class IOMngr {
    public static List<Candidato> leerCandidatosDesdeArchivo(String nombreArchivo) {
        List<Candidato> candidatos = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int i= 1;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String apellido = datos[1];
                Etnia etnia = Etnia.AFRO.getEtniabyName(datos[2]);
                double resultadoGlobalIcfes = Double.parseDouble(datos[3]);
                double resultadoMatematicas = Double.parseDouble(datos[4]);
                double resultadoIngles = Double.parseDouble(datos[5]);
                Date fechaInscripcion = dateFormat.parse(datos[6]);

                Candidato candidato = new Candidato(nombre, apellido, etnia, resultadoGlobalIcfes,
                        resultadoMatematicas, resultadoIngles, fechaInscripcion);
                candidatos.add(candidato);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        return candidatos;
    }
}
