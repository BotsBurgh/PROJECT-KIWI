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

        //motor1.setDirection(DcMotor.Direction.REVERSE)

        //this writes on the phone
        //may need more here but i am not sure how to impliment
        telemetry.addData("Status", "Initialized")
        telemetry.update()


        waitForStart()

        while (opModeIsActive()) {
            //might need to just set the motor powers to a number i am not sure
            var rot = gamepad1.right_stick_x.toDouble()
            var pew = gamepad1.left_stick_y.toDouble()
            var pow = gamepad1.left_stick_x.toDouble()

            motor1.power = -pow - pew + rot
            motor2.power = pow - pew + rot
            motor3.power = pow - pew + rot
            motor4.power = -pow - pew + rot
        }
    }
}

