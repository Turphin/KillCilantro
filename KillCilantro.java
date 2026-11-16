public class KillCilantro {
   public static String killCilantro (String n) {
      String result = n;

      while (result.indexOf("cilantro") != -1) {
         int i = result.indexOf("cilantro");
         result = result.substring(0,i) + "parsley" + result.substring(i+8);
      }
      
      return result;
   }
   
   public static void main (String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
}