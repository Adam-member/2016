package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static Servo servoCenter;
	public static Servo servoTop;
	
	public static boolean seeGoal;
	public static double goalDistance;
	public static boolean shouldShoot;
	
	public static Timer time;
	public static double timeValue;
	
	public static double width;
	public static boolean rectangle;
	
	public static double laserStartInches;
	public static double laserEndInches;
	public static double laserInches;
	
	public static Counter rightEnc;
	public static Counter leftEnc;
	
	public static Gyro gyro;
	public static double gyroValue;
	
	public static CANTalon leftMotor;
	public static CANTalon rightMotor;
	
	public static RobotDrive robotDrive;
	
	public static double servoCenterAngle;
	public static double servoCenterOld;
	
	public static AnalogInput laserCenter;
	public static AnalogInput laserLeft;
	public static AnalogInput laserRight;
	public static AnalogInput topLaserLeft;
	public static AnalogInput topLaserRight;
	public static double topLaserLeftDistance;
	public static double topLaserRightDistance;
	public static double laserAngle;
	public static DigitalInput lightLeft;
	public static DigitalInput lightRight;
	public static boolean lightLeftValue;
	public static boolean lightRightValue;
	
	public static double[] RFArray;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
