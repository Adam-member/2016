package org.usfirst.frc.team2557.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 *
 */
public class VisualNetwork extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void shootGoal(){
    	NetworkTable table;
    	
    	table = NetworkTable.getTable("GRIP/Untitled");
    }
}

