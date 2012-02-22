package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.Joystick;
/**
 *
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    RobotDrive drive;
    OI op;
    Joystick joy;

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());

    }

    public Chassis() {
        drive = new RobotDrive(1, 3, 2, 4);
        drive.setSafetyEnabled(true);
        joy = new Joystick(1);
    }

    public void goForward() {
        drive.arcadeDrive(1.0, 0);
    }
    public void goBack() {
        drive.arcadeDrive(-1.0, 0);
    }

    public void goLeft() {    // sets the motor speeds to start a left turn
        drive.arcadeDrive(0.0, 1.0);
    }
    
    
    public void goRight() {    // sets the motor speeds to start a left turn
        drive.arcadeDrive(0.0, -1.0);
    }
    
    public void goJoystick() {
        drive.arcadeDrive(joy);;
    }
    
}
