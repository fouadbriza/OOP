public class Stagiere extends Fonctionnaire{
    double dureeStage;
    boolean visibleEverywhere;
    

    public Stagiere(double dureeStage,boolean visibleEverywhere) {
        this.dureeStage=dureeStage;
        this.visibleEverywhere=visibleEverywhere;

    }


   
    @Override
    public double augmenterSalaire(double salaire, double pourcentage) throws AugmentationImpossibleException {
        throw new AugmentationImpossibleException("impo");
        
    }
}
