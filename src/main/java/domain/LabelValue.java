package domain;


public class LabelValue {
    /**
     * code
     */
    private String value;
    /**
     * name
     */
    private String label;

    public LabelValue(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public LabelValue() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabelValue{" +
                "value='" + value + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}