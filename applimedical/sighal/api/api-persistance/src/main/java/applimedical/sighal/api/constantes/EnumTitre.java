package applimedical.sighal.api.constantes;

public enum EnumTitre {
   MONSIEUR(0), MADAME(1), MADEMOISELLE(2);
   private int titreId;
   
   EnumTitre(int titreId) {
      this.titreId = titreId;
   }
   public int getTitreId() {
      return titreId;
   }

   public EnumTitre getTitreById(int titreId) {
      EnumTitre [] enumTitres = EnumTitre.values();
      for (EnumTitre enumTitreIt : enumTitres) {
         if (enumTitreIt.getTitreId() == titreId) {
            return enumTitreIt;
         }
      }
      return null;
   }
}
