package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.wpi.first.frc.team5427.util.Config;

public class Arm extends SubsystemBase {
    public SpeedController armcontroller;
    public Potentiometer armpotent;
    public Button armbuttonup;
    public Button armbuttondown;
    private double speed;
    private double TopLimit;
    private double BottomLimit;
    public boolean armpotentchecker(double potentiometervalue) {
        if (potentiometervalue < BottomLimit) {
            return false;
        } else if (potentiometervalue > TopLimit) {
        //change the values of < 0 and > 0 to the correct limits
        //I'm not sure what they are as of now. 
        return false;
        } else {
            return true;
        }
}
    public Joystick stickofjoy;
    public double MoveArm(double armspeed) {
        
        return armspeed;
    }
    private void stop(double armspeed) {
        armspeed = 0;
    }
    private boolean isFinished(double armspeed) {
        if (armspeed == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

