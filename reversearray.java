
import java.util.Arrays;
import java.util.Stack;

public class reversearray {
   public reversearray() {
   }

   public static void main(String[] var0) {
      Stack var1 = new Stack();
      int[] var2 = new int[]{23, 93, 56, 92, 39};
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var1.push(var2[var4]);
      }

      int[] var6 = new int[var3];

      for(int var5 = 0; var5 < var3; ++var5) {
         var6[var5] = (Integer)var1.pop();
      }

      System.out.println("Reversed array is ::" + Arrays.toString(var6));
   }
}
