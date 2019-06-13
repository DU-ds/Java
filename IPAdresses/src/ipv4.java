import java.net.InetAddress;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.lang.SecurityException;

//https://stackoverflow.com/questions/9729378/check-whether-the-ipaddress-is-in-private-range/9729432


/**
 *
 * @author DU-ds
 */
public class ipv4 {
    
    public ipv4(){
        
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
        return new byte[3];
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
        return false;
    }

    /** public boolean isPublicIp(String addr)
     * 
     * @param addr : string of valid IPv4 address
     * @return : true iff addr is a public (not private / local) IPv4 address
     */
    public boolean isPublicIp(String addr){
        return false;
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
