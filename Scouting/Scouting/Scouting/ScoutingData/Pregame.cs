using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Scouting.ScoutingData
{
    public class Pregame
    {

        public int ID { get; set; }
        public int preMatch_TeamNumber { get; set; }
        public int preMatch_MatchNumber { get; set; }

        public String preMatch_Scouter { get; set; }
        public String preMatch_AllianceColor { get; set; }
        public bool preMatch_Preload { get; set; }

        public String preMatch_StartingPosition { get; set; }

    }
}
