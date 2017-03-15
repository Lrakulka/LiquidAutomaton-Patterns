package model.entity;

/**
 * Created by Oleksandr_Borysov on 3/14/2017.
 */
public class Client {
    private int money;
    private String name;

    public Client(int money, String name) {
        this.money = money;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (money != client.money) return false;
        return name != null ? name.equals(client.name) : client.name == null;

    }

    @Override
    public int hashCode() {
        int result = money;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "money=" + money +
                ", name='" + name + '\'' +
                '}';
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
