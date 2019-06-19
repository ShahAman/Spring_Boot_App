package io.cricinfostarter.Team;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping("/teams")
	public List<Players> getAllTeams()
	{
		return playerService.getAllPlayers();
	}
	
	@RequestMapping("/teams/{id}")
	public Players getPlayer(@PathVariable String id)
	{
		return playerService.getPlayer(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/teams")
	public void addPlayer(@RequestBody Players player)
	{
		playerService.addPlayer(player);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/teams/{id}")
	public void updatePlayer(@RequestBody Players player, @PathVariable String id)
	{
		playerService.updatePlayer(id, player);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/teams/{id}")
	public void deletePlayer(@PathVariable String id)
	{
		playerService.deletePlayer(id);
	}
}
