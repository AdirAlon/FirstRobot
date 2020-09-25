package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import java.net.PortUnreachableException;

public class Gripper extends SubsystemBase {
    DigitalInput digitalInput;
    SpeedController speedController;

    public Gripper(DigitalInput digitalInput, SpeedController speedController) {
        this.digitalInput = digitalInput;
        this.speedController = speedController;
    }

    public void Grip() {
        speedController.set(0.4);
    }

    public void Release() {
        speedController.set(-0.4);
    }

    public void stopGripper() {
        speedController.stopMotor();
    }

    public boolean ballInside() {
        return digitalInput.get();
    }

}
