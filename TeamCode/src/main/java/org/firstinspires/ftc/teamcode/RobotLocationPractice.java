package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {
    double angle;


    //constructor meathode
    public RobotLocationPractice(double angle){
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
        this.angle = angle
    }
}
