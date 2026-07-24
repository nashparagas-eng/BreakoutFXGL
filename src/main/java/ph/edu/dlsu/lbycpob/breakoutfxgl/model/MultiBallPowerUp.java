package com.dlsu.breakout.model;

import com.dlsu.breakout.controller.GameManager;

/**
 * Concrete PowerUp: duplicates the first active ball, giving the
 * player two balls to play with at once.
 */
public class MultiBallPowerUp extends PowerUp {

    public MultiBallPowerUp(double x, double y) {
        super(x, y);
    }

    @Override
    public void applyEffect(GameManager gameManager) {
        gameManager.spawnExtraBall();
    }

    @Override
    public String getLabel() {
        return "MULTI";
    }

    @Override
    public String getColorHex() {
        return "#9b59b6"; // purple
    }
}
