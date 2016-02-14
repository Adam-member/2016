package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
/*public class GetLocationTrue extends Subsystem {
	public void getLocationTrue(){
		double[] aDistance = RobotMap.aDistance;
		 public double xcelx = RobotMap.accelerometer.getX();
		    public double xcely = RobotMap.accelerometer.getY();
		    public double Y= 0, YdistancePrev= 0, XdistancePrev= 0, X= 0;
		    public double Xvelocity= 0, XvelocityPrev= 0, Yvelocity= 0, YvelocityPrev= 0;
		    public double timePrev= 0, timeCurrent= 0;
		    public double timeDelta;
	   
	    	
	    	  //Set previous values
	        timePrev = timeCurrent;
	        XdistancePrev = X;
	        YdistancePrev = Y;
	        XvelocityPrev = Xvelocity;
	        YvelocityPrev = Yvelocity;
	       
	        //Get current acceleration values
	        //Convert from G-Force to Feet Per Second Squared
	        xcelx = RobotMap.accelerometer.getX() * 32.17404855561;
	        xcely = RobotMap.accelerometer.getY() * 32.17404855561;
	        //Get current time
	        timeCurrent = RobotMap.time.get();
	        timeDelta = timeCurrent - timePrev;
	        
	        //Calculate current velocity
	        Xvelocity = xcelx * timeDelta + XvelocityPrev;
	        Yvelocity = xcely * timeDelta + YvelocityPrev;
	        
	        //Calculate current distance
	        aDistance[0] = Xvelocity * timeDelta + XdistancePrev;
	        aDistance[1] = Yvelocity * timeDelta + YdistancePrev;

	        SmartDashboard.putNumber("The current Y-axis acceleration is ", xcely);
	        SmartDashboard.putNumber("The current X-axis acceleration is " , xcelx);
	        SmartDashboard.putNumber("The current X-axis distance is " , X);
	        SmartDashboard.putNumber("The current Y-axis distance is " , Y);
	        
	        if(RobotMap.left.get() + RobotMap.right.get()  > 160 && RobotMap.left.get() + RobotMap.right.get() < 170 && RobotMap.front.get() > 50){
	        	startX = 180 - RobotMap.back.get();
	        }
	        else if(RobotMap.left.get() + RobotMap.right.get()  > 160 && RobotMap.left.get() + RobotMap.right.get() < 170 && RobotMap.front.get() <= 50){
	        	startX = 180 - RobotMap.front.get();
	        }
	        else if(RobotMap.front.get() + RobotMap.back.get()  > 160 && RobotMap.front.get() + RobotMap.back.get() < 170 && RobotMap.left.get() > 50){
	        	startX = 180 - RobotMap.right.get();
	        }
	        else if(RobotMap.front.get() + RobotMap.back.get()  > 160 && RobotMap.front.get() + RobotMap.back.get() < 170 && RobotMap.left.get() <= 50){
	        	startX = 180 - RobotMap.left.get();
	        	
	        	
	        }
	        if(RobotMap.left.get() + RobotMap.right.get()  < 55 && RobotMap.left.get() + RobotMap.right.get() > 45 && RobotMap.front.get() > 30){
	        	startY = 60 - RobotMap.back.get();
	        }
	        else if(RobotMap.left.get() + RobotMap.right.get()  < 55 && RobotMap.left.get() + RobotMap.right.get() > 45 && RobotMap.front.get() <= 30){
	        	startY = 60 - RobotMap.front.get();
	        }
	        else if(RobotMap.front.get() + RobotMap.back.get()  < 55 && RobotMap.front.get() + RobotMap.back.get() > 45 && RobotMap.left.get() > 30){
	        	startY = 60 - RobotMap.right.get();
	        }
	        else if(RobotMap.front.get() + RobotMap.back.get()  < 55 && RobotMap.front.get() + RobotMap.back.get() > 45 && RobotMap.front.get() <= 30){
	        	startY = 60 - RobotMap.leftEnc.get();
	        }
	        Xlocation = startX + XDistance;
	        startX = Xlocation; 
	
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
*/
