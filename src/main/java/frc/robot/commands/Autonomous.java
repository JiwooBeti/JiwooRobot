package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import frc.robot.RobotContainer;
import frc.robot.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj2.command.CommandGroupBase;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import java.util.Timer;
import java.util.TimerTask;


public class Autonomous extends CommandBase{


    public void autonomousInit() {
        
    }

 

    public void Timer() {

    }

    @Override
    public void execute() {
       
        RobotContainer.getDriveTrain().takeJoystickInputs(RobotContainer.getJoy());

    }

    public void autonomousPeriodic() {

    }
}
