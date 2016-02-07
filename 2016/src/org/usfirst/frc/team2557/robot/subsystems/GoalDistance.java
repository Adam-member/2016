


















package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GoalDistance extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void goalDistance(){
    	if(RobotMap.seeGoal == true){
    		RobotMap.goalDistance = RobotMap.laserLeft.getVoltage() /0.00765;
    	}
    	while(RobotMap.goalDistance < 40 && RobotMap.goalDistance > 30){
    		RobotMap.shouldShoot = true;
    	}
    	while(RobotMap.goalDistance > 40 || RobotMap.goalDistance < 30){
    		RobotMap.shouldShoot = false;
    	}
    	if(RobotMap.shouldShoot == true){
    		System.out.println("inRange");
    	}
    	else if(RobotMap.shouldShoot == false){
    		System.out.println("out of range");     
    	}
    }
}

