package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TargetDefenses extends Subsystem {
    private double closePoint;
    private double closePoint2;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void targetNearestDefense(){
    	if(closePoint - closePoint2 < 5 && closePoint - closePoint2 > 3){
    		//same as laserTracking here
    	}
    }
}

