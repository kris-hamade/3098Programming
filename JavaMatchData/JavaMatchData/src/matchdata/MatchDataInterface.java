package matchdata;

import matchdata.MatchData.AllianceColor;

public interface MatchDataInterface {

    public int getTeamNumber();

    public void setTeamNumber(int TeamNumber);

    public int getMatchNumber();

    public void setMatchNumber(int MatchNumber);

    public AllianceColor getAllianceColor();

    public void setAllianceColor(AllianceColor allianceColor);

    public void printMatchData();

    public void getFieldLeftRocketLeftLevel1Cargo();

    public void setFieldLeftRocketLeftLevel1Cargo(boolean state);

    public void getFieldLeftShipCenterCargo();

    public void setFieldLeftShipCenterCargo(boolean state);

    public void getFieldLeftShipLeft1Cargo();

    public void setFieldLeftShipLeft1Cargo(boolean state);

    public void getFieldLeftShipLeft2Panel();

    public void setFieldLeftShipLeft2Panel(boolean state);

    public int incrementFieldLeftRocketCenterLevel2Cargo();

    public int decrementFieldLeftRocketCenterLevel2Cargo();

    public int getFieldLeftRocketCenterLevel2Cargo();
}