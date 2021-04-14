package com.nuschedule.backend.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class LessonInfo implements Serializable {
    
    private String classNo;
    
    private String startTime;
    
    private String endTime;
    
    @ElementCollection
    private Set<Integer> weeks;
    
    private String venue;
    
    private String day;
    
    private String lessonType;
    
    private String size;
    
    private String moduleCode;
    
    public String getClassNo() {
        return classNo;
    }
    
    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }
    
    public String getStartTime() {
        return startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    public String getEndTime() {
        return endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    public Set<Integer> getWeeks() {
        return weeks;
    }
    
    public void setWeeks(Set<Integer> weeks) {
        this.weeks = weeks;
    }
    
    public String getVenue() {
        return venue;
    }
    
    public void setVenue(String venue) {
        this.venue = venue;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public String getLessonType() {
        return lessonType;
    }
    
    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }
    
    public String getModuleCode() {
        return moduleCode;
    }
    
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
}
