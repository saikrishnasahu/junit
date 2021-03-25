package com.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParamTest {

    private final String input;
    private final String output;
    private final StringHelper stringHelper = new StringHelper();

    public StringHelperParamTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutput = {{"AACD", "CD"}, {"ACD", "CD"}};
        return asList(expectedOutput);
    }

    //	AACD => CD ACD => CD CDEF => CDEF CDAA => CDAA
    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(output, stringHelper.truncateAInFirst2Positions(input));
    }
}
