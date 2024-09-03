import java.util.Arrays;
import java.util.List;

import IOMngr.IOMngr;
import models.Candidato;
import models.CriterioEtnia;
import models.CriterioOrdenacion;
import models.OrdenarPorIngles;
import models.OrdenarPorMatematicas;
import models.OrdenarPorPuntajeGlobal;
import models.TablaCandidatos;

public class Run {
    public static void main(String[] args) {
        String archivo = "candidatos.txt";
        List<Candidato> candidatos = IOMngr.leerCandidatosDesdeArchivo(archivo);
        List<CriterioOrdenacion> criterios = Arrays.asList( new OrdenarPorIngles(), new OrdenarPorMatematicas(), new OrdenarPorPuntajeGlobal(),new CriterioEtnia());
        int a = 1;
        for (Candidato candidato : candidatos) {
            System.out.println("Posición "+(a++)+": "+candidato.toString2());
        }
        a=1;
        candidatos = new TablaCandidatos(candidatos, criterios).ordenar();
        for (Candidato candidato : candidatos) {
            System.out.println("Posición "+(a++)+": "+candidato.toString2());
        }
    }
}
