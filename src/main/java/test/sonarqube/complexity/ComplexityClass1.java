package test.sonarqube.complexity;

import test.sonarqube.Util;

public class ComplexityClass1 {
    public void methodA1(Integer parameter1, Integer parameter2) {
        if (parameter1 > parameter2) {
            Util.methodZ();
        }
    }
}
