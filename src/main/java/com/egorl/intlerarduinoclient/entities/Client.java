package com.egorl.intlerarduinoclient.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Objects.equals(profile, client.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, profile);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", profile=" + profile +
                '}';
    }
}
