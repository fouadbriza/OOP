

public class ChefService extends Fonctionnaire {
    String attribute;

    public void ChefService(String attribute) {
        this.attribute= attribute;
    }


    public double augmenterSalaire(double pourcentage) {
        return salary*(1+pourcentage);
    }
    
}
