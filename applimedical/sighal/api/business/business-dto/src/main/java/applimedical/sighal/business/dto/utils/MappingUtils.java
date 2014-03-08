package applimedical.sighal.business.dto.utils;

import applimedical.sighal.api.pojo.Salle;
import applimedical.sighal.business.dto.SalleDto;

public class MappingUtils {

   public static<To, From> To transformEntityDto(Class<To> toClass, From entity) {
      To newTo = null;
      try {
         newTo = toClass.newInstance();
         //TODO, surfer sur les get et les set...

      } catch (InstantiationException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IllegalAccessException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return newTo;
   }

   public static SalleDto mapEntityToDto(Salle salle) {
      SalleDto salleDto = new SalleDto();
      salleDto.setNumSalle(salle.getNumSalle());
      salleDto.setNomSalle(salle.getNomSalle());
      return salleDto;
   }

}
