/*Write a Java program to create an ArrayList of strings and sort the elements in alphabetical order. */
import java.util.*;
public class ArrayList1{
    public static void SortArrayList(String str){
        ArrayList<Character> arr = new ArrayList<>();
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            arr.add(ch);
        }
        String str1 ="";
        Collections.sort(arr);
        for(char ch :arr){
            str1+=ch;
        }
        System.out.print(str1);
    }
    public static void main(String[]args){
       Scanner scn = new Scanner(System.in);
       String str = scn.next();
       SortArrayList(str); 
    }
}