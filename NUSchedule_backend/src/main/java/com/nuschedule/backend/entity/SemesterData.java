package com.nuschedule.backend.entity;
import java.util.HashMap;
import java.util.HashSet;

public class SemesterData {
    private int semester;
    private String examDate;
    private int examDuration;
    private HashMap<String, HashSet<LessonInfo>> allLessons;
}
