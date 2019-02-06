using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using Scouting.Models;
using Scouting.ScoutingData;

namespace Scouting.Pages.Pregame
{
    public class EditModel : PageModel
    {
        private readonly Scouting.Models.ScoutingContext _context;

        public EditModel(Scouting.Models.ScoutingContext context)
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

        public async Task<IActionResult> OnPostAsync()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }

            _context.Attach(Pregame).State = EntityState.Modified;

            try
            {
                await _context.SaveChangesAsync();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!PregameExists(Pregame.ID))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return RedirectToPage("./Index");
        }

        private bool PregameExists(int id)
        {
            return _context.Pregame.Any(e => e.ID == id);
        }
    }
}
