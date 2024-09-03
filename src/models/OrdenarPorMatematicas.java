package models;

public class OrdenarPorMatematicas implements CriterioOrdenacion {
    @Override
    public int comparar(Candidato candidato1, Candidato candidato2) {
        return Double.compare(candidato2.getResultadoMatematicas(), candidato1.getResultadoMatematicas());
    }
}

