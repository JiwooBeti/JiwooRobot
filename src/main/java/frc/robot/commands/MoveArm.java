package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;
import frc.robot.RobotContainer;
import frc.robot.Robot;
public class MoveArm extends CommandBase {
    public double speed;
    public void execute() 
    {
        Robot.arm.moveArm(speed);
    }
    public void end()
    {
        Robot.arm.stop();
    }
}
