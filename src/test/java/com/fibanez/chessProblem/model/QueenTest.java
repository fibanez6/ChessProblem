package com.fibanez.chessProblem.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author fibanez.
 */
public class QueenTest {

    Queen q1;
    Queen q2;

    @Before
    public void setUp() throws Exception {
        q1 = new Queen();
        q2 = new Queen();
    }

    @After
    public void tearDown() throws Exception {
        q1 = null;
        q2 = null;
    }

    /**
     *  -  -  Q
     *  -  Q  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedQueenIn1SquareDiagonalReturnTrue() throws Exception {
        q1.setPosition(0,2);
        q2.setPosition(1,1);

        boolean result = q1.threatsTo(q2);
        assertTrue(result);
        result = q2.threatsTo(q1);
        assertTrue(result);
    }

    /**
     *  -  -  Q
     *  -  -  -
     *  Q  -  -
     */
    @Test
    public void testIsThreatedQueenIn2SquareDiafonalReturnTrue() throws Exception {
        q1.setPosition(0,2);
        q2.setPosition(2,0);

        boolean result = q1.threatsTo(q2);
        assertTrue(result);
        result = q2.threatsTo(q1);
        assertTrue(result);
    }

    /**
     *  -  Q  -
     *  -  -  -
     *  Q  -  -
     */
    @Test
    public void testIsThreatedQueenInLReturnFalse() throws Exception {
        q1.setPosition(0,1);
        q2.setPosition(2,0);

        boolean result = q1.threatsTo(q2);
        assertFalse(result);
        result = q2.threatsTo(q1);
        assertFalse(result);
    }

    /**
     *  Q  Q  -
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedQueenIn1RownReturnTrue() throws Exception {
        q1.setPosition(0,0);
        q1.setPosition(0,1);

        boolean result = q1.threatsTo(q2);
        assertTrue(result);
        result = q2.threatsTo(q1);
        assertTrue(result);
    }

    /**
     *  Q  -  Q
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedQueenIn2RownReturnTrue() throws Exception {
        q1.setPosition(0,0);
        q1.setPosition(0,2);

        boolean result = q1.threatsTo(q2);
        assertTrue(result);
        result = q2.threatsTo(q1);
        assertTrue(result);
    }

    /**
     *  Q  -  -
     *  Q  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedQueenIn1ColReturnTrue() throws Exception {
        q1.setPosition(0,0);
        q1.setPosition(1,0);

        boolean result = q1.threatsTo(q2);
        assertTrue(result);
        result = q2.threatsTo(q1);
        assertTrue(result);
    }

    /**
     *  Q  -  -
     *  -  -  -
     *  Q  -  -
     */
    @Test
    public void testIsThreatedQueenin2ColReturnTrue() throws Exception {
        q1.setPosition(0,0);
        q1.setPosition(2,0);

        boolean result = q1.threatsTo(q2);
        assertTrue(result);
        result = q2.threatsTo(q1);
        assertTrue(result);
    }
    
}
