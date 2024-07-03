package com.example.coffer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataTable {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
    private int endYear;
    private int intensity;
    private String sector;
    private String topic;
    private String swot;
    private String region;
    private int startYear;
    private String city;
    private String country;
    private int relevance;
    private String pestle;
    private String source;
    private int likelihood;


    public DataTable(){

    }

    public DataTable(int endYear,int intensity,String sector,String topic,String swot,String region,int startYear,String city,
    String country,int relevance,String pestle,String source,int likelihood){
    	super();
        this.endYear=endYear;
        this.intensity=intensity;
        this.sector=sector;
        this.topic=topic;
        this.swot=swot;
        this.region=region;
        this.startYear=startYear;
        this.city=city;
        this.country=country;
        this.relevance=relevance;
        this.pestle=pestle;
        this.source=source;
        this.likelihood=likelihood;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSwot() {
        return swot;
    }

    public void setSwot(String swot) {
        this.swot = swot;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public String getPestle() {
        return pestle;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }

    
    
}
