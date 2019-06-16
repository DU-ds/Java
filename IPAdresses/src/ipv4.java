import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.lang.SecurityException;

//https://stackoverflow.com/questions/9729378/check-whether-the-ipaddress-is-in-private-range/9729432


/**
 *
 * @author DU-ds
 */
public class Ipv4 {
    
    public Ipv4(){
        
    }
    
    
    /**
     * public boolean isValidIpv4(String addr)
     * @param addr : string 
     * @return : true iff addr is a valid ipv4 address (of one to four bytes) delimitated by "." or ":", possibly in CIDR notation

     */
    public boolean isValidIpv4(String addr){
        return false; //not implemented
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
     * 
     * ignores CIDR notation or adds an extra byte for CIDR???
     */
    public byte[] ipSplit(String addr){
//        return new byte[3];
        
        if(isCIDR(addr)){//remove cidr component if it exists
            String[] tmp = addr.split("[/]");
            String cidr = tmp[1];
            addr = tmp[0];
        }
        
        byte arr[] = new byte[4];
        String[] split;
        split = addr.split("[.:]");
        
        for(int i = 0; i < split.length; i++){
            arr[i] = Byte.parseByte(split[i]);
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
    public boolean isPublicIp(Inet4Address addr){
        return ! (
                addr.isAnyLocalAddress()  ||
                addr.isLinkLocalAddress() ||
                addr.isLoopbackAddress()  ||
                addr.isMCLinkLocal()      ||
                addr.isMCNodeLocal()      ||
                addr.isMCOrgLocal()       ||
                addr.isMCSiteLocal()      ||
                addr.isSiteLocalAddress()
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
        }
        catch(UnknownHostException e){
//            e.printStackTrace();
            return false;
        }
        
        return this.isPublicIp(ad);
    }
    
    public Inet4Address stringToIpv4(String addr) throws Exception {
        return null; //not implemented
    }
    
    public String inetAddressToString(Inet4Address addr){
        return null; //not implemented
    }
    
    public String toString(){
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
}
