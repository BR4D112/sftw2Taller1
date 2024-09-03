package models;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class TablaCandidatos {
    private List<Candidato> candidatos;
    private List<CriterioOrdenacion> criterios;

    // Constructor
    public TablaCandidatos(List<Candidato> candidatos, List<CriterioOrdenacion> criterios) {
        this.candidatos = candidatos;
        this.criterios = criterios;
    }

    // Método para ordenar los candidatos según los criterios de ordenación
    public List<Candidato> ordenar() {
        Collections.sort(candidatos, new Comparator<Candidato>() {
            @Override
            public int compare(Candidato c1, Candidato c2) {
                for (CriterioOrdenacion criterio : criterios) {
                    int resultado;
                    resultado = criterio.comparar(c1, c2);
                    if (criterio instanceof CriterioEtnia) {
                        resultado*=10;
                    }
                    if (resultado != 0) {
                        return resultado;
                    }
                }
                return 0;
            }
        });
        return candidatos;
    }

}
