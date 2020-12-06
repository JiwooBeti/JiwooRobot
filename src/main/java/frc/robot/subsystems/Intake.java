package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
//no use for periodic in this subsystem b/c it only occurs when button is pressed
public class Intake extends SubsystemBase
{
    private SpeedController left, right;

    public Intake(SpeedController left, SpeedController right)
    {
        this.left = left;
        this.right = right;
    }
    //we need methods to move this subsystem, and stop subsystem
    //we dont need joystick inputs here exactly

    public void moveIntake(double speed)
    {
        //here we set speeds 
        left.set(speed);
        right.set(-speed);
        //left and right move in opposite directions
    }

    public void stopIntake()
    {
        left.stopMotor();
        right.stopMotor();
        //pretty obvious, it stops the motor
    }

}
    

