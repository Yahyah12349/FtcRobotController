package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;
    double x;

    double y;

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void changeY(double changeAmountY){
        y += changeAmountY;
    }
    public void changeX(double changeAmount){
        x += changeAmount;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    //constructor method
    public RobotLocationPractice(double angle) {

        this.angle = angle;
    }


    public double getHeading(){
        // this methode normalizes robot heading between -180 and 180
        // this is useful for calculating turning angles, especially when crossing the 0, 360 bounray


        double angle = this.angle;
        while (angle > 180){
            angle -= 360;

        }
        while (angle <= -180){
            angle += 360;
        }
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }


    public double getAngle() {
        return this.angle;
    }
}
