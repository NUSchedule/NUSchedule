package com.nuschedule.backend.entity;


import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;

@Embeddable
public class Timetable {
    
    @ElementCollection
    private Set<LessonInfo> timetable;
    
    public Set<LessonInfo> getTimetable() {
        return timetable;
    }
    
    public void setTimetable(Set<LessonInfo> timetable) {
        this.timetable = timetable;
    }
}
