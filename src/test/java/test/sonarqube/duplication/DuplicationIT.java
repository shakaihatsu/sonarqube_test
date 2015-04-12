package test.sonarqube.duplication;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.sonarqube.duplication.complete.DuplicationClass2;

public class DuplicationIT {
    private DuplicationClass2 testSubject;

    @Before
    public void setUp() {
        testSubject = new DuplicationClass2();
    }

    @Test
    public void shouldMethod2ReturnIndexOfCandidate() {
        List<String> list = Arrays.asList("a", "b", "c");
        String candidate = "b";
        Integer expected = 1;

        testMethod2(list, candidate, expected);
    }

    private void testMethod2(List<String> list, String candidate,
            Integer expected) {
        Integer actual = testSubject.method2(list, candidate);

        Assert.assertEquals(expected, actual);
    }
}
