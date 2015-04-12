package test.sonarqube.complexity;

import test.sonarqube.Util;

public class ComplexityClass2 {
    public void methodA2(Integer parameter1, Integer parameter2) {
        if (parameter1 > parameter2) {
            Util.methodZ();
        } else {
            Util.methodY();
        }
    }
}
