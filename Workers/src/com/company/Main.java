package com.company;

import com.company.model.Company;
import com.company.model.Contract;
import com.company.model.Summary;
import com.company.model.Worker;
import com.company.model.Vacancy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company(1L, "SoftServe", "Holovna,109 str.", "+390958767653",
            "user1@gmail.com", "IT company");
        Company company2 = new Company(2L, "SharpMinds", "Holovna,10 str.", "+390747382683",
            "user2@gmail.com", "IT company");
        Company company3 = new Company(3L, "AlterEGO", "Heroiv Maidany, 108 str.", "+390663628268",
            "user3@gmail.com", "IT company");

        Summary summary1 = new Summary(1L, "4 years middle Java developer", "Java Core, " +
            "Java13, Spring", "hardworker", "CHNU", "Web-development");
        Summary summary2 = new Summary(2L, "2 years Project Manager", "Scrum, English C1",
            "hardworker", "KNU", "Project Management");
        Summary summary3 = new Summary(3L, "1 year Front-end developer", "English B2, React, CSS",
            "hardworker", "CHNU", "Front-end developer");

        Worker user1 = new Worker(1L, "Duntu Ilona", "Chernivtsi", "+38074538283", "ilona@gmail.com", summary1);
        Worker user2 = new Worker(2L, "Todor Maxim", "Chagor", "+380393844774", "max@gmail.com", summary2);
        Worker user3 = new Worker(3L, "Gorod Maxim", "Chernivtsi", "+38039383838", "gorod@gmail.com", summary3);

        Vacancy vacancy1 = new Vacancy(1L, "Java developer", 2500, "Need Java Dev for new project",
            "English B2+, Java13", company1);
        Vacancy vacancy2 = new Vacancy(2L, "Project manager", 500, "Need PM for new project",
            "English B2+, Scrum", company2);
        Vacancy vacancy3 = new Vacancy(3L, "Front-end Dev", 1800, "Need Front-end Dev for new project",
            "English B2+, React", company3);

        Contract contract1 = new Contract(1L, company1, user1, vacancy1);
        Contract contract2 = new Contract(2L, company2, user2, vacancy2);
        Contract contract3 = new Contract(3L, company3, user3, vacancy3);

        ArrayList<Contract> list = new ArrayList<>(Arrays.asList(contract1, contract2, contract3));
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(summary1.getActivity(),
            summary2.getActivity(), summary3.getActivity()));
        System.out.println(list1);
    }
}
