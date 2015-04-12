package test.sonarqube.duplication.complete;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicationClass1Test {
    private DuplicationClass1 testSubject;

    @Before
    public void setUp() {
        testSubject = new DuplicationClass1();
    }

    @Test
    public void shouldMethod1ReturnNull() {
        List<String> list = Arrays.asList("a", "b", "c");
        String candidate = "d";
        Integer expected = null;

        testMethod1(list, candidate, expected);
    }

    @Test
    public void shouldMethod1ReturnIndexOfCandidate() {
        List<String> list = Arrays.asList("a", "b", "c");
        String candidate = "b";
        Integer expected = 1;

        testMethod1(list, candidate, expected);
    }

    @Test
    public void shouldMethod2ReturnNull() {
        List<String> list = Arrays.asList("a", "b", "c");
        String candidate = "d";
        Integer expected = null;

        testMethod2(list, candidate, expected);
    }

    @Test
    public void shouldMethod2ReturnIndexOfCandidate() {
        List<String> list = Arrays.asList("a", "b", "c");
        String candidate = "b";
        Integer expected = 1;

        testMethod2(list, candidate, expected);
    }

    private void testMethod1(List<String> list, String candidate,
            Integer expected) {
        Integer actual = testSubject.method1(list, candidate);

        Assert.assertEquals(expected, actual);
    }

    private void testMethod2(List<String> list, String candidate,
            Integer expected) {
        Integer actual = testSubject.method2(list, candidate);

        Assert.assertEquals(expected, actual);
    }
}
