package applimedical.sighal.api.constantes;

public enum EnumCivilite {
   CELIBATAIRE(0), MARIEE(1), DIVORCE(2), VEUF(3);
   private int civiliteId;
   
   EnumCivilite(int civiliteId) {
      this.civiliteId = civiliteId;
   }
   public int getCiviliteId() {
      return civiliteId;
   }

   public EnumCivilite getCiviliteById(int titreId) {
      EnumCivilite [] enumCivilites = EnumCivilite.values();
      for (EnumCivilite enumCiviliteIt : enumCivilites) {
         if (enumCiviliteIt.getCiviliteId() == civiliteId) {
            return enumCiviliteIt;
         }
      }
      return null;
   }
}
