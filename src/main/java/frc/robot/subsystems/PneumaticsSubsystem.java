// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class PneumaticsSubsystem extends SubsystemBase {

  public Solenoid solenoid;
  public DigitalInput limitSwitch;
  public Compressor compressor;

  /** Creates a new ExampleSubsystem. */
  public PneumaticsSubsystem() {
    solenoid = new Solenoid(PneumaticsModuleType.REVPH, 0);
    limitSwitch = new DigitalInput(0);
    compressor = new Compressor(0, PneumaticsModuleType.REVPH);
    compressor.enableAnalog(95, 100);
    compressor.enableDigital();
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  // public CommandBase defaultPneumatics() {
  //   // Inline construction of command goes here.
  //   // Subsystem::RunOnce implicitly requires `this` subsystem.
  //   return new InstantCommand(
  //       () -> {
            
  //           if (limitSwitch.get()) {
  //               this.toggle();
  //           }
  //         /* one-time action goes here */
  //       });
  // }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
