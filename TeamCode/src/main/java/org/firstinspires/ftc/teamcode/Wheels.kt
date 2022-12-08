package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor

@TeleOp(name = "Move")

class Wheels: OpMode() {

    var motor1: DcMotor? = null
    var motor2: DcMotor? = null
    var motor3: DcMotor? = null
    var motor4: DcMotor? = null

    override fun init() {

        motor1 = hardwareMap.get(DcMotor::class.java, "motor1")
        motor2 = hardwareMap.get(DcMotor::class.java, "motor2")
        motor3 = hardwareMap.get(DcMotor::class.java, "motor3")
        motor4 = hardwareMap.get(DcMotor::class.java, "motor4")

    }

    override fun loop() {
        telemetry.addData("Status", "Initialized")
        telemetry.update()

        var right = (-gamepad1.right_stick_x.toDouble())
        var left = (gamepad1.right_stick_y.toDouble())

        this.motor1!!.power = left
        this.motor2!!.power = right
        this.motor3!!.power = left
        this.motor4!!.power = right
    }
}


