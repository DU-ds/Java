/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duds.ip;

import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.UnknownHostException;
/**
 *
 * @author DU-ds
 */

public class V4 {
    
    public V4(){
        
    }
    /***
     * 
     * @param arr each element of arr must be <= 0 and >= 255
     * @return f(x) = x + Byte.MIN_VALUE for each element x in arr
     * 
     * 
     * ip address bytes are encoded in the following way:
     * f: [0-255] -> [Byte.MIN_VALUE, Byte.MAX_VALUE]
     * f(x) = x + Byte.MIN_VALUE
     * g: [Byte.MIN_VALUE, Byte.MAX_VALUE] --> [0-255]
     * g(x) = x - byte.MIN_VALUE
     * g is the inverse of x
     * 
     * since bytes are encoded in java as [-128, 127]
     * 
     * isPrivateIP understands arr[i] == -128 implies arr[i] encodes 0
     * 
     * so [ -1, -128, -128, -127] encodes 127.0.0.1
     * 
     * public byte[] ipByteToJavaByte(int[] arr) implements f
     * while public int[] javaByteToIpByte(byte[] arr) implements g
     */
    public byte[] ipByteToJavaByte(int[] arr){
        return null; //not implemented
    }
    
    /***
     * 
     * @param arr 
     * @return for every x in arr, returns g(x) = x - byte.MIN_VALUE 
     * f(x) = x + Byte.MIN_VALUE for each element x in arr 
     */
    public int[] javaByteToIpByte(byte[] arr){
        return null; //not implemented
    }
    
    
    /***
     * public boolean isPrivateIP(byte[] arr)
     * 
     * @param arr : byte array with one to four bytes (in order)
     * @return    : true iff bytes correspond to a private ip address
     * 
     * 
     * 3 ranges of private ip (source RFC 1918 part 3
     * https://tools.ietf.org/html/rfc1918
     * 
     * 10.0.0.0/8   10.0.0.0 – 10.255.255.255
     * 172.16.0.0/12    172.16.0.0 – 172.31.255.255 	
     * 192.168.0.0/16 	192.168.0.0 – 192.168.255.255
     */
    public boolean isPrivateIP(byte[] arr){
        return false;//not implemented
    }
    
    /***
     * public boolean isPrivateIP(String addr)
     * 
     * @param addr : string encoding one to four bytes (in order) 
     * with '.' or ':' separating the bytes
     * @return    : true iff bytes correspond to a private ip address
     * 
     * 3 ranges of private ip (source RFC 1918 part 3
     * https://tools.ietf.org/html/rfc1918
     * 
     * 10.0.0.0/8   10.0.0.0 – 10.255.255.255
     * 172.16.0.0/12    172.16.0.0 – 172.31.255.255 	
     * 192.168.0.0/16 	192.168.0.0 – 192.168.255.255
     */
    public boolean isPrivateIP(String addr){
        return false;//not implemented
    }
    
    /**
     * public boolean isValidIpv4(String addr) throws Exception
     * @param addr : string 
     * @return : true iff addr is a valid ipv4 address (of one to four bytes) delimitated by "." or ":", possibly in CIDR notation

     */
    public boolean isValidIpv4(String addr) throws Exception {
        byte arr[] = this.ipSplit(addr);
        return (arr.length <= 4 && arr.length >= 1);
    }
//    https://stackoverflow.com/questions/3820167/java-regular-expressions-using-pattern-and-matcher
    
    /**public boolean isCIDR(String addr)
     * 
     * @param addr string of ipv4 address in dot decimal notation or CIDR notation
     * @return true iff addr is in CIDR notation
     */
    
    public boolean isCIDR(String addr){
        String[] tmp = addr.split("[/]");
        if(tmp.length == 2){
            return true;
        }
        return false;
    }
    
    
    /**public byte[] ipSplit(String addr)
     * 
     * @param addr : string of 1-4 "." or ":" delimitated bytes, possibly with extra CIDR info
     * @return : up to four bytes from addr; 
     * maps [0-255] -> [Byte.MIN_VALUE, Byte.MAX_VALUE]
     * f(x) = x + Byte.MIN_VALUE
     * g is the inverse of x
     * g(x) = x - byte.MIN_VALUE
     * 
     * ignores CIDR notation , discards /foo
     */

    /** public byte[] ipSplit(String addr)
     * 
     * @param addr : string of 1-4 "." or ":" delimitated bytes, possibly with extra CIDR info
     * @return : up to four bytes from addr; 
     * 
     * ignores CIDR notation, discards /foo
     */
    
    
    
    public byte[] ipSplit(String addr){
        
        if(isCIDR(addr)){//remove cidr component if it exists
            String[] tmp = addr.split("[/]");
            String cidr = tmp[1];
            addr = tmp[0];
        }
        
        byte arr[] = new byte[4];
        int ar[] = new int[4];
        String[] split;
        split = addr.split("[.:]");//if more symbols r needed as seperators, add to regex in brackets
        
        for(int i = 0; i < split.length; i++){
            ar[i]  = Integer.parseInt(split[i]);
            ar[i] -= Byte.MIN_VALUE;
            arr[i] = (byte) ar[i];
        }
/*
    https://stackoverflow.com/questions/106179/regular-expression-to-match-dns-hostname-or-ip-address
    https://www.regular-expressions.info/
*/
        
        return arr;
    }
    
    /**
     * public InetAddress stringToIpv4(String addr) throws Exception
     * 
     * @param addr : string representing ipv4 address
     * @return : InetAddress for string
     * 
     * @throws UnknownHostException
     */
    
    /**public boolean isPublicIp(Inet4Address addr)
     * 
     * @param addr : Inet4Address obj
     * @return : true iff addr is a public (not private / local / etc) IPv4 address
     */
    //change spec to only include unicast public (not broadcast, non reserved, not loopback, not local, etc)???
    //or maybe a better thing would be to make isprivateIP() and isloopback() and isUnicast() etc.
    public boolean isPublicIp(Inet4Address addr){
        return ! (
                //if it's multicast global it's global
//              ! addr.isMCGlobal()         || 
                addr.isMulticastAddress() ||
                addr.isAnyLocalAddress()  ||
                addr.isLinkLocalAddress() ||
                addr.isLoopbackAddress()  ||
                addr.isSiteLocalAddress() ||                
                addr.isMCLinkLocal()      ||
                addr.isMCNodeLocal()      ||
                addr.isMCOrgLocal()       ||
                addr.isMCSiteLocal()      

        );
        //https://codereview.stackexchange.com/questions/65071/test-if-given-ip-is-a-public-one
    }

    /** public boolean isPublicIp(String addr)
     * 
     * @param addr : string of valid IPv4 address
     * @return : true iff addr is a public (not private / local) IPv4 address
     */
    public boolean isPublicIp(String addr){
        Inet4Address ad;
        
        try{
            ad = (Inet4Address) InetAddress.getByName(addr);
            return this.isPublicIp(ad);
        }
        catch(UnknownHostException e){
//            e.printStackTrace();
            
        }
        
        return false;
    }
    
    public Inet4Address stringToIpv4(String addr) throws Exception {
        return null; //not implemented
    }
    
    public String inetAddressToString(Inet4Address addr){
        return addr.getHostAddress();
//        return null; //not implemented
    }
    
/*    public String toString(){
        return "";
    }
    
    
    @Override
    public boolean equals(Object o){
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return 0;
    }
*/
}
