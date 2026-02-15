package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {
    private DigitalChannel touchSensor;
    private DcMotor motor; //make it more specific
    private  double TicksPerRev;

    public void init(HardwareMap  haMap){
        touchSensor = haMap.get(DigitalChannel.class, "touch_sensor");
       motor = haMap.get(DcMotor.class, "motor");
       motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER); //dual motor setup
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
        TicksPerRev = motor.getMotorType().getTicksPerRev();

    }

    public boolean getTouchSensorState(){
        return  touchSensor.getState();
    }

    public void setMotorSpeed(double speed) {
        // This acepts values from -1.0 to 1.0
        motor.setPower(speed);
    }

    public void getMotorRevs() {
        return motor.getCurrentPosition() / TicksPerRev;   //nORMALIZING TICKS per 1 revolution
    }
}

