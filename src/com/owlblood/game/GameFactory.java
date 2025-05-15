package com.owlblood.game;

import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.SpawnData;
import com.almasb.fxgl.entity.EntityFactory;
import com.almasb.fxgl.entity.Spawns;
import static com.almasb.fxgl.dsl.FXGL.entityBuilder;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameFactory implements EntityFactory {

    @Spawns("player")
    public Entity newPlayer(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.PLAYER)
                .viewWithBBox(new Rectangle(30, 30, Color.BLUE))
                .build();
    }

    @Spawns("enemy")
    public Entity newEnemy(SpawnData data) {
        return entityBuilder(data)
                .type(EntityType.ENEMY)
                .viewWithBBox(new Rectangle(20, 20, Color.RED))
                .collidable()
                .build();
    }
}