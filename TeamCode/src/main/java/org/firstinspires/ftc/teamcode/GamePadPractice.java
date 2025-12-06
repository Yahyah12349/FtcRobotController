package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {
    @Override
    public void init() {
        //Only once
    }

    @Override
    public void loop() {
        //50 times a seconds
        double speedForward = gamepad1.left_stick_y / 2.0;
        double differenceX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumRearTrigger = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("left x",gamepad1.left_stick_x);
        telemetry.addData("Left y", speedForward);
        telemetry.addData("A button", gamepad1.a);
        telemetry.addData("Right x", gamepad1.right_stick_x);
        telemetry.addData("Right y", gamepad1.right_stick_y);
        telemetry.addData("B", gamepad1.b);
        telemetry.addData("Difference", differenceX);
        telemetry.addData("Sum of triggers", sumRearTrigger);
    }
}
