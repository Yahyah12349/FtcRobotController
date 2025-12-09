package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;
        boolean tuurbo = gamepad1.a;

        if (leftY < 0.1 && leftY > -0.1){
            telemetry.addData("Left Stick", "In Dead Zone");
        }
        if ( !tuurbo ) {
            motorSpeed *= 0.5;
        }

        /* boolean aButton = gamepad1.a;
        if (aButton) {
            telemetry.addData("A button", "Pressed");
        }
        else {
            telemetry.addData("A Button","Not Pressed");
        }
        telemetry.addData("A Button state", aButton);
        */
    }
}
/*
And ; && if (leftY < 0.5 && leftY >0)
Or : || if (lefY < 0 || rightY < 0)
Not ! if (!clawClosed)
 */