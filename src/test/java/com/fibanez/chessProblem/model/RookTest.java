package com.fibanez.chessProblem.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author fibanez.
 */
public class RookTest {

    Rook r1;
    Rook r2;

    @Before
    public void setUp() throws Exception {
        r1 = new Rook();
        r2 = new Rook();
    }

    @After
    public void tearDown() throws Exception {
        r1 = null;
        r2 = null;
    }

    /**
     *  -  -  R
     *  -  R  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedRookIn1SquareDiagonalReturnFalse() throws Exception {
        r1.setPosition(0,2);
        r2.setPosition(1,1);

        boolean result = r1.threatsTo(r2);
        assertFalse(result);
        result = r2.threatsTo(r1);
        assertFalse(result);
    }

    /**
     *  -  -  R
     *  -  -  -
     *  R  -  -
     */
    @Test
    public void testIsThreatedRookIn2SquareDiafonalReturnFalse() throws Exception {
        r1.setPosition(0,2);
        r2.setPosition(2,0);

        boolean result = r1.threatsTo(r2);
        assertFalse(result);
        result = r2.threatsTo(r1);
        assertFalse(result);
    }

    /**
     *  -  R  -
     *  -  -  -
     *  R  -  -
     */
    @Test
    public void testIsThreatedRookInLReturnFalse() throws Exception {
        r1.setPosition(0,1);
        r2.setPosition(2,0);

        boolean result = r1.threatsTo(r2);
        assertFalse(result);
        result = r2.threatsTo(r1);
        assertFalse(result);
    }

    /**
     *  R  R  -
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedRookIn1RownReturnTrue() throws Exception {
        r1.setPosition(0,0);
        r1.setPosition(0,1);

        boolean result = r1.threatsTo(r2);
        assertTrue(result);
        result = r2.threatsTo(r1);
        assertTrue(result);
    }

    /**
     *  R  -  R
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedRookIn2RownReturnTrue() throws Exception {
        r1.setPosition(0,0);
        r1.setPosition(0,2);

        boolean result = r1.threatsTo(r2);
        assertTrue(result);
        result = r2.threatsTo(r1);
        assertTrue(result);
    }

    /**
     *  R  -  -
     *  R  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedRookIn1ColReturnTrue() throws Exception {
        r1.setPosition(0,0);
        r1.setPosition(1,0);

        boolean result = r1.threatsTo(r2);
        assertTrue(result);
        result = r2.threatsTo(r1);
        assertTrue(result);
    }

    /**
     *  R  -  -
     *  -  -  -
     *  R  -  -
     */
    @Test
    public void testIsThreatedRookin2ColReturnTrue() throws Exception {
        r1.setPosition(0,0);
        r1.setPosition(2,0);

        boolean result = r1.threatsTo(r2);
        assertTrue(result);
        result = r2.threatsTo(r1);
        assertTrue(result);
    }
    
}
