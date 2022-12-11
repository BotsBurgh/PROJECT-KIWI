package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor

@TeleOp(name = "Move")
class Wheels: LinearOpMode() {
    //sets the motors to have no value so they do not explode
    var motor1: DcMotor? = null
    var motor2: DcMotor? = null
    var motor3: DcMotor? = null
    var motor4: DcMotor? = null

    override fun runOpMode() {
        //initualizes the motors
        motor1 = hardwareMap.get(DcMotor::class.java, "motor1")
        motor2 = hardwareMap.get(DcMotor::class.java, "motor2")
        motor3 = hardwareMap.get(DcMotor::class.java, "motor3")
        motor4 = hardwareMap.get(DcMotor::class.java, "motor4")

        //this writes on the phone
        //may need more here but i am not sure how to impliment
        telemetry.addData("Status", "Initialized")
        telemetry.update()


        waitForStart()

        while (opModeIsActive()) {
            //this says hey if we move the joystick set it to that power
            //the toDouble sets it as a number so it works
            var right = (-gamepad1.right_stick_x.toDouble())
            var left = (gamepad1.right_stick_y.toDouble())

            this.motor1!!.power = left
            this.motor2!!.power = right
            this.motor3!!.power = left
            this.motor4!!.power = right
        }
    }
}
//this could all be wrong i am really not sure 

