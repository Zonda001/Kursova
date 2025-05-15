package com.owlblood.game.components;

import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.entity.component.Required;
import com.almasb.fxgl.entity.components.PositionComponent;
import javafx.scene.input.KeyCode;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getInput;

@Required(PositionComponent.class)
public class PlayerComponent extends Component {
    private PositionComponent position;
    private double speed = 150;

    @Override
    public void onUpdate(double tpf) {
        if (getInput().isHeld(KeyCode.A))
            position.translateX(-speed * tpf);
        if (getInput().isHeld(KeyCode.D))
            position.translateX(speed * tpf);
        if (getInput().isHeld(KeyCode.W))
            position.translateY(-speed * tpf);
        if (getInput().isHeld(KeyCode.S))
            position.translateY(speed * tpf);
    }
}