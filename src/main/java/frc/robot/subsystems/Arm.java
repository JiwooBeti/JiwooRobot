package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    public SpeedController armcontroller;
    public Potentiometer armpotent;
    public Button armbuttonup;
    public Button armbuttondown = - armbuttonup;
    private double speed;
    
    public void armpotentchecker() {
        if armpotent < 0 {
    armpotent = 0;
    }
    if armpotent > 0 {
        //change the values of < 0 and > 0 to the correct limits
        //I'm not sure what they are as of now. 
        armpotent = 0;
    }
}
    private Joystick stickofjoy;
    private double move(double SpeedOfTheArm) {
        
        SpeedOfTheArm = -SpeedOfTheArm;
        return SpeedOfTheArm;
    }
    private double stop(double SpeedOfTheArm) {
        SpeedOfTheArm = 0;
        return SpeedOfTheArm;
    }
    private boolean isFinished() {

    }
}

