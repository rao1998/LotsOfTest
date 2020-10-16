package domain;

public class Secret {
    private String height;
    private String weight;

    public Secret(String height, String weight) {
        this.height = height;
        this.weight = weight;
    }

    public Secret() {
    }

    @Override
    public String toString() {
        return "Secret{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
