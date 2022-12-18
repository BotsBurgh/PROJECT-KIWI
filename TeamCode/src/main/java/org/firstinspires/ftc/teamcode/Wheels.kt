package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor

@TeleOp(name = "Move")
//@Disabled
class Wheels: LinearOpMode() {

    override fun runOpMode() {
        //initualizes the motors
        val motor1 = hardwareMap.get(DcMotor::class.java, "motor1")
        val motor2 = hardwareMap.get(DcMotor::class.java, "motor2")
        val motor3 = hardwareMap.get(DcMotor::class.java, "motor3")
        val motor4 = hardwareMap.get(DcMotor::class.java, "motor4")

        //this writes on the phone
        //may need more here but i am not sure how to impliment
        telemetry.addData("Status", "Initialized")
        telemetry.update()


        waitForStart()

        while (opModeIsActive()) {
            //might need to just set the motor powers to a number i am not sure
            var pow = gamepad1.right_stick_x

            motor1.power = pow.toDouble()
            motor2.power = pow.toDouble()
            motor3.power = pow.toDouble()
            motor4.power = pow.toDouble()
        }
    }
}

