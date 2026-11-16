public class KillCilantro {
   public static String killCilantro (String s) {
      String result = s;
      String x = "cilantro";
      String y = "parsley";
      int n = x.length();

      while (result.toLowerCase().indexOf(x) != -1) {
         int i = result.toLowerCase().indexOf(x);
         result = result.substring(0,i) + y + result.substring(i+n);
      }
      
      return result;
   }
   
   public static void main (String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
      System.out.println(killCilantro("CiLaNtRoTEST"));
   }
}