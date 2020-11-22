package com.company.model;

import java.util.Objects;

/**
 * @author sonnyako <Makydon Sofiia>
 * @version 1.0.0
 * @since 1.0.0
 */
public class Summary {
    private Long id;
    private String experience;
    private String hardSkills;
    private String softSkills;
    private String education;
    private String activity;

    public Summary(Long id, String experience, String hardSkills, String softSkills, String education, String activity) {
        this.id = id;
        this.experience = experience;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
        this.education = education;
        this.activity = activity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getHardSkills() {
        return hardSkills;
    }

    public void setHardSkills(String hardSkills) {
        this.hardSkills = hardSkills;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Summary)) return false;
        Summary summary = (Summary) o;
        return Objects.equals(id, summary.id) &&
            Objects.equals(experience, summary.experience) &&
            Objects.equals(hardSkills, summary.hardSkills) &&
            Objects.equals(softSkills, summary.softSkills) &&
            Objects.equals(education, summary.education) &&
            Objects.equals(activity, summary.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, experience, hardSkills, softSkills, education, activity);
    }

    @Override
    public String toString() {
        return "Summary{" +
            "id" + this.id +
            "experience" + this.experience +
            "hardSkills" + this.hardSkills +
            "softSkills" + this.softSkills +
            "education" + this.education +
            "activity" + this.activity + "}";
    }
}
