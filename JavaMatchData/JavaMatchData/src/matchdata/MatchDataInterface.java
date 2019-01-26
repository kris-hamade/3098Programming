package matchdata;

import matchdata.MatchData.AllianceColor;


public interface MatchDataInterface {

    public int getTeamNumber();

    public void setTeamNumber(int TeamNumber);

    public int getMatchNumber();

    public void setMatchNumber(int MatchNumber);

    public AllianceColor getAllianceColor();

    public void setAllianceColor(AllianceColor alliancecolor);

}