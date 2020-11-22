package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Vacancy {
    private Long id;
    private String position;
    private float salary;
    private String description;
    private String requirements;
    private Company company;

    public Vacancy(Long id, String position, float salary, String description, String requirements, Company company) {
        this.id = id;
        this.position = position;
        this.salary = salary;
        this.description = description;
        this.requirements = requirements;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vacancy)) return false;
        Vacancy vacancy = (Vacancy) o;
        return Float.compare(vacancy.salary, salary) == 0 &&
            Objects.equals(id, vacancy.id) &&
            Objects.equals(position, vacancy.position) &&
            Objects.equals(description, vacancy.description) &&
            Objects.equals(requirements, vacancy.requirements) &&
            Objects.equals(company, vacancy.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position, salary, description, requirements, company);
    }

    @Override
    public String toString() {
        return "Vacancy{" +
            "id" + this.id +
            "position" + this.position +
            "salary" + this.salary +
            "description" + this.description +
            "requirements" + this.requirements +
            "company" + this.company + "}";
    }

}
