package gg.callisto.bedwars.teams;

import gg.callisto.bedwars.Bedwars;

import java.util.HashMap;
import java.util.HashSet;

public class TeamsManager {

    private HashSet<Team> teams;
    private Bedwars bedwars;

    public TeamsManager(Bedwars bedwars) {
    }

    public TeamsManager(HashSet<Team> teams) {
        this.teams = teams;
    }

    public void addTeam(TeamColor color, Team team){
       teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
    }
}
