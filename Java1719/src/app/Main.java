package app;

public class Main {
    static DriveState driveStateFrontLeftDriveMotor;
    static DriveState driveStateFrontRightDriveMotor;
    static DriveState driveStateRearLeftDriveMotor;
    static DriveState driveStateRearRightDriveMotor;
        public static void main(String[] args) {

            

        }
    enum DriveState{forward, stop, reverse}
    enum driveTrainState{FORWARD, FORWARDRIGHT, FORWARDLEFT, RIGHT, LEFT, STOP, REVERSERIGHT, REVERSE, REVERSELEFT}

    private void updateDriveTrain(driveTrainState DriveTrainState) {

        if (driveTrainState == DriveTrainState.FORWARD){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.forward;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.forward;
        }
        
        if (driveTrainState == DriveTrainState.REVERSE){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.reverse;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.reverse;
        }

        if (driveTrainState == DriveTrainState.STOP){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.stop;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.stop;
        }

        if (driveTrainState == DriveTrainState.LEFT){
            driveStateFrontLeftDriveMotor = driveStateRearLeftDriveMotor = DriveState.reverse;
            driveStateFrontRightDriveMotor = driveStateRearRightDriveMotor = DriveState.forward;
        }

    }
}