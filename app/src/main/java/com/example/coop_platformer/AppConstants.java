package com.example.coop_platformer;

import android.content.Context;

public class AppConstants {
    public static int surfaceViewWidth;
    public static int surfaceViewHeight;
    private static GameEngine gameEngine;

    // This method initializes the game engine and other game-specific constants
    public static void initialization(Context context) {
        gameEngine = new GameEngine(context);
    }

    // Getter for the game engine
    public static GameEngine getGameEngine() {
        return gameEngine;
    }
}

