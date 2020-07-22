package com.company.substitution;

import java.util.ArrayList;
import java.util.List;

public class Substitution {
    public static void main(String[] args) {
        Building b =new Building();
        Office f =new Office();
        House h;
//        build(b);
//        build(f);
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
//        allBuildings(buildings);

        List<Office> office = new ArrayList();
        office.add(new Office());
//        allBuildings(office);

        List<House> house = new ArrayList();
//        house.add(new House());
        addHouse(house);
        addHouse(buildings);
//        allBuildings(house);
        allBuildings(buildings);




    }
    private static void build(Building building){
        System.out.println("........................print it out............................");
        System.out.println(building.toString());
    }
    static void allBuildings(List<? extends Building> buildings){
        System.out.println("....................................................");
        for (Building o:buildings){
            System.out.println("......................"+o.toString()+"..............................");
            System.out.println(o.getClass());
//            System.out.println(o.toString());

        }

    }
    static void addHouse(List<? super House> building){
        building.add(new House());
        System.out.println();
    }
}
