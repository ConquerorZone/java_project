import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class SHA_256_encryption {
//    public static String Md5Example(String s){
    
    
//     try {
//     // Creating Messsage Digest instence with MD5 encrtyption algorithm
//        MessageDigest md = MessageDigest.getInstance("SHA-256");
  
//     //Converting string into byte array 
//     byte[] MessageDigest = md.digest(s.getBytes());
    
    
//     BigInteger no = new BigInteger(1 , MessageDigest);
    
//     String hash = no.toString(16);
    
//     while (hash.length() < 64) {
//         hash = "0"+hash;
        
//     }
//     return hash;
// }catch(Exception e){
    
//     System.out.println("Wrong input");
// }
//  return null;  
//    }

public static byte[] ex_Sha256(String s ) throws NoSuchAlgorithmException{
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    // called digest method used StandardCharsets to get hash value
    return md.digest(s.getBytes(StandardCharsets.UTF_8));
}
public static String tohash(byte[] hash){
    // converting bytes into sign magnitute value
    BigInteger num = new BigInteger(1, hash);
    // converting degest Messsage into hex decimal value
    StringBuilder hex = new StringBuilder(num.toString(16));
    // pad with leading zeros using loop
    while (hex.length()<64) {
        hex.insert(0, "0");
    }
    // returning hex value into string output 
    return hex.toString();
}
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str2= "HelloWorld";
        // String str3 = "Javarmi123";
        
           System.out.println(tohash(ex_Sha256(str)));
        //    System.out.println(tohash(ex_Sha256(str2)));
        //    System.out.println(tohash(ex_Sha256(str3)));
        sc.close();
        }
}
