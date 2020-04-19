package com.egorl.intlerarduinoclient.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name="profiles")
public class Profile {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "timeout")
    private int timeout;

    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
    private Collection<Sensor> sensors;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public Collection<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(Collection<Sensor> sensors) {
        this.sensors = sensors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return id == profile.id &&
                timeout == profile.timeout &&
                Objects.equals(login, profile.login) &&
                Objects.equals(password, profile.password) &&
                Objects.equals(deviceName, profile.deviceName) &&
                Objects.equals(sensors, profile.sensors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, deviceName, timeout, sensors);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", timeout=" + timeout +
                ", sensors=" + sensors +
                '}';
    }
}
