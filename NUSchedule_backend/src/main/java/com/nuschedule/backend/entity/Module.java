package com.nuschedule.backend.entity;
import java.util.HashSet;
import java.util.HashMap;

public class Module {
    private String acadYear;
    private String preclusion;
    private String description;
    private String title;
    private String department;
    private String faculty;
    private HashSet<Integer> workload;
    private String prerequisite;
    private int moduleCredit;
    private String moduleCode;
    private HashMap<String, Boolean> attributes;
    private HashSet<String> aliases;
    private HashSet<SemesterData> semesterData;
    private HashSet<String> fulfillRequirements;


}
