package com.nuschedule.backend.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Module implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String acadYear;
    
    private String preclusion;
    
    private String description;
    
    private String title;
    
    private String department;
    
    private String faculty;
    
    @ElementCollection
    private Set<Integer> workload;
    
    private String prerequisite;
    
    private int moduleCredit;
    
    private String moduleCode;
    
    @ElementCollection
    private Map<String, Boolean> attributes;
    
    @ElementCollection
    private Set<String> aliases;
    
    @ElementCollection
    private Set<SemesterData> semesterData;
    
    @ElementCollection
    private Set<String> fulfillRequirements;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getAcadYear() {
        return acadYear;
    }
    
    public void setAcadYear(String acadYear) {
        this.acadYear = acadYear;
    }
    
    public String getPreclusion() {
        return preclusion;
    }
    
    public void setPreclusion(String preclusion) {
        this.preclusion = preclusion;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getFaculty() {
        return faculty;
    }
    
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    public Set<Integer> getWorkload() {
        return workload;
    }
    
    public void setWorkload(Set<Integer> workload) {
        this.workload = workload;
    }
    
    public String getPrerequisite() {
        return prerequisite;
    }
    
    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
    
    public int getModuleCredit() {
        return moduleCredit;
    }
    
    public void setModuleCredit(int moduleCredit) {
        this.moduleCredit = moduleCredit;
    }
    
    public String getModuleCode() {
        return moduleCode;
    }
    
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }
    
    public Map<String, Boolean> getAttributes() {
        return attributes;
    }
    
    public void setAttributes(Map<String, Boolean> attributes) {
        this.attributes = attributes;
    }
    
    public Set<String> getAliases() {
        return aliases;
    }
    
    public void setAliases(Set<String> aliases) {
        this.aliases = aliases;
    }
    
    public Set<SemesterData> getSemesterData() {
        return semesterData;
    }
    
    public void setSemesterData(Set<SemesterData> semesterData) {
        this.semesterData = semesterData;
    }
    
    public Set<String> getFulfillRequirements() {
        return fulfillRequirements;
    }
    
    public void setFulfillRequirements(Set<String> fulfillRequirements) {
        this.fulfillRequirements = fulfillRequirements;
    }
}
