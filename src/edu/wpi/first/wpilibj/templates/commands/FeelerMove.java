
package edu.wpi.first.wpilibj.templates.commands;
//import edu.wpi.first.wpilibj.templates.subsystems.Feelers;
/**
 *
 * @author bradmiller
 */
public class FeelerMove extends CommandBase {

    public FeelerMove() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(feelers);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(feelers.getState()){
          feelers.extend();
        } else {
            feelers.retract();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
