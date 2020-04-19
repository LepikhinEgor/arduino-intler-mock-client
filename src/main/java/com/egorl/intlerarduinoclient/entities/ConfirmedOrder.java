package com.egorl.intlerarduinoclient.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "confirmed_orders")
public class ConfirmedOrder {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfirmedOrder that = (ConfirmedOrder) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, client);
    }

    @Override
    public String toString() {
        return "ConfirmedOrder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", client=" + client +
                '}';
    }
}
