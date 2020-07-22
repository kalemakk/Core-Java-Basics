package com.company.babe.diseases;


public class Disease {
    private String name;
    private boolean isCurable;
    Disease(String name,boolean isCurable){
        this.name =name;
        this.isCurable =isCurable;
    }

    public String getName() {
        return name;
    }

    public boolean isCurable() {
        return isCurable;
    }

    public void setCurable(boolean curable) {
        isCurable = curable;
    }
}
