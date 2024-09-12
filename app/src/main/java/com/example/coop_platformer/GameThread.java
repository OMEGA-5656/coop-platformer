package com.example.coop_platformer;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class GameThread extends Thread {
    private boolean isRunning;
    private SurfaceHolder surfaceHolder;

    // Constructor to initialize the SurfaceHolder
    public GameThread(SurfaceHolder holder) {
        this.surfaceHolder = holder;
        isRunning = false;  // Thread is not running initially
    }

    // This method contains the main loop for the game
    @Override
    public void run() {
        while (isRunning) {
            if (surfaceHolder.getSurface().isValid()) {
                // You can lock and unlock the canvas here for game drawing logic
                Canvas canvas = surfaceHolder.lockCanvas();
                if (canvas != null) {
                    // Game update and drawing logic goes here
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }

    // Method to check if the thread is running
    public boolean isRunning() {
        return isRunning;
    }

    // Method to set the running state of the thread
    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    // This method is part of the `Thread` class, inherited, so no need to redefine it.
    // public void start() is already available in the `Thread` class
}


