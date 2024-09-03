package models;

public class OrdenarPorPuntajeGlobal implements CriterioOrdenacion {
    @Override
    public int comparar(Candidato candidato1, Candidato candidato2) {
        return Double.compare(candidato2.getResultadoGlobalIcfes(), candidato1.getResultadoGlobalIcfes());
    }
}

