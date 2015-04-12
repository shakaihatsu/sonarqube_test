package test.sonarqube.design.package1;

public class DesignClass1 {
    private DesignClass2 dependency;

    public DesignClass2 getDependency() {
        return dependency;
    }

    public void setDependency(DesignClass2 dependency) {
        this.dependency = dependency;
    }
}
