package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Feeder;
import frc.robot.subsystems.Gripper;

public class Feed extends CommandBase {

     Feeder feeder;
    double timer;


    public Feed(Feeder feeder) {
        this.feeder = feeder;
        this.timer = Timer.getFPGATimestamp();
        addRequirements(feeder);
    }

    @Override
    public void execute() {
        feeder.feed();
    }

    @Override
    public boolean isFinished() {
        return (Timer.getFPGATimestamp()-timer >=500);
    }

    @Override
    public void end(boolean interruption) {
        feeder.stopFeeder();
    }
}


