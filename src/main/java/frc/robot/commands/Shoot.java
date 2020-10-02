package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Gripper;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {

    Shooter shooter;
    double timer;


    public Shoot(Shooter shooter) {
        this.shooter = shooter;
        this.timer = Timer.getFPGATimestamp();
        addRequirements(shooter);
    }

    @Override
    public void execute() {
        shooter.shoot();
    }

    @Override
    public boolean isFinished() {
        return (Timer.getFPGATimestamp()-timer >=500);
    }

    @Override
    public void end(boolean interruption) {
        shooter.stopShoot();
    }
}


