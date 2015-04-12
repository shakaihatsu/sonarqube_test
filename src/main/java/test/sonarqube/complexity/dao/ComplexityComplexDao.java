package test.sonarqube.complexity.dao;

public class ComplexityComplexDao {
    private Object property;

    public Object getProperty() {
        return property;
    }

    public void setProperty(Object property) {
        String propertyString = property.toString();
        this.property = propertyString;
    }
}
