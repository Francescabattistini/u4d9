package francescaBattistini.entities;

public class Customer extends NomeEId {
 private final int tier;


    public Customer(String name, int tier) {
        super(name);
        this.tier = tier;
    }

    public int getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
