package com.nuschedule.backend.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ElementCollection
    private Set<String> moduleCodes;
    
    private int totalScore;
    
    private int totalMC;
    
    @Embedded
    private Timetable lectureTimetable;
    
    @ElementCollection
    private List<Timetable> otherTimetables;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Set<String> getModuleCodes() {
        return moduleCodes;
    }
    
    public void setModuleCodes(Set<String> moduleCodes) {
        this.moduleCodes = moduleCodes;
    }
    
    public int getTotalScore() {
        return totalScore;
    }
    
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    
    public int getTotalMC() {
        return totalMC;
    }
    
    public void setTotalMC(int totalMC) {
        this.totalMC = totalMC;
    }
    
    public Timetable getLectureTimetable() {
        return lectureTimetable;
    }
    
    public void setLectureTimetable(Timetable lectureTimetable) {
        this.lectureTimetable = lectureTimetable;
    }
    
    public List<Timetable> getOtherTimetables() {
        return otherTimetables;
    }
    
    public void setOtherTimetables(List<Timetable> otherTimetables) {
        this.otherTimetables = otherTimetables;
    }
}
