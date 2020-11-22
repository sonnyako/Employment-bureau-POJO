package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Company {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String description;

    public Company(Long id, String name, String address, String phoneNumber, String email, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) &&
            Objects.equals(name, company.name) &&
            Objects.equals(address, company.address) &&
            Objects.equals(phoneNumber, company.phoneNumber) &&
            Objects.equals(email, company.email) &&
            Objects.equals(description, company.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phoneNumber, email, description);
    }

    @Override
    public String toString() {
        return "Company{" +
            "id" + this.id +
            "name" + this.name +
            "address" + this.address +
            "email" + this.email +
            "phoneNumber" + this.phoneNumber +
            "description" + this.description + "}";
    }
}
