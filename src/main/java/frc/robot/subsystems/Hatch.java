package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Hatch extends SubsystemBase 
{
    public static boolean boo = true;
    public Solenoid solenoid = new Solenoid(Constants.HATCH_PCM);
    public Hatch(boolean boo, Solenoid solenoid)
    {
        this.boo = boo;
        this.solenoid = solenoid;
        //one joystick button sets the solenoid to true (boolean boo = true)
    }
    public void whereWillItFace() {
        solenoid.set(boo);
    }
}
