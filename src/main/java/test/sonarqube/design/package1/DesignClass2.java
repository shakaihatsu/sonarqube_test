package test.sonarqube.design.package1;

import test.sonarqube.design.package2.DesignClass3;

public class DesignClass2 {
    private DesignClass3 dependency;

    public DesignClass3 getDependency() {
        return dependency;
    }

    public void setDependency(DesignClass3 dependency) {
        this.dependency = dependency;
    }
}
