import java.util.*;

public class ArrayList3 {
   public static void removeDivisibleBy3(ArrayList<Integer> arr) {
      for (int i = arr.size() - 1; i >= 0; i--) {
         if (arr.get(i) % 3 == 0) {
            arr.remove(i);
         }
      }
      System.out.println(arr);
   }
   
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < n; i++) {
         arr.add(scn.nextInt());
      }
      removeDivisibleBy3(arr);
   }
}
