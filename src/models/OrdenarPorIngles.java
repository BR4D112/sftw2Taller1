package models;
public class OrdenarPorIngles implements CriterioOrdenacion {
    @Override
    public int comparar(Candidato candidato1, Candidato candidato2) {
        return Double.compare(candidato2.getResultadoIngles(), candidato1.getResultadoIngles());
    }
}
