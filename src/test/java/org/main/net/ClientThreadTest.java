package org.main.net;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

// Unit test for simple App
public class ClientThreadTest extends TestCase {

    public ClientThreadTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite( ClientThreadTest.class );
    }

//    public void testMainClass() {
//        assertTrue( true );
//    }
}