package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Worker {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private Summary summary;

    public Worker(Long id, String name, String address, String phoneNumber, String email, Summary summary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker user = (Worker) o;
        return Objects.equals(id, user.id) &&
            Objects.equals(name, user.name) &&
            Objects.equals(address, user.address) &&
            Objects.equals(phoneNumber, user.phoneNumber) &&
            Objects.equals(email, user.email) &&
            Objects.equals(summary, user.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, email, summary);
    }

    @Override
    public String toString() {
        return "User{" +
            "id" + this.id +
            "name" + this.name +
            "address" + this.address +
            "address" + this.address +
            "email" + this.email +
            "summary" + this.summary + "}";
    }

}
