package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class DriveWithJoystick extends CommandBase 
{
    @Override
    public void initialize() 
    {
        //initialize runs once
        RobotContainer.getDriveTrain().takeJoystickInputs(RobotContainer.getJoy());
    }

    @Override
    public void execute() 
    {
        // i think execute runs every 20 miliseconds  
        RobotContainer.getDriveTrain().takeJoystickInputs(RobotContainer.getJoy());
    }

    @Override
    public boolean isFinished() 
    {
        return false;
    }

    @Override
    public void end(boolean interrupted) 
    {
        RobotContainer.getDriveTrain().stop();
    }
}