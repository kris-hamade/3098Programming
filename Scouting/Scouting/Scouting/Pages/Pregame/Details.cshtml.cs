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
    public class DetailsModel : PageModel
    {
        private readonly Scouting.Models.ScoutingContext _context;

        public DetailsModel(Scouting.Models.ScoutingContext context)
        {
            _context = context;
        }

        public Pregame Pregame { get; set; }

        public async Task<IActionResult> OnGetAsync(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            Pregame = await _context.Pregame.FirstOrDefaultAsync(m => m.ID == id);

            if (Pregame == null)
            {
                return NotFound();
            }
            return Page();
        }
    }
}
