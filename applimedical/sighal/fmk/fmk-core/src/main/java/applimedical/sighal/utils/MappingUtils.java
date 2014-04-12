package applimedical.sighal.utils;

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

}
