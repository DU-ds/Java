/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kenneth Collins
 */
public class ShoesTest {
    
    public ShoesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getShoeSizeInCentemeters method, of class Shoes.
     */
    @Test
    public void testGetShoeSizeInCentemeters() {
        System.out.println("getShoeSizeInCentemeters");
        Shoes instance = new Shoes();
        int expResult = 25;
        int result = instance.getShoeSizeInCentemeters();
        assertEquals(expResult, result);
        int expResult2 = 0;
        Shoes instance2 = new Shoes(expResult2, "blue");
        int result2 = instance2.getShoeSizeInCentemeters();
        assertEquals(expResult2, result2);
        int expResult3 = 1000000;
        Shoes instance3 = new Shoes(expResult3, "blue");
        int result3 = instance3.getShoeSizeInCentemeters();
        assertEquals(expResult3, result3);
        int expResult4 = -1;
        Shoes inst4 = new Shoes(expResult4, "blue");
        int res4 = inst4.getShoeSizeInCentemeters();
        assertEquals(Math.abs(res4), Math.abs( expResult4));  
    }
    

    @Test
    public void testShoeContructor1(){
        Shoes inst = new Shoes();
        boolean tied = inst.getShoesTied();
        boolean on = inst.getShoesOn();
        String color = inst.getShoeColor();
        int size = inst.getShoeSizeInCentemeters();
        assertEquals(tied, false); // the constructor specifies it as false 
        assertEquals(on, false); // constructor specifies it as false
        assertEquals(color, "black"); // default value
        assertEquals(size, 25); //default value
    }
    
    @Test
    public void testShoeConstructor2(){
        int C = 0;
        String S = "blue";
        boolean O = true;
        boolean T = true;
        Shoes inst = new Shoes(C, S, O, T);
        int resC = inst.getShoeSizeInCentemeters();
        String resS = inst.getShoeColor();
        boolean resO = inst.getShoesOn();
        boolean resT = inst.getShoesTied(); 
//asssumes these methods worked. Hmm, might be circular tests :/
// guess that's ok since these are just practice.
        assertEquals(C, resC);
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);
    
