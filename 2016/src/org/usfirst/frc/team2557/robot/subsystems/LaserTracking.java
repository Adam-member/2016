
package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.lang.Math;

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
    private double laserStartInchesPrev;
    private double laserStartAnglePrev;
    private boolean firstTime;
    private boolean corner;
    private double side1;
    private double side2;
    private int x;
    
    
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
    	firstTime = true;
    	
    	RobotMap.servoCenterAngle = minSweepAngle;
    	
    	RobotMap.servoCenterAngle = RobotMap.servoCenter.get() + 1;
    	
    	if(RobotMap.laserInches < 20){
    		notDone = true;
    		laserStartInches = RobotMap.laserInches;
    		laserStartAngle = RobotMap.laserAngle;
    		
    	}
    	x = (int) RobotMap.servoCenterAngle; 
    	if(notDone == true && RobotMap.RFArray[x] < RobotMap.RFArray[x-1]){
    		lowPointInches = RobotMap.laserInches;
    		lowPointAngle = RobotMap.servoCenterAngle;
    		
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
		if(RobotMap.rectangle == true && notDone == true){
			RobotMap.driveAdjust = true;
		}
     
		if(notDone == true && RobotMap.laserInches > 40){
			laserEndInches = RobotMap.laserInches;
			laserEndAngle = RobotMap.laserAngle;
		}
		RobotMap.width = width;
		RobotMap.laserEndInches = laserEndInches;
		RobotMap.laserStartInches = laserStartInches;
		
		//double myPower = 2;
		//firstLength = Math.cos(laserStartAngle) * laserStartInches;
		//Math.pow(secondLength, myPower);
		/*= firstLength ** 2 + laserStartInches ** 2; 
		side1 ** 2 = firstLength ** 2 + secondLength ** 2;
		firstLength = firstLength ** 2 + laserStartInches ** 2; 
		secondLength = Math.cos(laserStartAngle) * laserStartInches;
		side2 ** 2 = firstLength ** 2 + secondLength ** 2;
		*/
		if(side1 > side2){
			width = side2;
			length = side1;
		}
		else if(side1 < side2){
			width = side1;
			length = side2;
		}
		else{
			width = side1;
			length = side2;
		}
		SmartDashboard.putNumber("width", width);
		SmartDashboard.putNumber("length", length);
		SmartDashboard.putNumber("laserStartInches", laserStartInches);
		SmartDashboard.putNumber("laserEndInches", laserEndInches);
		SmartDashboard.putNumber("RFValue", RobotMap.RFArray[5]);
		SmartDashboard.putNumber("lowPointInches", lowPointInches);
    } 	

}

