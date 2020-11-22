package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Contract {
    private Long id;
    private Company company;
    private Worker worker;
    private Vacancy vacancy;

    public Contract(Long id, Company company, Worker worker, Vacancy vacancy) {
        this.id = id;
        this.company = company;
        this.worker = worker;
        this.vacancy = vacancy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contract)) return false;
        Contract contract = (Contract) o;
        return Objects.equals(id, contract.id) &&
            Objects.equals(company, contract.company) &&
            Objects.equals(worker, contract.worker) &&
            Objects.equals(vacancy, contract.vacancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, company, worker, vacancy);
    }

    @Override
    public String toString() {
        return "Contract{" +
            "id" + this.id +
            "company" + this.company +
            "worker" + this.worker +
            "vacancy" + this.vacancy + "}";
    }
}
