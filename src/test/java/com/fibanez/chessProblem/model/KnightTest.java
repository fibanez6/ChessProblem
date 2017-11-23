package com.fibanez.chessProblem.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author fibanez.
 */
public class KnightTest {

    Knight n1;
    Knight n2;

    @Before
    public void setUp() throws Exception {
        n1 = new Knight();
        n2 = new Knight();
    }

    @After
    public void tearDown() throws Exception {
        n1 = null;
        n2 = null;
    }

    /**
     *  -  -  N
     *  -  N  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKnightIn1SquareDiagonalReturnFalse() throws Exception {
        n1.setPosition(0,2);
        n2.setPosition(1,1);

        boolean result = n1.threatsTo(n2);
        assertFalse(result);
        result = n2.threatsTo(n1);
        assertFalse(result);
    }

    /**
     *  -  -  N
     *  -  -  -
     *  N  -  -
     */
    @Test
    public void testIsThreatedKnightIn2SquareDiafonalReturnFalse() throws Exception {
        n1.setPosition(0,2);
        n2.setPosition(2,0);

        boolean result = n1.threatsTo(n2);
        assertFalse(result);
        result = n2.threatsTo(n1);
        assertFalse(result);
    }

    /**
     *  -  N  -
     *  -  -  -
     *  N  -  -
     */
    @Test
    public void testIsThreatedKnightInLReturnTrue() throws Exception {
        n1.setPosition(0,1);
        n2.setPosition(2,0);

        boolean result = n1.threatsTo(n2);
        assertTrue(result);
        result = n2.threatsTo(n1);
        assertTrue(result);
    }

    /**
     *  N  N  -
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKnightInSameRownReturnFalse() throws Exception {
        n1.setPosition(0,0);
        n1.setPosition(0,1);

        boolean result = n1.threatsTo(n2);
        assertFalse(result);
        result = n2.threatsTo(n1);
        assertFalse(result);
    }

    /**
     *  N  -  -
     *  N  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedKnightInSameColReturnFalse() throws Exception {
        n1.setPosition(0,0);
        n1.setPosition(1,0);

        boolean result = n1.threatsTo(n2);
        assertFalse(result);
        result = n2.threatsTo(n1);
        assertFalse(result);
    }

}
