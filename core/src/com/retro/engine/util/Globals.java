package com.retro.engine.util;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;

public class Globals {

    // Alter the string literal change application title
    public static String gameTitle = "Game Title Here";

    // Screen Resolution:
    // Change these values for different resolutions
    public static int screenWidth = 800;
    public static int screenHeight = 480;

    // Box2D Variables for later use
    // Do not touch unless you want different variable names
    public static World world;
    public static BodyDef bodyDef;
    public static FixtureDef fixtureDef;

}
