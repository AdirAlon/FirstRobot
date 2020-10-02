package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Gripper;

public class Grip extends CommandBase {
    Gripper gripper;
    double timer;


    public Grip(Gripper gripper) {
        this.gripper = gripper;
        this.timer = Timer.getFPGATimestamp();
        addRequirements(gripper);
    }

    @Override
    public void execute() {
        gripper.Grip();
    }

    @Override
    public boolean isFinished() {
        return (Timer.getFPGATimestamp()-timer >=500);
    }

    @Override
    public void end(boolean interruption) {
        gripper.stopGripper();
    }
}
