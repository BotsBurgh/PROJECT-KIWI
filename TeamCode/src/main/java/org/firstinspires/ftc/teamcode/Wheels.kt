package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor
import org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap

class Wheels {

    private var motor1: DcMotor? = null
    private var motor2: DcMotor? = null
    private var motor3: DcMotor? = null
    private var motor4: DcMotor? = null

    fun runOpMode() {

        motor1 = hardwareMap.get<DcMotor>(DcMotor::class.java, "motor1")
        motor2 = hardwareMap.get<DcMotor>(DcMotor::class.java, "motor2")
        motor3 = hardwareMap.get<DcMotor>(DcMotor::class.java, "motor3")
        motor4 = hardwareMap.get<DcMotor>(DcMotor::class.java, "motor4")

        

    }

}