package com.fibanez.chessProblem.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author fibanez.
 */
public class BishopTest {

    Bishop b1;
    Bishop b2;

    @Before
    public void setUp() throws Exception {
        b1 = new Bishop();
        b2 = new Bishop();
    }

    @After
    public void tearDown() throws Exception {
        b1 = null;
        b2 = null;
    }

    /**
     *  -  -  B
     *  -  B  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedBishopIn1SquareDiagonalReturnTrue() throws Exception {
        b1.setPosition(0,2);
        b2.setPosition(1,1);

        boolean result = b1.threatsTo(b2);
        assertTrue(result);
        result = b2.threatsTo(b1);
        assertTrue(result);
    }

    /**
     *  -  -  B
     *  -  -  -
     *  B  -  -
     */
    @Test
    public void testIsThreatedBishopIn2SquareDiafonalReturnTrue() throws Exception {
        b1.setPosition(0,2);
        b2.setPosition(2,0);

        boolean result = b1.threatsTo(b2);
        assertTrue(result);
        result = b2.threatsTo(b1);
        assertTrue(result);
    }

    /**
     *  -  B  -
     *  -  -  -
     *  B  -  -
     */
    @Test
    public void testIsThreatedBishopInLReturnFalse() throws Exception {
        b1.setPosition(0,1);
        b2.setPosition(2,0);

        boolean result = b1.threatsTo(b2);
        assertFalse(result);
        result = b2.threatsTo(b1);
        assertFalse(result);
    }

    /**
     *  B  B  -
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedBishopIn1RownReturnFalse() throws Exception {
        b1.setPosition(0,0);
        b1.setPosition(0,1);

        boolean result = b1.threatsTo(b2);
        assertFalse(result);
        result = b2.threatsTo(b1);
        assertFalse(result);
    }

    /**
     *  B  -  B
     *  -  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedBishopIn2RownReturnFalse() throws Exception {
        b1.setPosition(0,0);
        b1.setPosition(0,2);

        boolean result = b1.threatsTo(b2);
        assertFalse(result);
        result = b2.threatsTo(b1);
        assertFalse(result);
    }

    /**
     *  B  -  -
     *  B  -  -
     *  -  -  -
     */
    @Test
    public void testIsThreatedBishopIn1ColReturnFalse() throws Exception {
        b1.setPosition(0,0);
        b1.setPosition(1,0);

        boolean result = b1.threatsTo(b2);
        assertFalse(result);
        result = b2.threatsTo(b1);
        assertFalse(result);
    }

    /**
     *  B  -  -
     *  -  -  -
     *  B  -  -
     */
    @Test
    public void testIsThreatedBishopin2ColReturnFalse() throws Exception {
        b1.setPosition(0,0);
        b1.setPosition(2,0);

        boolean result = b1.threatsTo(b2);
        assertFalse(result);
        result = b2.threatsTo(b1);
        assertFalse(result);
    }
    
}
