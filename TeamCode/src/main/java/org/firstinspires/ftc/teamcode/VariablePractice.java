package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 22774;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String TeamName = "22774 Ursa Major";
        int motorAngle = 100;

        telemetry.addData("team Number",teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed",clawClosed);
        telemetry.addData("Motor Angle",motorAngle);
    }

    @Override
    public void loop() {
        /*
        1. Change the string name to team name
         */
    }
}
