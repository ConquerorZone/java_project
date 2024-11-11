import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
    a = a.replaceAll("//s"," ").toLowerCase();
    b = b.replaceAll("//s"," ").toLowerCase();

    // first aproach is easy but it have time Complexity problem:->

    // char[] chararray1 = a.toCharArray();
    // char[] chararray2 = b.toCharArray();
     
    // Arrays.sort(chararray1);
    // Arrays.sort(chararray2);

    // return Arrays.equals(chararray1, chararray2);

// Second apporach counts the frequecies for each String:->
    int[] charcount = new int[26];
    for (int i = 0; i < a.length(); i++) {
        charcount[a.charAt(i)-'a']++;
        charcount[b.charAt(i)-'a']--;
    }
    for (int count : charcount) {
        if (count != 0) {
            return false;
        }
    }
    return true;
    } 
      

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

