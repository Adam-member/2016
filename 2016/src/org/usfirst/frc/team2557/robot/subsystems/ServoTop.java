package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;



/**
 *
 */
public class ServoTop extends Subsystem {
	private double sweepAngle;
	private double maxSweepAngle;
	private double minSweepAngle;
	private boolean sweepDir;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void topSweep(){
    	minSweepAngle = -2;
    	maxSweepAngle = 2;
    	sweepAngle = RobotMap.servoTop.get();
    	if(sweepAngle == 2){
    		sweepDir = true; 
    	}
    	else if(sweepAngle == -2){
    		sweepDir = false;
    	}
    	if(sweepDir == true){
    		RobotMap.servoTop.set(sweepAngle++);
    	}
    	else{
    		RobotMap.servoTop.set(sweepAngle--);
    	}
    }
}

