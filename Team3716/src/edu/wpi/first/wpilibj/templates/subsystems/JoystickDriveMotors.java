
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 */
public class JoystickDriveMotors extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    RobotDrive driveTrain = new RobotDrive(RobotMap.botDriveLeft, RobotMap.topDriveLeft, RobotMap.botDriveRight, RobotMap.topDriveRight);
    Joystick joy1 = new Joystick(1);
        //Sets Up Drive Drain and Joystick
    public  void DriveRobot(){
     driveTrain.tankDrive(OI.processJoystick(joy1.getX()), OI.processJoystick(joy1.getY())); // Drive using the processed values
    }
}

