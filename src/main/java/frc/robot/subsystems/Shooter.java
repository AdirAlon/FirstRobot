package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private SpeedController speedController;
    private Encoder encoder;

    public Shooter(SpeedController speedController, Encoder encoder) {
        this.speedController = speedController;
        this.encoder = encoder;
        encoder.setDistancePerPulse(4096/360.0);
    }

    public void shoot() {
        speedController.set(0.7);
    }
    public void stopShoot(){
        speedController.stopMotor();
    }
    public void dynamicShoot(double speed){speedController.set(speed);}

    public void resetEncoder(){encoder.reset();}
    public double getDistance(){return encoder.getDistance();}

}

