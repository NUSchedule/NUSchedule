package com.nuschedule.backend.entity;

import java.util.HashSet;

public class Plan {
    private String semester;
    private int maxMC;
    private HashSet<ModuleOption> options;
}
