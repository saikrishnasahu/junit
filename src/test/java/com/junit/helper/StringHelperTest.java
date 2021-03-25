package com.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringHelperTest {

    private StringHelper stringHelper;

    @Before
    public void setUp() {
        stringHelper = new StringHelper();
    }

    //	AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
//        fail("Not Implemented");
//        assertEquals("ABC","ABC");
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_CharactersAreSame() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_CharactersAreDifferent() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ACAC"));
    }

    @After
    public void tearDown() {
        stringHelper = null;
    }
}
