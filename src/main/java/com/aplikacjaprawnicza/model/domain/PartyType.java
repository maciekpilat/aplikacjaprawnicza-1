package com.aplikacjaprawnicza.model.domain;

public enum PartyType {
    POWOD("Powód"),
    POZWANY("Pozwany");

    private String partTypeName;

    private PartyType(String partTypeName) {
        this.partTypeName = partTypeName;
    }

    public String getName() {
        return partTypeName;
    }

    // usage:
    // System.out.println(PartyType.POWOD.getName());
    
    
    // in controller
    //  model.addAttribute ("paperless", Arrays.asList(Paperless .values()));
}
