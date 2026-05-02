public interface AugmentationSalaire {
    
default double augmenterSalaire(double salaire, double pourcentage) throws AugmentationImpossibleException  {
        if (salaire + pourcentage*salaire>200000) {
            throw new AugmentationImpossibleException("kdbhcsdc");
        }
    
        return (salaire + pourcentage*salaire);
    }

    
   }