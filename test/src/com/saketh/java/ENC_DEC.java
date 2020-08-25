package com.saketh.java;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class ENC_DEC {

  Cipher ecipher;
  Cipher dcipher;

  public ENC_DEC(SecretKey key) throws Exception {
    ecipher = Cipher.getInstance("AES");
    dcipher = Cipher.getInstance("AES");
    ecipher.init(Cipher.ENCRYPT_MODE, key);
    dcipher.init(Cipher.DECRYPT_MODE, key);
  }

  public String encrypt(String str) throws Exception {
  
    byte[] utf8 = str.getBytes("UTF8");

   
    byte[] enc = ecipher.doFinal(utf8);

    return new sun.misc.BASE64Encoder().encode(enc);
  }

  public String decrypt(String str) throws Exception {
    // Decode base64 to get bytes
    byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

    byte[] utf8 = dcipher.doFinal(dec);

    // Decode using utf-8
    
    return new String(utf8, "UTF8");
  }
  
  public String ENC( String data,SecretKey key) throws Exception
  {
//	  String k="key123key";
//      SecretKey key = new SecretKeySpec(k.getBytes(), "AES");
      
        ENC_DEC encrypter = new ENC_DEC(key);
        
        String encrypted = encrypter.encrypt(data);
       
        System.out.println("enc: "+encrypted);
       return encrypted;
    
  }
  public static String DEC( String encrypted ) throws Exception
  {
	  String k="key123key";
      SecretKey key = new SecretKeySpec(k.getBytes(), "AES");
        ENC_DEC encrypter = new ENC_DEC(key);

      

        String decrypted = encrypter.decrypt(encrypted);
System.out.println("dec: " +decrypted );
        return decrypted;
    
  }
  


    public static void main(String args []) throws Exception
    {

      //  String data = "Don't tell anybody!";
        //String k = "Bar12345Bar12345";
        //print(data,k);
        //SecretKey key = KeyGenerator.getInstance("AES").generateKey();
        
    }
}
