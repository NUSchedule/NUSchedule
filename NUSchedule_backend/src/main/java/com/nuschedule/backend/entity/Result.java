package com.nuschedule.backend.entity;

import com.nuschedule.backend.entity.LessonInfo;

import java.util.ArrayList;
import java.util.HashSet;

public class Result {
    private HashSet<String> moduleCodes;
    private int totalScore;
    private int totalMC;
    private HashSet<LessonInfo> lectureTimetable;
    private ArrayList<HashSet<LessonInfo>> otherTimetables;

}
