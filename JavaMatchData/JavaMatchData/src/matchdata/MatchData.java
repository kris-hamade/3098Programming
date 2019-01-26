package matchdata;

public class MatchData implements MatchDataInterface {

    int teamNumber;
    int matchNumber;
    AllianceColor teamcolor;
    boolean FieldLeftRocketLeftLevel1Cargo;
    boolean FieldLeftShipCenterCargo;
    boolean FieldLeftShipLeft1Cargo;
    boolean FieldLeftShipLeft2Panel;
    int FieldLeftRocketCenterLevel2Cargo;
    
    public enum AllianceColor{RED, BLUE};

    public int getTeamNumber() {
        return this.teamNumber;
    }

    public void setTeamNumber(int TeamNumber) {
        this.teamNumber = TeamNumber;
    }

    public int getMatchNumber() {
        return this.matchNumber;
    }

    public void setMatchNumber(int MatchNumber) {
        this.matchNumber = MatchNumber;
    }

    public AllianceColor getAllianceColor() {
        return this.teamcolor;
    }

    public void setAllianceColor(AllianceColor allianceColor) {
        this.teamcolor = allianceColor;
    }

    public void printMatchData() {
        System.out.println("TeamNumber: " + this.getTeamNumber() + ", MatchNumber: " + this.getMatchNumber() + ", AllianceColor: " + this.getAllianceColor());
    }

    public boolean getFieldLeftRocketLeftLevel1Cargo() {
        return this.FieldLeftRocketLeftLevel1Cargo;
    }

    public void setFieldLeftRocketLeftLevel1Cargo(boolean state) {
        this.FieldLeftRocketLeftLevel1Cargo = state;
    }

    public boolean getFieldLeftShipCenterCargo() {
        return this.FieldLeftShipCenterCargo;
    }

    public void setFieldLeftShipCenterCargo(boolean state) {
        this.FieldLeftShipCenterCargo = state;
    }

    public boolean getFieldLeftShipLeft1Cargo() {
        return this.FieldLeftShipLeft1Cargo;
    }

    public void setFieldLeftShipLeft1Cargo(boolean state) {
        this.FieldLeftShipLeft1Cargo = state;
    }

    public boolean getFieldLeftShipLeft2Panel() {
        return this.FieldLeftShipLeft2Panel;
    }
    
    public void setFieldLeftShipLeft2Panel(boolean state) {
        this.FieldLeftShipLeft2Panel = state;
    }

    public int incrementFieldLeftRocketCenterLevel2Cargo() {

    }

    public int decrementFieldLeftRocketCenterLevel2Cargo() {

    }

    public int getFieldLeftRocketCenterLevel2Cargo() {
        
    }
}