package com.nuschedule.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Plan implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "email")
    @JsonBackReference
    private User user;
    
    private String acadYear;
    
    private String semester;
    
    private int maxMC;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ModuleOption> options;
    
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
    
    public String getSemester() {
        return semester;
    }
    
    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public int getMaxMC() {
        return maxMC;
    }
    
    public void setMaxMC(int maxMC) {
        this.maxMC = maxMC;
    }
    
    public Set<ModuleOption> getOptions() {
        return options;
    }
    
    public void setOptions(Set<ModuleOption> options) {
        this.options = options;
    }
}
