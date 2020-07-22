package com.company.babe.diseases;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Disease polio = new Disease("Polio",true);
        Disease cancer = new Disease("Cancer",true);
        Disease covid19 = new Disease("Corona Virus",false);
        Disease tb = new Disease("T.B",true);
        Disease aids = new Disease("HIV/AIDS",false);
//        List<Disease> diseases = new ArrayList<>();
        List<Disease> diseases = List.of(polio,cancer,tb,covid19,aids);
//        diseases.add(polio);
//        diseases.add(cancer);
//        diseases.add(covid19);
//        diseases.add(tb);
//        diseases.add(aids);
        aids.setCurable(true);
        getCurable(diseases);

        getNotCurable(diseases);
    }
    static void getCurable(List<Disease> diseases){
        System.out.println("........: Curable Diseases are :........");
        for (Disease a:diseases){
            if (a.isCurable()) {
                System.out.println(a.getName());
            }
        }
    }
    static void getNotCurable(List<Disease> diseases){
        System.out.println("........: NonCurable Diseases are :........");
        for (Disease a:diseases){
            if (!a.isCurable()) {
                System.out.println(a.getName());
            }
        }
    }

}
