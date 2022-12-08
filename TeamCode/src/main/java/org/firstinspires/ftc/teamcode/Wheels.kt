package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor
import org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap

@TeleOp(name = "Move")

class Wheels {

    private var motor1: DcMotor? = null
    private var motor2: DcMotor? = null
    private var motor3: DcMotor? = null
    private var motor4: DcMotor? = null

    fun init() {

        motor1 = hardwareMap.get(DcMotor::class.java, "motor1")
        motor2 = hardwareMap.get(DcMotor::class.java, "motor2")
        motor3 = hardwareMap.get(DcMotor::class.java, "motor3")
        motor4 = hardwareMap.get(DcMotor::class.java, "motor4")

    }



    fun power() {

        this.motor1!!.power = 0.5
        this.motor2!!.power = 0.5
        this.motor3!!.power = 0.5
        this.motor4!!.power = 0.5

    }
    fun stop(){

        this.motor1!!.power = 0.0
        this.motor2!!.power = 0.0
        this.motor3!!.power = 0.0
        this.motor4!!.power = 0.0
    }



}