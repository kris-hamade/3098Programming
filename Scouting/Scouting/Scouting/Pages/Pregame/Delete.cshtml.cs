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
    public class DeleteModel : PageModel
    {
        private readonly Scouting.Models.ScoutingContext _context;

        public DeleteModel(Scouting.Models.ScoutingContext context)
        {
            _context = context;
        }

        [BindProperty]
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

        public async Task<IActionResult> OnPostAsync(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            Pregame = await _context.Pregame.FindAsync(id);

            if (Pregame != null)
            {
                _context.Pregame.Remove(Pregame);
                await _context.SaveChangesAsync();
            }

            return RedirectToPage("./Index");
        }
    }
}
