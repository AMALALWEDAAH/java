package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.Song;
import com.example.demo.services.SongService;


@Controller
public class SongController {
	@Autowired
	SongService songService;
	
	@RequestMapping("/")
    public String index() {
        return "index.jsp";
        }
	
	@RequestMapping("/dashboard")
    public String dashboard(Model model) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
        return "home.jsp";
        }
	@RequestMapping("/songs/new")
    public String newSong(Model model) {
		model.addAttribute("song", new Song());
        return "new.jsp";
        }
	
	@RequestMapping(value="/songs/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
        	 return "new.jsp";
        } else {
        	songService.createSong(song);
            return "redirect:/dashboard";
        }
    }
	
	@GetMapping("/songs/{id}")
    public String show(Model model,@PathVariable("id")Long id) {
       
        Song song=songService.findSong(id);
        model.addAttribute("song", song);
        
        return "show.jsp";
    }
	
	@RequestMapping(value="/{id}/delete",method={RequestMethod.GET, RequestMethod.POST})
    public String delete(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
    	
    }
	
	@PostMapping("/search")
    public String search(@RequestParam("desc") String artist) {
        return "redirect:/search/" + artist;
    }

	 @GetMapping("/search/{artist}")
	 public String getSearch(@PathVariable("artist") String artist, Model model, RedirectAttributes msg) {
	         List<Song> getLookify = songService.search(artist);
	         if(getLookify.size()==0) {
	             msg.addFlashAttribute("error", "Search not found");
	             return "redirect:/dashboard";
	         }else {
	             model.addAttribute("artist", artist);
	             model.addAttribute("result", getLookify);
	             return "home.jsp";
	         }
	 }
	 
	 @RequestMapping("/search/topTen")
	    public String topTen(Model model) {
		 List<Song> songs = songService.allSongs();
	     model.addAttribute("songs", songs);
	        return "search.jsp";
	    }

}
