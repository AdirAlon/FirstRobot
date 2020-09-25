package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;
import frc.robot.commands.TankDrive;

public class Drivetrain extends SubsystemBase {

    private SpeedController left;

    private SpeedController right;

    public Drivetrain(SpeedController left, SpeedController right) {
        this.left = left;
        this.right = right;

    }
    public void stop(){
        left.stopMotor();
        right.stopMotor();
    }
    public void tankDrive(double leftSpeed, double rightSpeed){
        left.set(leftSpeed);
        right.set(rightSpeed);

    }

    @Override
    public Command getDefaultCommand() {
        return new TankDrive(this, OI::getLeftY, OI::getRightY);

    }
}
