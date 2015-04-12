package test.sonarqube.duplication.complete;

import java.util.List;

import test.sonarqube.Util;

public class DuplicationClass1 {
    public Integer method1(List<String> list, String candidate) {
        int index = 0;

        for (String string : list) {
            Util.methodZ(1);
            Util.methodZ(2);
            Util.methodZ(3);
            Util.methodZ(4);
            Util.methodZ(5);
            Util.methodZ(6);
            Util.methodZ(7);
            Util.methodZ(8);
            Util.methodZ(9);
            Util.methodZ(10);
            if (candidate.equals(string)) {
                return index;
            }
            index++;
        }

        return null;
    }

    public Integer method2(List<String> list, String candidate) {
        int index = 0;

        for (String string : list) {
            Util.methodZ(1);
            Util.methodZ(2);
            Util.methodZ(3);
            Util.methodZ(4);
            Util.methodZ(5);
            Util.methodZ(6);
            Util.methodZ(7);
            Util.methodZ(8);
            Util.methodZ(9);
            Util.methodZ(10);
            if (candidate.equals(string)) {
                return index;
            }
            index++;
        }

        return null;
    }
}
