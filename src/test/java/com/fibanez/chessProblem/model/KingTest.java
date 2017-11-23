package com.fibanez.chessProblem.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author fibanez.
 */
public class KingTest {

    King k1;
    King k2;

    @Before
    public void setUp() throws Exception {
        k1 = new King();
        k2 = new King();
    }

    @After
    public void tearDown() throws Exception {
        k1 = null;
        k2 = null;
    }

    /**
     *  -  -  K
     *  -  K  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKingIn1SquareDiagonalReturnTrue() throws Exception {
        k1.setPosition(0,2);
        k2.setPosition(1,1);

        boolean result = k1.threatsTo(k2);
        assertTrue(result);
        result = k2.threatsTo(k1);
        assertTrue(result);
    }

    /**
     *  -  -  K
     *  -  -  -
     *  K  -  -
     */
    @Test
    public void testIsThreatedKingIn2SquareDiafonalReturnFalse() throws Exception {
        k1.setPosition(0,2);
        k2.setPosition(2,0);

        boolean result = k1.threatsTo(k2);
        assertFalse(result);
        result = k2.threatsTo(k1);
        assertFalse(result);
    }

    /**
     *  -  K  -
     *  -  -  -
     *  K  -  -
     */
    @Test
    public void testIsThreatedKingInLReturnFalse() throws Exception {
        k1.setPosition(0,1);
        k2.setPosition(2,0);

        boolean result = k1.threatsTo(k2);
        assertFalse(result);
        result = k2.threatsTo(k1);
        assertFalse(result);
    }

    /**
     *  N  N  -
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKingIn1RownReturnTrue() throws Exception {
        k1.setPosition(0,0);
        k1.setPosition(0,1);

        boolean result = k1.threatsTo(k2);
        assertTrue(result);
        result = k2.threatsTo(k1);
        assertTrue(result);
    }

    /**
     *  N  -  N
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKingIn2RownReturnFalse() throws Exception {
        k1.setPosition(0,0);
        k1.setPosition(0,2);

        boolean result = k1.threatsTo(k2);
        assertFalse(result);
        result = k2.threatsTo(k1);
        assertFalse(result);
    }

    /**
     *  N  -  -
     *  N  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKingIn1ColReturnTrue() throws Exception {
        k1.setPosition(0,0);
        k1.setPosition(1,0);

        boolean result = k1.threatsTo(k2);
        assertTrue(result);
        result = k2.threatsTo(k1);
        assertTrue(result);
    }

    /**
     *  N  -  -
     *  -  -  -
     *  N  -  -
     */
    @Test
    public void testIsThreatedKingin2ColReturnFalse() throws Exception {
        k1.setPosition(0,0);
        k1.setPosition(2,0);

        boolean result = k1.threatsTo(k2);
        assertFalse(result);
        result = k2.threatsTo(k1);
        assertFalse(result);
    }
    
}
