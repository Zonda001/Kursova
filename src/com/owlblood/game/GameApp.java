package com.owlblood.game;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import static com.almasb.fxgl.dsl.FXGL.*;
import javafx.scene.input.KeyCode;
import com.almasb.fxgl.entity.Entity;

public class GameApp extends GameApplication {
    private Entity player;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Owl's Blood");
        settings.setVersion("0.1");
    }

    @Override
    protected void initGame() {
        getGameWorld().addEntityFactory(new GameFactory());
        player = spawn("player", getAppWidth() / 2, getAppHeight() / 2);
        run(() -> spawn("enemy", Math.random() * getAppWidth(), Math.random() * getAppHeight()), 1.0);
    }

    @Override
    protected void initInput() {
        onKey(KeyCode.W, () -> player.translateY(-5));
        onKey(KeyCode.S, () -> player.translateY(5));
        onKey(KeyCode.A, () -> player.translateX(-5));
        onKey(KeyCode.D, () -> player.translateX(5));
    }
}