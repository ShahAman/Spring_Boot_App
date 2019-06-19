package io.cricinfostarter.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	private List<Players> players = new ArrayList<>(Arrays.asList(
			new Players("1","Aman","Bangaldesh",25,"Batsman"),
			new Players("2","Akib","Bangaldesh",23,"Keeper"),
			new Players("3","Akash","Bangaldesh",21,"Bowler")
			));

	public List<Players> getAllPlayers()
	{
		return players;
	}
	
	public Players getPlayer(String id)
	{
		return players.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}

	public void addPlayer(Players player) {
		players.add(player);
		
	}

	public void updatePlayer(String id, Players player) {
		for(int i=0; i<players.size(); i++)
		{
			Players p = players.get(i);
			if(p.getId().equals(id))
			{
				players.set(i, player);
				return;
			}
		}
		
	}

	public void deletePlayer(String id) {
		players.removeIf(p ->p.getId().equals(id));
	}
}
