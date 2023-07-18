package com.example.demoDrools.domain;

public enum CustomerType {
	LOYAL, NEW, DISSATISFIED;
	 
    public String getValue() {
        return this.toString();
    }
}
