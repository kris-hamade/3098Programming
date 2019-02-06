using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.EntityFrameworkCore;
using Scouting.Models;
using Scouting.ScoutingData;

namespace Scouting.Pages.Pregame
{
    public class IndexModel : PageModel
    {
        private readonly Scouting.Models.ScoutingContext _context;

        public IndexModel(Scouting.Models.ScoutingContext context)
        {
            _context = context;
        }

      /*  public IList<Pregame> Pregame { get;set; }

        public async Task OnGetAsync()
        {
            return Pregame = await _context.Pregame.ToListAsync();
        }
    }*/
}
