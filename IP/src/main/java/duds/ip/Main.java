/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duds.ip;

/**
 *
 * @author DU-ds
 */
public class Main {
      public static void main(String[] args) {
        System.out.println("it runs!");
        
        V4 ip = new V4();
        String loopback = "127.25.25.25/8";
        boolean tr = ip.isCIDR(loopback);
        System.out.println(tr);
        
        boolean fa = ip.isPublicIp(loopback);
        System.out.println(fa);
        
        byte[] IP = ip.ipSplit(loopback);
        int sum = 0;
        for(byte b : IP){
            System.out.println(b);
            sum += (int) b;
        }
        System.out.println("Sum: " + sum);
    }  
}
