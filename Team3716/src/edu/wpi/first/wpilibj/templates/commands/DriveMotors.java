
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author bradmiller
 */
public class DriveMotors extends CommandBase {
    
     Victor leftDriveFront;
     Victor leftDriveBack;
     Victor rightDriveFront;
     Victor rightDriveBack;
    public DriveMotors() {
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        leftDriveFront = new Victor(1);
        leftDriveBack = new Victor(3);
        rightDriveFront = new Victor(2);
        rightDriveBack = new Victor(4);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        leftDriveFront.set(.5);
        leftDriveBack.set(.5);
        rightDriveFront.set(-.5);
        rightDriveFront.set(-.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        leftDriveFront.set(0);
        leftDriveBack.set(0);
        rightDriveFront.set(0);
        rightDriveFront.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
