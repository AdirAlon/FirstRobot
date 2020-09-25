package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Gripper;

public class Grip extends CommandBase {
    Gripper gripper;

    public Grip(Gripper gripper) {
        this.gripper = gripper;
    }

    @Override
    public void execute() {
        gripper.Grip();
    }

    @Override
    public boolean isFinished() {
        return gripper.ballInside();
    }

    @Override
    public void end(boolean interruption) {
        gripper.stopGripper();
    }
}
