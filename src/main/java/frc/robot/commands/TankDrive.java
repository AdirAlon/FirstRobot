package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

import java.util.function.Supplier;

public class TankDrive extends CommandBase {

    private Drivetrain drivetrain;

    private Supplier<Double> leftSpeed;

    private Supplier<Double> rightSpeed;

    public TankDrive(Drivetrain drivetrain, Supplier<Double> leftSpeed, Supplier<Double> rightSpeed) {
        this.drivetrain = drivetrain;
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;

        
    }
    @Override
    public void initialize(){

    }
    @Override
    public void execute(){
        drivetrain.tankDrive(leftSpeed.get(), rightSpeed.get());
    }
    @Override
    public void end(boolean interrupted){
        drivetrain.stop();
    }
}
