package com.retro.engine.gameobjects;

import com.retro.engine.systems.System;
import com.retro.engine.components.Component;
import com.retro.engine.components.PositionComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Entity {

    HashMap<Class, System> systemHashMap = new HashMap<>();
    private Map<Class, Component> componentHashMap = new HashMap<>();

    public void setUp(){
        for(System system : systemHashMap.values())
            system.setUp();
    }

    public void update(){
        for(System system : systemHashMap.values())
            system.update();
    }

    public void dispose(){
        for(System system : systemHashMap.values())
            system.dispose();
    }

    public void addComponent(Component component){
        componentHashMap.put(component.getClass(), component);
    }

    public void removeComponent(Component component){
        componentHashMap.remove(component.getClass());
    }

    public void addSystem(System system){
        systemHashMap.put(system.getClass(), system);
    }

    public void remove(System system){
        systemHashMap.remove(system.getClass());
    }

}
