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
     * f(x) = x - Byte.MIN_VALUE
     * g is the inverse of x
     * g(x) = x + byte.MIN_VALUE
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
