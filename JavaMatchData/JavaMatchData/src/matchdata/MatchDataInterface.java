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

    public boolean getFieldLeftRocketLeftLevel1Cargo();

    public void setFieldLeftRocketLeftLevel1Cargo(boolean state);

    public boolean getFieldLeftShipCenterCargo();

    public void setFieldLeftShipCenterCargo(boolean state);

    public boolean getFieldLeftShipLeft1Cargo();

    public void setFieldLeftShipLeft1Cargo(boolean state);

    public boolean getFieldLeftShipLeft2Panel();

    public void setFieldLeftShipLeft2Panel(boolean state);

    public int incrementFieldLeftRocketCenterLevel2Cargo(boolean state);

    public int decrementFieldLeftRocketCenterLevel2Cargo(boolean state);

    public int getFieldLeftRocketCenterLevel2Cargo();
}