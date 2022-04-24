package com.retro.engine.gameobjects;

import com.retro.engine.systems.System;
import com.retro.engine.components.Component;
import org.jetbrains.annotations.NotNull;

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

    @SuppressWarnings("unchecked")
    public <T> T getComponent(@NotNull T component){
        return (T) component.getClass().cast(componentHashMap.get(component));
    }

    public void addComponent(Component component){
        componentHashMap.put(component.getClass(), component);
    }

    public void removeComponent(Component component){
        componentHashMap.remove(component.getClass());
    }

    @SuppressWarnings("unchecked")
    public <T> T getSystem(T system) {
        return (T) system.getClass().cast(systemHashMap.get(system.getClass()));
    }

    public void addSystem(System system){
        systemHashMap.put(system.getClass(), system);
    }

    public void removeSystem(System system){
        systemHashMap.remove(system.getClass());
    }

}
