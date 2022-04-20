package com.retro.engine;

public class Engine {

    // There should only
    private static Engine engine = new Engine();

    public static Engine getInstance(){
        return engine;
    }

    public void setUp(){
        // Place objects, sprites, batches, and etc.
    }

    public void run(float dt){
        update(dt);
        render(dt);
    }

    private void update(float dt){
        // Place Logical-related code here
    }

    private void render(float dt){
        // Place Artistic/Sprite related code here
    }

    public void dispose(){
        // Place Items that placed in setup along with your
        // assets, stages, etc.
        // Read up on LibGDX dispose interface
    }

}
