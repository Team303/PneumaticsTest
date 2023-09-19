package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class DefaultPneumatics extends CommandBase {
    public DefaultPneumatics() {
        addRequirements(Robot.pneumatics);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {

        
        if (Robot.pneumatics.limitSwitch.get()) {
            Robot.pneumatics.solenoid.toggle();
        }
    }

}
