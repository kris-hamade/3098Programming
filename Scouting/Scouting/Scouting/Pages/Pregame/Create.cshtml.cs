using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.AspNetCore.Mvc.Rendering;
using Scouting.Models;
using Scouting.ScoutingData;

namespace Scouting.Pages.Pregame
{
    public class CreateModel : PageModel
    {
        private readonly Scouting.Models.ScoutingContext _context;

        public CreateModel(Scouting.Models.ScoutingContext context)
        {
            _context = context;
        }

        public IActionResult OnGet()
        {
            return Page();
        }

        [BindProperty]
        public Pregame Pregame { get; set; }

        public async Task<IActionResult> OnPostAsync()
        {
            if (!ModelState.IsValid)
            {
                return Page();
            }

            _context.Pregame.Add(Pregame);
            await _context.SaveChangesAsync();

            return RedirectToPage("./Index");
        }
    }
}