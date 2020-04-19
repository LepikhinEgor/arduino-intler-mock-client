package com.egorl.intlerarduinoclient.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="sensors")
public class Sensor {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private double value;

    @JoinColumn(name = "profile_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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
        Sensor sensor = (Sensor) o;
        return id == sensor.id &&
                Double.compare(sensor.value, value) == 0 &&
                Objects.equals(name, sensor.name) &&
                Objects.equals(profile, sensor.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value, profile);
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                ", profile=" + profile +
                '}';
    }
}
