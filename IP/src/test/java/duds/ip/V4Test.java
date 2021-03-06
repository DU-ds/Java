/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duds.ip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.net.Inet4Address;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;


/**
 *
 * @author DU-ds
 */
public class V4Test {
    
    byte bmin = Byte.MIN_VALUE;
    
    public V4Test() {
        
    }


    /**
     * Handles dots correctly
     * addr.length = 4
     */
    @Test
    public void testIsValidIpv4_dot() {
        System.out.println("isValidIpv4");
        String localHost = "127.0.0.1";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue( result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
    
    
    /**
    * handles colons correctly
    * addr.length = 4
    */
    @Test
    public void testIsValidIpv4_colon() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:0:1";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);        
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
        /**
    * addr.length > 0
    */
    @Test
    public void testIsValidIpv4_len0() {
        System.out.println("isValidIpv4");
        String emptyHost = "";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(emptyHost);
            assertFalse(result); //"" must not be a valid ip address
        }
        catch(Exception e){
            assertTrue(true); //ok to throw exception for empty string
            
        }
    }
        /**
    * addr.length <= 4
    */
    @Test
    public void testIsValidIpv4_len5() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:0:1:102";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertFalse(result);
        }
        catch(Exception e){
            assertTrue(true); //ok to throw expection for non-valid ip address.
        }
    }

    /**
    * addr.length = 1
    */
    @Test
    public void testIsValidIpv4_len1() {
        System.out.println("isValidIpv4");
        String localHost = "127";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }

    /**
    * addr.length = 2
    */
    @Test
    public void testIsValidIpv4_len2() {
        System.out.println("isValidIpv4");
        String localHost = "127:0";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
        }
    
    /**
    * addr.length = 3
    */
    @Test
    public void testIsValidIpv4_len3() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:7";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
    

    /**
     * invalid data
     */
    @Test
    public void testIsValidIpv4_invalid() {
        System.out.println("isValidIpv4");
        String localHost = "string.124.0.1";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(true); //ok to throw expection input that is not a valid ip address.
        }
    }
    
    /**
     * CIDR notation
     */
    @Test
    public void testIsValidIpv4_CIDR() {
        System.out.println("isValidIpv4");
        String localHost = "200.0.0.0/8";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }

    @Test
    public void testIsValidIpv4_trailing1() {
        System.out.println("isValidIpv4");
        String localHost = "200.";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
    
       
    @Test
    public void testIsValidIpv4_trailing2() {
        System.out.println("isValidIpv4");
        String localHost = "200.54.";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
     
    @Test
    public void testIsValidIpv4_trailing3() {
        System.out.println("isValidIpv4");
        String localHost = "200.87.14.";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }

    
    @Test
    public void testIsValidIpv4_trailing4() {
        System.out.println("isValidIpv4");
        String localHost = "212.12.98.69/";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(true);
        }
    }


    /**
    * covers 0
    */
    @Test
    public void testIsValidIpv4_MIN() {
        System.out.println("isValidIpv4");
        String localHost = "0:0:0:0";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
        
    /**
    * covers 255
    */
    @Test
    public void testIsValidIpv4_MAX() {
        System.out.println("isValidIpv4");
        String localHost = "152:255:255:255/32";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }
        
    /**
    * covers > 255
    */
    @Test
    public void testIsValidIpv4_HIGH() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:0:1";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }

            
    /**
    * covers < 0 
    */
    @Test
    public void testIsValidIpv4_LOW() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:0:1";
        V4 ip = new V4();
        try{
            boolean result = ip.isValidIpv4(localHost);
            assertTrue(result);
        }
        catch(Exception e){
            assertTrue(false);
        }
    }

    
    
    /**
     * ipv4 address takes on the form:    
     * 
    byte    
    byte.      
    byte.byte
    byte.byte.
    byte.byte.byte
    byte.byte.byte.
    byte.byte.byte.byte
    byte.byte.byte.byte. ? maybe idk
    
  
    a bit about bytes in java:
    https://stackoverflow.com/questions/15073562/java-and-unsigned-bytes
    tldr: bytes have correct range but some operations(eg printing) interpret it as having
    range from -128 - 127, so shifted to be signed. 
    Same bits can encode 0-255 just as well. Just keep this in mind.
*/
    /**
     * test strategy isValidIpv4
     * addr delimitated by ":" or by "." so check both
     * 
     * each byte is an integer from [0, 255]  -- test with 
     * valid and invalid data between delimiters
     * 
     * 
     * if @return is true then 0 <  addr.length < 5
     * 
     * accepts CIDR notation :
     *      CIDR notation with valid input 
     *      CIDR notation with invald input (eg last byte too large)
     * 
     * @param addr
     * 
     * test trailing delimitors
     * 
     */
    /*
    /**
     * public boolean isValidIpv4(String addr) throws Exception
     * @param addr : string 
     * @return : true iff addr is a valid ipv4 address (of one to four bytes) delimitated by "." or ":", possibly in CIDR notation
     */


    


    /**
     * Test of isPublicIp method, of class Ipv4.
     */
    @Test
    public void testIsPublicIp_Inet4Address() {
        System.out.println("isPublicIp");
        Inet4Address addr = null;
        V4 instance = new V4();
        boolean expResult = false;
        boolean result = instance.isPublicIp(addr);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPublicIp method, of class Ipv4.
     */
    
    /**
     * public ip addresses are reachable via internet. so not 
     * special-use addresses( eg private, link-local, loopback)
     */
    
    /**
     * test strategy for isPublicIp_String
     * 
     * test edges (both sides -- both included and excluded) for 
     * all ranges of non-public ip ranges
     * 
     * https://en.wikipedia.org/wiki/IPv4#Special-use_addresses
     * 
     * Better resource:
     * https://www.iana.org/assignments/iana-ipv4-special-registry/iana-ipv4-special-registry.xhtml
     * 
0.0.0.0/8   0.0.0.0–0.255.255.255 
10.0.0.0/8  10.0.0.0–10.255.255.255     
100.64.0.0/10   100.64.0.0–100.127.255.255 //shared address space -- tldr space is shared by ISP's(or other providers / implelmetors / users of CGN Carrier Grade NAT(Network Address Translation)) to ease the ipv4 depletion. So, each network can assign 100.64.0.0/10 to a unique user / private network needing an IP address and send traffic to them from the internet by translating the address when entering the network. (I think?) 
127.0.0.0/8     127.0.0.0–127.255.255.255 
169.254.0.0/16  169.254.0.0–169.254.255.255 
172.16.0.0/12   172.16.0.0–172.31.255.255 
192.0.0.0/24    192.0.0.0–192.0.0.255 //not really sure why these tests are failing. 
192.0.2.0/24    192.0.2.0–192.0.2.255 
192.88.99.0/24  192.88.99.0–192.88.99.255 
192.168.0.0/16  192.168.0.0–192.168.255.255 
198.18.0.0/15   198.18.0.0–198.19.255.255 
198.51.100.0/24     198.51.100.0–198.51.100.255 
203.0.113.0/24  203.0.113.0–203.0.113.255 
224.0.0.0/4     224.0.0.0–239.255.255.255 
240.0.0.0/4     240.0.0.0–255.255.255.254 
255.255.255.255/32  255.255.255.255 
     */
        /**public boolean isPublicIp(Inet4Address addr)
     * 
     * @param addr : Inet4Address obj
     * @return : true iff addr is a public (not private / local / etc) IPv4 address
     */

    /**
     * covers 0.0.0.0/8
     */
    
    @Test
    public void testIsPublicIp_String0_1() {
        System.out.println("isPublicIp");
        String addr = "0.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 0.0.0.0/8
     */
    
        @Test
    public void testIsPublicIp_String0_2() {
        System.out.println("isPublicIp");
        String addr = "1.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 10.0.0.0/8
     */
    
    @Test
    public void testIsPublicIp_String10_1() {
        System.out.println("isPublicIp");
        String addr = "9.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 10.0.0.0/8
     */
    
        @Test
    public void testIsPublicIp_String10_2() {
        System.out.println("isPublicIp");
        String addr = "10.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 10.0.0.0/8
     */
    
    @Test
    public void testIsPublicIp_String10_3() {
        System.out.println("isPublicIp");
        String addr = "10.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 10.0.0.0/8
     */
    
        @Test
    public void testIsPublicIp_String10_4() {
        System.out.println("isPublicIp");
        String addr = "11.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 100.64.0.0/10
     */
    
    @Test
    public void testIsPublicIp_String100_1() {
        System.out.println("isPublicIp");
        String addr = "100.63.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 100.64.0.0/10
     */
    
    @Test
    public void testIsPublicIp_String100_2() {
        System.out.println("isPublicIp");
        String addr = "100.64.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 100.64.0.0/10
     */
    
    @Test
    public void testIsPublicIp_String100_3() {
        System.out.println("isPublicIp");
        String addr = "100.126.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 100.64.0.0/10
     */
    
        @Test
    public void testIsPublicIp_String100_4() {
        System.out.println("isPublicIp");
        String addr = "100.127.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 127.0.0.0/8
     */
    
    @Test
    public void testIsPublicIp_String127_1() {
        System.out.println("isPublicIp");
        String addr = "126.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 127.0.0.0/8
     */
    
        @Test
    public void testIsPublicIp_String127_2() {
        System.out.println("isPublicIp");
        String addr = "127.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 127.0.0.0/8
     */
    
    @Test
    public void testIsPublicIp_String127_3() {
        System.out.println("isPublicIp");
        String addr = "127.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 127.0.0.0/8
     */
    
        @Test
    public void testIsPublicIp_String127_4() {
        System.out.println("isPublicIp");
        String addr = "128.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 169.254.0.0/16
     */
    
    @Test
    public void testIsPublicIp_String169_1() {
        System.out.println("isPublicIp");
        String addr = "169.253.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 169.254.0.0/16
     */
    
        @Test
    public void testIsPublicIp_String169_2() {
        System.out.println("isPublicIp");
        String addr = "169.254.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 169.254.0.0/16
     */
    
    @Test
    public void testIsPublicIp_String169_3() {
        System.out.println("isPublicIp");
        String addr = "169.254.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 169.254.0.0/16
     */
    
        @Test
    public void testIsPublicIp_String169_4() {
        System.out.println("isPublicIp");
        String addr = "169.255.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 172.16.0.0/12
     */
    
    @Test
    public void testIsPublicIp_String172_1() {
        System.out.println("isPublicIp");
        String addr = "172.15.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 172.16.0.0/12
     */
    
        @Test
    public void testIsPublicIp_String172_2() {
        System.out.println("isPublicIp");
        String addr = "172.16.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 172.16.0.0/12
     */
    
    @Test
    public void testIsPublicIp_String172_3() {
        System.out.println("isPublicIp");
        String addr = "172.31.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 172.16.0.0/12
     */
    
        @Test
    public void testIsPublicIp_String172_4() {
        System.out.println("isPublicIp");
        String addr = "172.32.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 192.0.0.0/24
     */
    
    @Test
    public void testIsPublicIp_String192_0_0_1() {
        System.out.println("isPublicIp");
        String addr = "191.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 192.0.0.0/24
     */
    
        @Test
    public void testIsPublicIp_String192_0_0_2() {
        System.out.println("isPublicIp");
        String addr = "192.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 192.0.0.0/24
     */
    
    @Test
    public void testIsPublicIp_String192_0_0_3() {
        System.out.println("isPublicIp");
        String addr = "192.0.0.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 192.0.0.0/24
     */
    
        @Test
    public void testIsPublicIp_String192_0_0_4() {
        System.out.println("isPublicIp");
        String addr = "192.0.1.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 192.0.2.0/24 
     */
    
    @Test
    public void testIsPublicIp_String192_0_2_1() {
        System.out.println("isPublicIp");
        String addr = "192.0.1.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 192.0.2.0/24 
     */
    
        @Test
    public void testIsPublicIp_String192_0_2_2() {
        System.out.println("isPublicIp");
        String addr = "192.0.2.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    /**
     * covers 192.0.2.0/24 
     */
    
    @Test
    public void testIsPublicIp_String192_0_2_3() {
        System.out.println("isPublicIp");
        String addr = "192.0.2.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 192.0.2.0/24 
     */
    
        @Test
    public void testIsPublicIp_String192_0_2_4() {
        System.out.println("isPublicIp");
        String addr = "192.0.3.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
    
    /**
     * covers 192.88.99.0/24
     */
    
    @Test
    public void testIsPublicIp_String192_88_1() {
        System.out.println("isPublicIp");
        String addr = "192.88.98.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 192.88.99.0/24
     */
    
        @Test
    public void testIsPublicIp_String192_88_2() {
        System.out.println("isPublicIp");
        String addr = "192.88.99.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 192.88.99.0/24
     */
    
    @Test
    public void testIsPublicIp_String192_88_3() {
        System.out.println("isPublicIp");
        String addr = "192.88.99.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 192.88.99.0/24
     */
    
        @Test
    public void testIsPublicIp_String192_88_4() {
        System.out.println("isPublicIp");
        String addr = "192.88.100.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

   
    /**
     * covers 192.168.0.0/16
     */
    
    @Test
    public void testIsPublicIp_String192_168_1() {
        System.out.println("isPublicIp");
        String addr = "192.167.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 192.168.0.0/16
     */
    
        @Test
    public void testIsPublicIp_String192_168_2() {
        System.out.println("isPublicIp");
        String addr = "192.168.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 192.168.0.0/16
     */
    
    @Test
    public void testIsPublicIp_String192_168_3() {
        System.out.println("isPublicIp");
        String addr = "192.168.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 192.168.0.0/16
     */
    
        @Test
    public void testIsPublicIp_String192_168_4() {
        System.out.println("isPublicIp");
        String addr = "192.169.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
   
    /**
     * covers 198.18.0.0/15
     */
    
    @Test
    public void testIsPublicIp_String198_18_1() {
        System.out.println("isPublicIp");
        String addr = "198.17.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 198.18.0.0/15
     */
    
        @Test
    public void testIsPublicIp_String198_18_2() {
        System.out.println("isPublicIp");
        String addr = "198.18.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 198.18.0.0/15
     */
    
    @Test
    public void testIsPublicIp_String198_18_3() {
        System.out.println("isPublicIp");
        String addr = "198.19.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 198.18.0.0/15
     */
    
        @Test
    public void testIsPublicIp_String198_18_4() {
        System.out.println("isPublicIp");
        String addr = "198.20.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

   
    /**
     * covers 198.51.100.0/24
     */
    
    @Test
    public void testIsPublicIp_String198_51_1() {
        System.out.println("isPublicIp");
        String addr = "198.51.99.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 198.51.100.0/24
     */
    
        @Test
    public void testIsPublicIp_String198_51_2() {
        System.out.println("isPublicIp");
        String addr = "198.51.100.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 198.51.100.0/24
     */
    
    @Test
    public void testIsPublicIp_String198_51_3() {
        System.out.println("isPublicIp");
        String addr = "198.51.100.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 198.51.100.0/24
     */
    
        @Test
    public void testIsPublicIp_String198_51_4() {
        System.out.println("isPublicIp");
        String addr = "198.51.101.000";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
   
    /**
     * covers 203.0.113.0/24
     */
    
    @Test
    public void testIsPublicIp_String203_1() {
        System.out.println("isPublicIp");
        String addr = "203.0.112.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 203.0.113.0/24
     */
    
        @Test
    public void testIsPublicIp_String203_2() {
        System.out.println("isPublicIp");
        String addr = "203.0.113.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 203.0.113.0/24
     */
    
    @Test
    public void testIsPublicIp_String203_3() {
        System.out.println("isPublicIp");
        String addr = "203.0.113.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 203.0.113.0/24
     */
    
        @Test
    public void testIsPublicIp_String203_4() {
        System.out.println("isPublicIp");
        String addr = "203.0.114.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }
   
    /**
     * covers 224.0.0.0/4 
     */
    
    @Test
    public void testIsPublicIp_String224_1() {
        System.out.println("isPublicIp");
        String addr = "223.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertTrue(result);
    }

    /**
     * covers 224.0.0.0/4 
     */
    
        @Test
    public void testIsPublicIp_String224_2() {
        System.out.println("isPublicIp");
        String addr = "224.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 224.0.0.0/4 
     * 
     * also
     * 
     * covers 240.0.0.0/4 
     */
    
    @Test
    public void testIsPublicIp_String224_3() {
        System.out.println("isPublicIp");
        String addr = "239.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }

    /**
     * covers 224.0.0.0/4 
     * 
     * also
     * 
     * covers 240.0.0.0/4 
     */
    
        @Test
    public void testIsPublicIp_String224_4() {
        System.out.println("isPublicIp");
        String addr = "240.0.0.0";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
   
    /**
     * covers 240.0.0.0/4
     * 
     * also
     * 
     * covers 255.255.255.255/32  
     */
    
    @Test
    public void testIsPublicIp_String240_1() {
        System.out.println("isPublicIp");
        String addr = "255.255.255.254";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
       
    /**
     * covers 255.255.255.255/32 
     */
    
    @Test
    public void testIsPublicIp_String255_1() {
        System.out.println("isPublicIp");
        String addr = "255.255.255.255";
        V4 instance = new V4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    
    /**
     * Test of stringToIpv4 method, of class Ipv4.
     */
    @Test//running test causes compilation to fail
    public void testStringToIpv4(){ 
        //TODO implement tests
        System.out.println("stringToIpv4");
        String addr = "15.2.6.18";
        V4 instance = new V4();
        byte[] b = new byte[] {15,2,6,18};
        
        
        try {
            Inet4Address lt =  (Inet4Address) Inet4Address.getByAddress(b) ;
            Inet4Address lt2 = instance.stringToIpv4(addr);
            byte[] expResult = lt.getAddress();
            byte[] result = lt2.getAddress();
            assertEquals(expResult, result);
        }
        catch(Exception e){
//            e.printStackTrace();
            assertFalse(true);//fails 
        }
    }

    /**
     * Test of inetAddressToString method, of class Ipv4.
     */
    @Test//running test causes compilation to fail
    public void testInetAddressToString() {
        System.out.println("inetAddressToString");
        Inet4Address addr = null;
        V4 instance = new V4();
//        String expResult = "";
//        String result = instance.inetAddressToString(addr);
//        assertEquals(expResult, result);
        
        String expResult = "15.2.6.18";
        byte[] b = new byte[] {15,2,6,18};
        
        
        try {
            Inet4Address lt =  (Inet4Address) Inet4Address.getByAddress(b);
            byte[] result = lt.getAddress();
            assertEquals(expResult, result);
        }
        catch(Exception e){
//            e.printStackTrace();
            assertFalse(true);//fails 
        }
        
        
    }

    /**
     * Test of toString method, of class Ipv4.
     */
/*   @Test
    public void testToString() {
        System.out.println("toString");
        V4 instance = new V4();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    */

    /**
     * Test of equals method, of class Ipv4.
     */
/*    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        V4 instance = new V4();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
*/
    
    /**
     * Test of hashCode method, of class Ipv4.
     */
/*    @Test
    public void testHashCode() {
        V4 instance = new V4();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }
*/
    
    /**
     * test strategy public byte[] ipSplit(String addr)
     * returns byte array with correct bytes in correct order
     * 
     * discards extra CIDR info
     */
    
    /** public byte[] ipSplit(String addr)
     * 
     * @param addr : string of 1-4 "." or ":" delimitated bytes, possibly with extra CIDR info
     * @return : up to four bytes from addr; 
     * 
     * ignores CIDR notation, discards /foo
     */
    
    /**
     * Test of ipSplit method, of class Ipv4.
     */
    @Test
    public void testIpSplit() {
        System.out.println("ipSplit");
        String localHost = "127.0.0.1";
        V4 instance = new V4();
        byte[] result = instance.ipSplit(localHost);
        assertEquals(127 + bmin, result[0]);
        assertEquals(0   + bmin, result[1]);
        assertEquals(0   + bmin, result[2]);
        assertEquals(1   + bmin, result[3]);

    }
    
//    @Rule
//    public ExpectedException except = ExpectedException.none();

    @Test//(expected = ArrayIndexOutOfBoundsException.class)
    public void testIpSplitCIDR() {
        System.out.println("ipSplit");
        String localHost = "127.0.0.1/8";
        V4 instance = new V4();
        try{
            byte[] result = instance.ipSplit(localHost);
        assertEquals(127 + bmin, result[0]);
        assertEquals(0   + bmin, result[1]);
        assertEquals(0   + bmin, result[2]);
        assertEquals(1   + bmin, result[3]);
 
//        try { //should throw an ArrayIndexOutOfBoundsException
//        except.expect(IndexOutOfBoundsException.class);
        
/*
https://stackoverflow.com/a/44774816/
https://junit.org/junit5/docs/current/user-guide/#writing-tests-assertions
*/
        assertThrows(IndexOutOfBoundsException.class, 
            () -> {
            assertNotEquals(8, result[4]);
            assertEquals(0, result[4]);
            }
        );

//            assertFalse(true);//?
//        }
//        catch(ArrayIndexOutOfBoundsException arrE){
//            System.err.print(arrE.toString());
//            arrE.printStackTrace(); 
//        }
        

        }
        catch(Exception e){
            e.printStackTrace();
        }       
        
//code says uninitailized array should  
//https://stackoverflow.com/questions/27476845/what-is-the-difference-between-a-null-array-and-an-empty-array
    }

    /**
     * test strategy isCIDR
     * 
     * CIDR vs dot decimal notation
     */
    
    /**public boolean isCIDR(String addr)
     * 
     * @param addr string of V4 address in dot decimal notation or CIDR notation
     * @return true iff addr is in CIDR notation
     */
    // https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation
    /**
     * Test of isCIDR method, of class Ipv4.
     */
    @Test
    public void testIsCIDR_dotDec() {
        String localHost = "127.0.0.1";
        V4 instance = new V4();
        boolean result = instance.isCIDR(localHost);
        assertFalse(result);
    }
    
    
        public void testIsCIDR_CIDR(){
            String localHostCIDR = "127.0.0.1/0";
            V4 instance = new V4();
            boolean result2 = instance.isCIDR(localHostCIDR);
            assertTrue(result2);

        }
    
    /***
     * public boolean isPrivateIP(byte[] arr)
     * 
     * @param arr : byte array with one to four bytes (in order)
     * @return    : true iff bytes correspond to a private ip address
     * 
     * bytes use 
     * 
     * 3 ranges of private ip (source RFC 1918 part 3
     * https://tools.ietf.org/html/rfc1918
     * 
     * 10.0.0.0/8   10.0.0.0 – 10.255.255.255
     * 172.16.0.0/12    172.16.0.0 – 172.31.255.255 	
     * 192.168.0.0/16 	192.168.0.0 – 192.168.255.255
     */
        
        /***
         * test strategy for public boolean isPrivateIP(byte[] arr)
         * 
         * 
         * 
         */
        
    /**
     * Test of isPrivateIP method, of class V4.
     */
    @Test
    public void testIsPrivateIP_byteArr() {
    }

    /**
     * Test of isPrivateIP method, of class V4.
     */
    @Test
    public void testIsPrivateIP_String() {
    }

    /**
     * Test of isValidIpv4 method, of class V4.
     */
    @Test
    public void testIsValidIpv4() throws Exception {
    }

    /**
     * Test of isCIDR method, of class V4.
     */
    @Test
    public void testIsCIDR() {
    }

    /**
     * Test of isPublicIp method, of class V4.
     */
    @Test
    public void testIsPublicIp_String() {
    }

    /**
     * Test of ipByteToJavaByte method, of class V4.
     */
    @Test
    public void testIpByteToJavaByte() {
    }

    /**
     * Test of javaByteToIpByte method, of class V4.
     */
    @Test
    public void testJavaByteToIpByte() {
    }

    
}
