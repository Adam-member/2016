package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private double axis;
	private double variable;
	private double axisMotor;
	private double variableMotor;
	private double rightEncRate;
	private double leftEncRate;
	private boolean speedIssue;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void driveCorrection(){
    	axis = Robot.oi.joystick1.getX();
    	variable = axis * -1;
    	rightEncRate = RobotMap.rightEnc.get();
    	leftEncRate = RobotMap.leftEnc.get();
    	
    	if(rightEncRate / leftEncRate != axis / variable){
    		speedIssue = true;
    	}
    	if(speedIssue == true){
    		if(rightEncRate < leftEncRate && axis < 0){
    			RobotMap.rightMotor
    		}
    	}
    	}
    public void circle(){
    	while(RobotMap.lightRightValue == false && RobotMap.lightLeftValue == false && RobotMap.gyroValue < 180){
    		RobotMap.robotDrive.arcadeDrive(0, 1);
    	}
    }
    public void circleCounter(){
    	while(RobotMap.lightRightValue == false && RobotMap.lightLeftValue == false && RobotMap.gyroValue > 180){
    		RobotMap.robotDrive.arcadeDrive(0, -1);
    	}
    }
    public void circle2(){
    	while(RobotMap.seeGoal == false && RobotMap.gyroValue > 180){
    		RobotMap.robotDrive.arcadeDrive(0, 1);
    	}
    	while(RobotMap.seeGoal == false && RobotMap.gyroValue < 180){
    		RobotMap.robotDrive.arcadeDrive(0, -1);
}
    }
    public void defend(){
    	while(RobotMap.laserStartInches - RobotMap .laserEndInches > 5 || RobotMap.laserStartInches - RobotMap.laserEndInches < -5 && RobotMap.gyroValue > 180){
    		RobotMap.robotDrive.arcadeDrive(0, -1);
    	}
    	while(RobotMap.laserStartInches - RobotMap.laserEndInches > 5 || RobotMap.laserStartInches - RobotMap.laserEndInches < -5 && RobotMap.gyroValue < 180){
    		RobotMap.robotDrive.arcadeDrive(0, 1);
    	}
    	while(RobotMap.laserCenter.getVoltage() / 0.00765 > 20){
    		RobotMap.robotDrive.arcadeDrive(1, 0);
    	}
    }// look into the possibility of hybrid code, where top of defend and bottom of defensereality are merged
    
    public void defenseReality(){
    	if(RobotMap.rectangle == true){
    	while(RobotMap.topLaserRightDistance < 20 && RobotMap.topLaserLeftDistance < 20 && RobotMap.gyroValue > 180){
    		RobotMap.robotDrive.arcadeDrive(0, -1);
    	}
    	while(RobotMap.topLaserRightDistance < 20 && RobotMap.topLaserLeftDistance < 20 && RobotMap.gyroValue < 180){
    		RobotMap.robotDrive.arcadeDrive(0, 1);
    	}
    	while(RobotMap.topLaserLeftDistance < 5 && RobotMap.topLaserRightDistance < 5){
    		RobotMap.robotDrive.arcadeDrive(1, 0);
    	}
    	}
    }
}

