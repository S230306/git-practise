/*Write a Java program to create an ArrayList of strings
 and remove all elements that have a length less than
 or equal to 3. */
import java.util.*;
public class ArrayList2 {
   public static void removeString(ArrayList<String>arr){
    for (int i = arr.size() - 1; i >= 0; i--) {
        if (arr.get(i).length() <= 3) {
           arr.remove(i);
        }
     }
     for(String x:arr){
        System.out.println(x);
     }
  }
  
   public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<>();
    arr.add("Anisha");
    arr.add("Manisha");
    arr.add("Chalisa");
    arr.add("Saumya");
    arr.add("Ali");
    arr.add("Bk");
    arr.add("sk");
    removeString(arr);
   } 
}
