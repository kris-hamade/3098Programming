package matchdata;

public class MatchData implements MatchDataInterface{
    int teamNumber;
    int matchNumber;
    AllianceColor teamcolor;

    public enum AllianceColor{RED, BLUE};

    public int getTeamNumber()
    {
        return this.teamNumber;
    }

    public void setTeamNumber(int teamNumber)
    {
        this.teamNumber = teamNumber;
    }
    
    public int getMatchNumber()
    {
        return this.matchNumber;
    }

    public void setMatchNumber(int MatchNumber)
    {
        this.matchNumber = MatchNumber;
    }

    public AllianceColor getAllianceColor()
    {
        return this.teamcolor;
    }

    public void setAllianceColor(AllianceColor allianceColor)
    {
        this.teamcolor = allianceColor;
    }

    public void printMatchData()
    {
        System.out.println("Team Number is: " + this.getTeamNumber());
        System.out.println("Match Number is: " + this.getMatchNumber());
        System.out.println("Alliance Color is: " + this.getAllianceColor());
    }
}