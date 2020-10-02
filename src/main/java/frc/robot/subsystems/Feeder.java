package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Feeder extends SubsystemBase {
    SpeedController speedController;

    public Feeder(SpeedController speedController) {
        this.speedController = speedController;
    }
    public void feed(){
        speedController.set(0.5);

    }
    public void stopFeeder() {
        speedController.stopMotor();
    }

}
