package com.nuschedule.backend.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class SemesterData implements Serializable {
    
    private int semester;
    
    private String examDate;
    
    private int examDuration;
    
    @ElementCollection
//    private Map<String, Set<LessonInfo>> allLessons;
    private Set<LessonInfo> allLessons;
    
    public int getSemester() {
        return semester;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public String getExamDate() {
        return examDate;
    }
    
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }
    
    public int getExamDuration() {
        return examDuration;
    }
    
    public void setExamDuration(int examDuration) {
        this.examDuration = examDuration;
    }
    
    public Set<LessonInfo> getAllLessons() {
        return allLessons;
    }
    
    public void setAllLessons(Set<LessonInfo> allLessons) {
        this.allLessons = allLessons;
    }
}
