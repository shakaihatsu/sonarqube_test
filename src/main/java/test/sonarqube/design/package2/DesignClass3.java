package test.sonarqube.design.package2;

import test.sonarqube.design.package1.DesignClass1;

public class DesignClass3 {
    private DesignClass1 dependency;

    public DesignClass1 getDependency() {
        return dependency;
    }

    public void setDependency(DesignClass1 dependency) {
        this.dependency = dependency;
    }
}
