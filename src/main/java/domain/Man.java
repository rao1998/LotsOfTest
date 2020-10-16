package domain;

public class Man {
    private String name;
    private Secret secret;

    public Man(String name, Secret secret) {
        this.name = name;
        this.secret = secret;
    }

    public Man() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Secret getSecret() {
        return secret;
    }

    public void setSecret(Secret secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", secret=" + secret +
                '}';
    }
}
