package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Hatch;
public class MoveHatch extends CommandBase {
 public void buttonbind(boolean ifPressed) {
     public Hatch hatch;

     public void Hatchmove() {
         hatch.Hatchmove();
     }
    }
     public boolean isFinished() {
         return true;
     }
 }   

