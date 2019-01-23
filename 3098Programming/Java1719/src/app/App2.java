import java.util.*;

public class App2 {
     DriveState driveStateFrontLeftDriveMotor;
     DriveState driveStateFrontRightDriveMotor;
     DriveState driveStateRearLeftDriveMotor;
     DriveState driveStateRearRightDriveMotor;

     enum DriveState{forward, stop, reverse}
     enum DriveTrainState{FORWARD, FORWARDRIGHT, FORWARDLEFT, RIGHT, LEFT, STOP, REVERSERIGHT, REVERSE, REVERSELEFT}

     public void printMotorStatus(DriveTrainState driveTrainState)
     {
         System.out.println("Drive Train State is: " + driveTrainState);
         switch(driveStateFrontLeftDriveMotor)
         {
             case forward:
             System.out.println("Front Left Drive Motor: FORWARD");
             break;
             case stop:
             System.out.println("Front Left Drive Motor: STOP");
             break;
             case reverse:
             System.out.println("Front Left Drive Motor: REVERSE");
             break;
         }
     switch(driveStateFrontRightDriveMotor)
         {
             case forward:
             System.out.println("Front Right Drive Motor: FORWARD");
             break;
             case stop:
             System.out.println("Front Right Drive Motor: STOP");
             break;
             case reverse:
             System.out.println("Front Right Drive Motor: REVERSE");
             break;
         }
     switch(driveStateRearLeftDriveMotor)
         {
             case forward:
             System.out.println("Rear Left Drive Motor: FORWARD");
             break;
             case stop:
             System.out.println("Rear Left Drive Motor: STOP");
             break;
             case reverse:
             System.out.println("Rear Left Drive Motor: REVERSE");
             break;
         }
     switch(driveStateRearRightDriveMotor)
         {
             case forward:
             System.out.println("Rear Right Drive Motor: FORWARD");
             break;
             case stop:
             System.out.println("Rear Right Drive Motor: STOP");
             break;
             case reverse:
             System.out.println("Rear Right Drive Motor: REVERSE");
             break;
         }
     }
        public static void main(String[] args) throws Exception {

            App2 obj = new App2();
            obj.updateDriveTrain(DriveTrainState.FORWARD);

        }
  
    private void updateDriveTrain(DriveTrainState driveTrainState) {

        if (driveTrainState == DriveTrainState.FORWARD){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.forward;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.forward;

        }
        
        else if (driveTrainState == DriveTrainState.REVERSE){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.reverse;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.reverse;
        }

        else if (driveTrainState == DriveTrainState.STOP){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.stop;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.stop;
        }

        else if (driveTrainState == DriveTrainState.LEFT){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.reverse;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.forward;
        }
       
        else if (driveTrainState == DriveTrainState.FORWARDLEFT){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.stop;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.forward;
        }

        else if (driveTrainState == DriveTrainState.FORWARDRIGHT){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.forward;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.stop;
        }

        else if (driveTrainState == DriveTrainState.REVERSELEFT){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.reverse;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.stop;
        }

        else if (driveTrainState == DriveTrainState.REVERSERIGHT){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.stop;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.reverse;
        }

    }

}