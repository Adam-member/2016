package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LaserTracking extends Subsystem {
    private double noHitAngle;
    private boolean notDone;
    private double maxSweepAngle;
    private boolean inRange;
    private double sweepAngle;
    private double minSweepAngle;
    private double inchesFront;
    private double hitInches;
    private double hitAngle;
    private double laserStartInches;
    private double laserStartAngle;
    private double laserEndInches;
    private double firstLength;
    private double secondLength;
    private double firstWidth;
    private double secondWidth;
    private double lowPointInches;
    private double lowPointAngle;
    private double length;
    private double width;
    private double laserEndAngle;
    private double laserInches;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void adjustForDefense(){
    	minSweepAngle = -22;
    	maxSweepAngle = 22;
    	notDone = false;
    	
    	RobotMap.servoCenterAngle = minSweepAngle;
    	
    	RobotMap.servoCenterAngle = RobotMap.servoCenter.get() + 1;
    	
    	if(RobotMap.laserInches < 20){
    		notDone = true;
    		laserStartInches = RobotMap.laserInches;
    		laserStartAngle = RobotMap.laserAngle;
    		
    	}

		firstLength = Math.pow(Math.cos((laserStartAngle-90) / hitInches) - Math.cos((lowPointAngle-90) / lowPointInches), 2);
		secondLength = Math.pow(Math.sin((hitAngle-90) / hitInches) - Math.sin((lowPointAngle-90) / lowPointInches), 2);
		length = Math.sqrt(firstLength + secondLength);
		firstWidth = Math.pow(Math.cos((lowPointAngle-90) / lowPointInches) - Math.cos((noHitAngle-90) / laserEndInches), 2);
		secondWidth = Math.pow(Math.sin((lowPointAngle-90) / lowPointInches) - Math.sin((noHitAngle-90) / laserEndInches), 2);
		width = Math.sqrt(firstWidth + secondWidth);
		
		if(width > 19 && width < 22){
			RobotMap.rectangle = true;
		}
     
		if(notDone == true && RobotMap.laserInches > 40){
			laserEndInches = RobotMap.laserInches;
			laserEndAngle = RobotMap.laserAngle;
		}
		RobotMap.width = width;
		RobotMap.laserEndInches = laserEndInches;
		RobotMap.laserStartInches = laserStartInches;
		
    }  	

}

