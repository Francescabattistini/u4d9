package francescaBattistini.entities;

import java.util.Random;

public class NomeEId {
    protected long id;
    protected String name;

    public NomeEId(String name) {
        Random rand = new Random();
        this.name = name;
        this.id = rand.nextLong(10000,100000);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
