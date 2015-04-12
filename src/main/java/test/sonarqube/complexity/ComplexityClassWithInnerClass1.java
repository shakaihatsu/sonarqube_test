package test.sonarqube.complexity;

import test.sonarqube.Util;

public class ComplexityClassWithInnerClass1 {
    public void methodA1(Integer parameter1, Integer parameter2) {
        if (parameter1 > parameter2) {
            Util.methodZ();
        }
    }

    public class InnerClass1 {
        public void methodA2(Integer parameter1, Integer parameter2) {
            if (parameter1 > parameter2) {
                Util.methodZ();
            } else {
                Util.methodY();
            }
        }
    }
}