        C = 1;
        S = "soap";
        O = true;
        T = false;
        inst = new Shoes(C, S, O, T);
        resC = inst.getShoeSizeInCentemeters();
        resS = inst.getShoeColor();
        resO = inst.getShoesOn();
        resT = inst.getShoesTied(); 
        assertEquals(C, resC);
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);
        
        C = -1;
        S= "bleu"; //intentional
        O = false;
        T = true;
        inst = new Shoes(C, S, O, T);
        resC = inst.getShoeSizeInCentemeters();
        resS = inst.getShoeColor();
        resO = inst.getShoesOn();
        resT = inst.getShoesTied(); 
        assertEquals(Math.abs(C), Math.abs( resC));
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);
        
        C = 1;
        S = "red";
        O = false;
        T = true;
        inst = new Shoes(C, S, O, T);
        resC = inst.getShoeSizeInCentemeters();
        resS = inst.getShoeColor();
        resO = inst.getShoesOn();
        resT = inst.getShoesTied(); 
        assertEquals(C, resC);
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);
        
        C = 100000;
        S = "green";
        O = true;
        T = false;
        inst = new Shoes(C, S, O, T);
        resC = inst.getShoeSizeInCentemeters();
        resS = inst.getShoeColor();
        resO = inst.getShoesOn();
        resT = inst.getShoesTied(); 
        assertEquals(C, resC);
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);
        
        C      = -100000;
        S   = "";
        O  = false;
        T  = false;
        inst = new Shoes(C, S, O, T);
        resC = inst.getShoeSizeInCentemeters();
        resS = inst.getShoeColor();
        resO = inst.getShoesOn();
        resT = inst.getShoesTied(); 
        assertEquals( Math.abs(C), Math.abs(resC));
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);
    
        C      = -0;
        S   = "Green";
        O  = true;
        T  = true;
        inst = new Shoes(C, S, O, T);
        resC = inst.getShoeSizeInCentemeters();
        resS = inst.getShoeColor();
        resO = inst.getShoesOn();
        resT = inst.getShoesTied(); 
        assertEquals( Math.abs(C), Math.abs(resC));
        assertEquals(S, resS);
        assertEquals(O, resO);
        assertEquals(T, resT);

    }
    @Test
    public void testShoeConstructor3(){
        int C = 0 ;
        String S = "Black";
        Shoes ins = new Shoes(C, S);
        int resC = ins.getShoeSizeInCentemeters();
        String resS = ins.getShoeColor();
        assertEquals(C, resC);
        assertEquals(S, resS);
        
        
        C = -1;
        S = "black";
        ins = new Shoes(C, S);
        resC = ins.getShoeSizeInCentemeters();
        resS = ins.getShoeColor();
        assertEquals(C, resC);
        assertEquals(S, resS);
        
        C = 1;
        S = "green";
        ins = new Shoes(C, S);
        resC = ins.getShoeSizeInCentemeters();
        resS = ins.getShoeColor();
        assertEquals(C, resC);
        assertEquals(S, resS);
        
        C = 1000000;
        S = "";
        ins = new Shoes(C, S);
        resC = ins.getShoeSizeInCentemeters();
        resS = ins.getShoeColor();
        assertEquals(C, resC);
        assertEquals(S, resS);
        
        C = -1000000;
        S = "'Hey'";
        ins = new Shoes(C, S);
        resC = ins.getShoeSizeInCentemeters();
        resS = ins.getShoeColor();
        assertEquals(C, resC);
        assertEquals(S, resS);
                
        
    } 
        
    /**
     * Test of getShoeColor method, of class Shoes.
     */
    @Test
    public void testGetShoeColor() {
        System.out.println("getShoeColor");
        Shoes instance = new Shoes();
        String expResult = "black";
        String result = instance.getShoeColor();
        assertEquals(expResult, result);
        String expResult2 = "blue";
        Shoes instance2 = new Shoes(15, expResult2 );
        String result2 = instance2.getShoeColor();
        assertEquals(expResult2, result2 );
        String expResult3 = "bionic";  
        Shoes instance3 = new Shoes(15, expResult3);
        String result3 = instance3.getShoeColor();
        assertEquals(expResult3, result3);
        Shoes instance4 = new Shoes(0, expResult2); //retrying "blue" with a zero cm shoe
        String result4 = instance4.getShoeColor();
        assertEquals(expResult2 , result4);
        String expResult5 = "orange";
        Shoes instance5 = new Shoes(-1, expResult5);
        String result5 = instance5.getShoeColor();
        assertEquals(result5, expResult5);
        
       
    }

    /**
     * Test of getShoesOn method, of class Shoes.
     */
    @Test
    public void testGetShoesOn() {
        System.out.println("getShoesOn");
        Shoes instance = new Shoes();
        boolean expResult = false;
        boolean result = instance.getShoesOn();
        assertEquals(expResult, result);
        boolean expRes2 = true;
        Shoes inst2 = new Shoes( 15, "red", expRes2, false);
       boolean result2 = inst2.getShoesOn();
       assertEquals( expRes2, result2);
    }

    /**
     * Test of getShoesTied method, of class Shoes.
     */
    @Test
    public void testGetShoesTied() {
        System.out.println("getShoesTied");
        Shoes instance = new Shoes();
        boolean expResult = false;
        boolean result = instance.getShoesTied();
        assertEquals(expResult, result);
        boolean expRes1 = false;
        Shoes inst1 = new Shoes(15, "orange", true, expRes1);
        boolean res1 = inst1.getShoesTied() ;
        assertEquals(expRes1, res1);
        boolean expRes2 = true;
        Shoes inst2 = new Shoes( 15, "orange", true, expRes2);
        boolean res2 = inst2.getShoesTied();
        assertEquals(expRes2, res2);
    }

    /**
     * Test of setShoesTied method, of class Shoes.
     */
    @Test
    public void testSetShoesTied() {
        System.out.println("setShoesTied");
        Shoes instance = new Shoes();
        boolean expRes1 = true;
        instance.setShoesTied(expRes1);
        boolean res1 = instance.getShoesTied(); //test assumes the getShoesTied()method works
        assertEquals(res1, expRes1);
        boolean expRes2 = false;
        instance.setShoesTied(expRes2);
        boolean res2 = instance.getShoesTied(); //test assumes the getShoesTied()method works
        assertEquals(res2, expRes2);
    }

    /**
     * Test of setShoesOn method, of class Shoes.
     */
    @Test
    public void testSetShoesOn() {
        System.out.println("setShoesOn");
        boolean T = true;
        Shoes ins = new Shoes();
        ins.setShoesOn(T);
        boolean resT = ins.getShoesOn();
        assertEquals(resT, T);
        T = false;
        ins.setShoesOn(T);
        resT = ins.getShoesOn();
        assertEquals(resT, T);
        
        
    }

    /**
     * Test of main method, of class Shoes.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Shoes.main(args);

        
    }
    
}
