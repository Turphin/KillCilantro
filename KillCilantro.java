import java.util.HashMap;

public class KillCilantro {
   public static String killCilantro (String s) {
      String result = s;
      HashMap<String, String> replace = new HashMap<String, String>();
      replace.put("cilantro", "parsley");
      
      for (String x : replace.keySet()) {
         int n = x.length();
         String y = replace.get(x);

         while (result.toLowerCase().indexOf(x) != -1) {
            int i = result.toLowerCase().indexOf(x);
            result = result.substring(0,i) + y + result.substring(i+n);
         }
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