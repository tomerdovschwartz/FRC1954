// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.concurrent.TimeUnit;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMap;
import frc.robot.subsystems.CollectorBalls;


public class CollectBall extends CommandBase {
  private CollectorBalls m_subsystem;

  /** Creates a new ExampleCommand. */
  public CollectBall(boolean btnPressed) {
    //Initalize the motor
    VictorSPX gSpx = new VictorSPX(RobotMap.COLLECT_MASTER);
    //When the button is pressed it sets the speed to 0.35 otherwise it will set it to 0
    if(btnPressed){
      gSpx.set(ControlMode.PercentOutput, 0.35);
    }else{
      gSpx.set(ControlMode.PercentOutput, 0);
    }
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  public CollectBall(CollectorBalls subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }
}
