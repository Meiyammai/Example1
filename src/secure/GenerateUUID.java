/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;

import java.util.UUID;

public class GenerateUUID {
  
  public static final void main(String... aArgs){
    //generate random UUIDs
    UUID idOne = UUID.randomUUID();
    log("Key: " + idOne);
  }
  
  private static void log(Object aObject){
    System.out.println( String.valueOf(aObject) );
  }
} 