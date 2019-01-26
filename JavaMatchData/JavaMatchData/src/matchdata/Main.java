package matchdata;

import matchdata.MatchData.AllianceColor;

public class Main {
    public static void main(String[] args) throws Exception {
        MatchData matchdata1 = new MatchData();   
        MatchData matchdata2 = new MatchData();  
        MatchData matchdata3 = new MatchData();
        MatchData matchdata4 = new MatchData();
        AllianceColor redTeam = AllianceColor.RED;
        AllianceColor blueTeam = AllianceColor.BLUE;
        
        
        
        
        
        matchdata1.setTeamNumber(3098);
        matchdata1.setMatchNumber(7);
        matchdata1.setAllianceColor(AllianceColor.RED);
        matchdata1.printMatchData();
        matchdata2.printMatchData();
        matchdata3.printMatchData();
        matchdata4.printMatchData();
    }
}