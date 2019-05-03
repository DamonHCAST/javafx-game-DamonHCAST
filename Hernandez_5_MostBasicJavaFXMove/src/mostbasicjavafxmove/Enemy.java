/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostbasicjavafxmove;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

/**
 *
 * @author damonh1000
 */
public class Enemy extends Rectangle {

    int health;
    double speed = 0.05;

    public Enemy(double x, double y) {
        super(x, y, 25, 25);
        this.setFill(Color.BLUE);
        this.health = 20;
    }

    void moveUp() {
        if (this.getY() > 0) {
            this.setY(this.getY() - speed);
        }
    }

    void moveDown() {
        if (this.getY() < (600 - 15) - 20) {
            this.setY(this.getY() + speed);
        }
    }

    void moveRight() {
        if (this.getX() < (600 - 15) - 20) {
            this.setX(this.getX() + speed);
        }
    }

    void moveLeft() {
        if (this.getX() > 0) {
            this.setX(this.getX() - speed);
        }
    }
}
