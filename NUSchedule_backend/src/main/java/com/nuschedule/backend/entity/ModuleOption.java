package com.nuschedule.backend.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ModuleOption implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Module module;
    
    private boolean isRequired;
    
    private int preference;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Module getModule() {
        return module;
    }
    
    public void setModule(Module module) {
        this.module = module;
    }
    
    public boolean isRequired() {
        return isRequired;
    }
    
    public void setRequired(boolean required) {
        isRequired = required;
    }
    
    public int getPreference() {
        return preference;
    }
    
    public void setPreference(int preference) {
        this.preference = preference;
    }
}
