package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.commands.Grip;
import frc.robot.subsystems.Gripper;

public class OI /*GEVALD*/ {
    static Joystick left = new Joystick(0);
    static Joystick right = new Joystick(1);
    XboxController xboxController = new XboxController(2);

    public static double getLeftX() {return left.getX();}

    public static double getLeftY() {
        return left.getY();
    }

    public static double getRightX() {
        return right.getX();
    }

    public static double getRightY() {
        return right.getY();
    }

    public OI(){
        Button button = new Button(xboxController::getXButton);
        button.whenPressed(new Grip(Robot.gripper));

    }


    }


