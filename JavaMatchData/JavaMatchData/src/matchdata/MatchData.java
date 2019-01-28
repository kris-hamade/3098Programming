package matchdata;

public class MatchData implements MatchDataInterface {

    int teamNumber;
    int matchNumber;
    AllianceColor teamcolor;
    
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

    public void getFieldLeftRocketLeftLevel1Cargo() {

    }

    public void setFieldLeftRocketLeftLevel1Cargo(boolean state) {

    }

    public void getFieldLeftShipCenterCargo() {

    }

    public void setFieldLeftShipCenterCargo(boolean state) {

    }

    public void getFieldLeftShipLeft1Cargo() {

    }

    public void setFieldLeftShipLeft1Cargo(boolean state) {

    }

    public void getFieldLeftShipLeft2Panel() {

    }
    
    public void setFieldLeftShipLeft2Panel(boolean state) {

    }

    public int incrementFieldLeftRocketCenterLevel2Cargo() {

    }

    public int decrementFieldLeftRocketCenterLevel2Cargo() {

    }

    public int getFieldLeftRocketCenterLevel2Cargo() {
        
    }
}