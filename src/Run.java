import java.util.List;

import IOMngr.IOMngr;
import models.Candidato;

public class Run {
    public static void main(String[] args) {
        String archivo = "candidatos.txt";
        new IOMngr();
        List<Candidato> candidatos = IOMngr.leerCandidatosDesdeArchivo(archivo);
        int a = 1;
        for (Candidato candidato : candidatos) {
            System.out.println("Posición "+(a++)+": "+candidato.toString2());
        }
    }
}
