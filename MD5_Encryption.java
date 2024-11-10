
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class MD5_Encryption {
   public static String Md5Example(String s){
    
    
    try {
    // Creating Messsage Digest instence with MD5 encrtyption algorithm
       MessageDigest md = MessageDigest.getInstance("MD5");
  
    //Converting string into byte array 
    byte[] MessageDigest = md.digest(s.getBytes());
    
    
    BigInteger no = new BigInteger(1 , MessageDigest);
    
    String hash = no.toString(16);
    
    while (hash.length() < 32) {
        hash = "0"+hash;
        
    }
    return hash;
}catch(Exception e){
    
    System.out.println("Wrong input");
}
 return null;  

   }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str2= "HelloWorld";
        // String str3 = "Javarmi123";
        
           System.out.println(Md5Example(str));
        //    System.out.println(Md5Example(str2));
        //    System.out.println(Md5Example(str3));
        sc.close();
        }
}
