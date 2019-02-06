using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using Scouting.ScoutingData;

namespace Scouting.Models
{
    public class ScoutingContext : DbContext
    {
        public ScoutingContext (DbContextOptions<ScoutingContext> options)
            : base(options)
        {
        }

        public DbSet<Scouting.ScoutingData.Pregame> Pregame { get; set; }
    }
}
