/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Solenoid;
/**
 *
 * @author 16dnong
 */
public class Feelers extends Subsystem{
    Jaguar leftFeeler, rightFeeler;
    Solenoid feelerSolenoid;
    final boolean FEELERS_OUT = true;
    final boolean FEELERS_IN = false;
    
    public Feelers(){
        leftFeeler = new Jaguar(RobotMap.leftFeelerMotor);
        rightFeeler = new Jaguar(RobotMap.rightFeelerMotor);
        feelerSolenoid = new Solenoid(RobotMap.feelerSolenoid);
    }
      public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
      
    public void extend(){
        if(getState() == FEELERS_IN){
           feelerSolenoid.set(FEELERS_OUT);
        } else{
            feelerSolenoid.set(FEELERS_IN);
        }
    }
    public void retract(){
        if(getState() == FEELERS_OUT){
            feelerSolenoid.set(FEELERS_IN);
        }else{
            feelerSolenoid.set(FEELERS_OUT);
        }
    }
    public void intake(){
        leftFeeler.set(1);
        rightFeeler.set(-1);
        
    }
    
    public void outtake(){
        leftFeeler.set(-1);
        rightFeeler.set(1);
    }
     public boolean getState(){
         return feelerSolenoid.get();
         
     } 
     public Solenoid getSolenoid(){
         return feelerSolenoid;
     }
     public Jaguar getLeftFeeler(){
         return leftFeeler;
     }
     public Jaguar getRightFeeleer(){
         return rightFeeler;
     }
}
