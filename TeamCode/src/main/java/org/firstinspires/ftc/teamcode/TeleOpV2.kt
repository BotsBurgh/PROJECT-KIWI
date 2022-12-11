package org.firstinspires.ftc.teamcode

import com.qualcomm.robotcore.eventloop.opmode.Disabled
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.DcMotor
import com.qualcomm.robotcore.util.ElapsedTime
import com.qualcomm.robotcore.util.Range

class TeleOpV2 {
    @TeleOp(name = "TeleOpV2", group = "TeleOp")
    //@Disabled
    class TeleOpV2 : OpMode() {
        // Declare OpMode members.
        private val runtime = ElapsedTime()
        var motor1: DcMotor? = null
        var motor2: DcMotor? = null
        var motor3: DcMotor? = null
        var motor4: DcMotor? = null

     //Code to run ONCE when the driver hits INIT
        override fun init() {
            telemetry.addData("Status", "Initialized")

            motor1 = hardwareMap.get(DcMotor::class.java, "left_drive")
            motor2 = hardwareMap.get(DcMotor::class.java, "right_drive")
            motor3 = hardwareMap.get(DcMotor::class.java, "left_drive")
            motor4 = hardwareMap.get(DcMotor::class.java, "right_drive")

            //motor1.setDirection(DcMotor.Direction.REVERSE)
            //motor3.setDirection(DcMotor.Direction.REVERSE)
            //this is a guess on what is going to be reversed
            //i am not sure how to do the reversing i am just
            //hoping it is not the unit cricle
        }

     //Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
        override fun init_loop() {
            telemetry.addData("Status", "Initialized")
        }

     //Code to run ONCE when the driver hits PLAY
        override fun start() {
            runtime.reset()
        }

     //Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
        override fun loop() {

            var motor1Power = 0.0
            var motor2Power = 0.0
            var motor3Power = 0.0
            var motor4Power = 0.0

            val drive = -gamepad1.left_stick_y.toDouble()
            val turn = gamepad1.right_stick_x.toDouble()
            motor1Power = Range.clip(drive + turn, -0.5, 0.5)
            motor3Power = Range.clip(drive + turn, -0.5, 0.5)
            motor2Power = Range.clip(drive - turn, -0.5, 0.5)
            motor4Power = Range.clip(drive - turn, -0.5, 0.5)

            // Send calculated power to wheels
            this.motor1!!.power = motor1Power
            this.motor2!!.power = motor2Power
            this.motor3!!.power = motor3Power
            this.motor4!!.power = motor4Power

            // Show the elapsed game time and wheel power.
            telemetry.addData("Status", "Run Time: $runtime")
            telemetry.addData("Motors", "left (%.2f), right (%.2f)", motor1Power, motor2Power, motor3Power, motor4Power)
        }

     //Code to run ONCE after the driver hits STOP
        override fun stop() {
            telemetry.addData("Status ", "stopped")
        }
    }

}