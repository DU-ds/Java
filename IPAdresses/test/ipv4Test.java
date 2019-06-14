/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.Inet4Address;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DU-ds
 */
public class ipv4Test {
    
    public ipv4Test() {
    }

//    @BeforeAll
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterAll
//    public static void tearDownClass() throws Exception {
//    }
    

    /**
     * Handles dots correctly
     * addr.length = 4
     */
    @Test
    public void testIsValidIpv4_dot() {
        System.out.println("isValidIpv4");
        String localHost = "127.0.0.1";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue( result);
    }
    /**
    * handles colons correctly
    * addr.length = 4
    */
    @Test
    public void testIsValidIpv4_colon() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:0:1";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }
        /**
    * addr.length > 0
    */
    @Test
    public void testIsValidIpv4_len0() {
        System.out.println("isValidIpv4");
        String emptyHost = "";
        ipv4 ip = new ipv4();
        boolean result = ip.isValidIpv4(emptyHost);
        assertFalse(result);
    }
        /**
    * addr.length <= 4
    */
    @Test
    public void testIsValidIpv4_len5() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:0:1:102";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertFalse(result);
    }

    /**
    * addr.length = 1
    */
    @Test
    public void testIsValidIpv4_len1() {
        System.out.println("isValidIpv4");
        String localHost = "127";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }

    /**
    * addr.length = 2
    */
    @Test
    public void testIsValidIpv4_len2() {
        System.out.println("isValidIpv4");
        String localHost = "127:0";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }
    
    /**
    * addr.length = 3
    */
    @Test
    public void testIsValidIpv4_len3() {
        System.out.println("isValidIpv4");
        String localHost = "127:0:7";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }

    /**
     * invalid data
     */
    @Test
    public void testIsValidIpv4_invalid() {
        System.out.println("isValidIpv4");
        String localHost = "string.124.0.1";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }
    /**
     * CIDR notation
     */
    @Test
    public void testIsValidIpv4_CIDR() {
        System.out.println("isValidIpv4");
        String localHost = "200.0.0.0/8";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }

    @Test
    public void testIsValidIpv4_trailing1() {
        System.out.println("isValidIpv4");
        String localHost = "200.";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }
    
       
    @Test
    public void testIsValidIpv4_trailing2() {
        System.out.println("isValidIpv4");
        String localHost = "200.54.";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }
     
    @Test
    public void testIsValidIpv4_trailing3() {
        System.out.println("isValidIpv4");
        String localHost = "200.87.14.";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
    }

    @Test
    public void testIsValidIpv4_trailing4() {
        System.out.println("isValidIpv4");
        String localHost = "212.12.98.69/";
        ipv4 ip = new ipv4();
        boolean expResult = true;
        boolean result = ip.isValidIpv4(localHost);
        assertTrue(result);
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
     * public boolean isValidIpv4(String addr)
     * @param addr : string 
     * @return : true iff addr is a valid ipv4 address (of one to four bytes) delimitated by "." or ":", possibly in CIDR notation
     */


    


    /**
     * Test of isPublicIp method, of class ipv4.
     */
    @Test
    public void testIsPublicIp_Inet4Address() {
        System.out.println("isPublicIp");
        Inet4Address addr = null;
        ipv4 instance = new ipv4();
        boolean expResult = false;
        boolean result = instance.isPublicIp(addr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPublicIp method, of class ipv4.
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
0.0.0.0/8 	0.0.0.0–0.255.255.255 
10.0.0.0/8 	10.0.0.0–10.255.255.255 	
100.64.0.0/10 	100.64.0.0–100.127.255.255 
127.0.0.0/8 	127.0.0.0–127.255.255.255 
169.254.0.0/16 	169.254.0.0–169.254.255.255 
172.16.0.0/12 	172.16.0.0–172.31.255.255 
192.0.0.0/24 	192.0.0.0–192.0.0.255 
192.0.2.0/24 	192.0.2.0–192.0.2.255 
192.88.99.0/24 	192.88.99.0–192.88.99.255 
192.168.0.0/16 	192.168.0.0–192.168.255.255 
198.18.0.0/15 	198.18.0.0–198.19.255.255 
198.51.100.0/24 	198.51.100.0–198.51.100.255 
203.0.113.0/24 	203.0.113.0–203.0.113.255 
224.0.0.0/4 	224.0.0.0–239.255.255.255 
240.0.0.0/4 	240.0.0.0–255.255.255.254 
255.255.255.255/32 	255.255.255.255 
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
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
        ipv4 instance = new ipv4();
        boolean result = instance.isPublicIp(addr);
        assertFalse(result);
    }
    
    
    /**
     * Test of stringToIpv4 method, of class ipv4.
     */
    @Test
    public void testStringToIpv4() throws Exception {
        System.out.println("stringToIpv4");
        String addr = "";
        ipv4 instance = new ipv4();
        Inet4Address expResult = null;
        Inet4Address result = instance.stringToIpv4(addr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inetAddressToString method, of class ipv4.
     */
    @Test
    public void testInetAddressToString() {
        System.out.println("inetAddressToString");
        Inet4Address addr = null;
        ipv4 instance = new ipv4();
        String expResult = "";
        String result = instance.inetAddressToString(addr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ipv4.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ipv4 instance = new ipv4();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class ipv4.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        ipv4 instance = new ipv4();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class ipv4.
     */
    @Test
    public void testHashCode() {
        ipv4 instance = new ipv4();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

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
     * Test of ipSplit method, of class ipv4.
     */
    @Test
    public void testIpSplit() {
        System.out.println("ipSplit");
        String localHost = "127.0.0.1";
        ipv4 instance = new ipv4();
        byte[] result = instance.ipSplit(localHost);
        assertEquals(127, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
        assertEquals(1, result[3]);

    }
    
        @Test
    public void testIpSplitCIDR() {
        System.out.println("ipSplit");
        String localHost = "127.0.0.1/8";
        ipv4 instance = new ipv4();
        byte[] result = instance.ipSplit(localHost);
        assertEquals(127, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
        assertEquals(1, result[3]);
        
        try { //should throw an ArrayIndexOutOfBoundsException
            assertNotEquals(8, result[4]);
            assertEquals(0, result[4]);
//            assertFalse(true);//?
        }
        catch(ArrayIndexOutOfBoundsException arrE){
//            System.err.print(arrE.toString());
            arrE.printStackTrace(); 
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
     * @param addr string of ipv4 address in dot decimal notation or CIDR notation
     * @return true iff addr is in CIDR notation
     */
    // https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing#CIDR_notation
    /**
     * Test of isCIDR method, of class ipv4.
     */
    @Test
    public void testIsCIDR_dotDec() {
        String localHost = "127.0.0.1";
        ipv4 instance = new ipv4();
        boolean result = instance.isCIDR(localHost);
        assertFalse(result);
    }
    
    
        public void testIsCIDR_CIDR(){
            String localHostCIDR = "127.0.0.1/0";
            ipv4 instance = new ipv4();
            boolean result2 = instance.isCIDR(localHostCIDR);
            assertTrue(result2);

        }
}
