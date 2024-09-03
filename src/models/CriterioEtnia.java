package models;

public class CriterioEtnia implements CriterioOrdenacion {
    @Override
    public int comparar(Candidato candidato1, Candidato candidato2) {
        if(candidato1.getEtnia()==null) 
        return 1;
        else if(candidato2.getEtnia()==null)
        return -1;
        return 0;
    }
}

