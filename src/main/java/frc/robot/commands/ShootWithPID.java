package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

import java.util.function.Supplier;

public class ShootWithPID extends CommandBase {

    private PIDController pidController;
    private Shooter shooter;
    private Supplier <Double> P;
    private Supplier <Double> I;
    private Supplier <Double> D;
    private Supplier <Double> tolerance;
    private Supplier <Double> setpoint;

    public ShootWithPID(Supplier<Double> P,Supplier<Double> I, Supplier<Double> D, Shooter shooter, Supplier<Double> tolerance, Supplier<Double> setpoint){
        this.P = P;
        this.I = I;
        this.D = D;
        this.shooter = shooter;
        this.tolerance = tolerance;
        this.setpoint = setpoint;
        addRequirements(shooter);
        this.pidController = new PIDController(P.get(), I.get(), D.get());

    }
    @Override
    public void execute() {
        pidController.setPID(P.get(), I.get(), D.get());
        pidController.setTolerance(tolerance.get());
        shooter.dynamicShoot(pidController.calculate(shooter.getDistance(), setpoint.get()));
    }
    @Override
    public void initialize(){
        shooter.resetEncoder();
    }
    @Override
    public boolean isFinished(){
       return pidController.atSetpoint();
    }
    @Override
    public void end(boolean interrupted){
        shooter.stopShoot();

    }




}
