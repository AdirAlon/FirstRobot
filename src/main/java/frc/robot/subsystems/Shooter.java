package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    SpeedController speedController;

    public void shoot(SpeedController speedController) {
        this.speedController = speedController;
    }

    public void shoot() {
        speedController.set(0.7);
    }
    public void stopShoot(){
        speedController.stopMotor();
    }

}
