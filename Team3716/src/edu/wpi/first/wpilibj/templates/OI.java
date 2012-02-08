
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;

public class OI {
    // Process operator interface input here.
    public static double processJoystick(double joy1){
        if(((joy1 < 0.10) && (joy1 > 0)) ||((joy1 > -0.10) && (joy1 < 0))){ //Check for dead zones
            return 0; //Deadzone found so set power to 0
        }
        else{
            return joy1; // No dead zone proceded normally
        }

    }
    
}

