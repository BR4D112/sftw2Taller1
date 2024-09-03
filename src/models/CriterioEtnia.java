package models;

public class CriterioEtnia implements CriterioOrdenacion {
    @Override
    public int comparar(Candidato candidato1, Candidato candidato2) {
        return candidato1.getEtnia().compareTo(candidato2.getEtnia());
    }
}

