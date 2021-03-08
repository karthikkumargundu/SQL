package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;


import com.ltts.Dao.PlayerDao;
import com.ltts.Dao.TeamDao;
import com.ltts.model.Player;
import com.ltts.model.Team;

public class PlayerMain {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Team Id: "); 
	int tid=Integer.parseInt(br.readLine());
	System.out.println("Enter the Team Name: ");
    String tname=br.readLine();
    System.out.println("Enter the Owner Name: ");
    String towner=br.readLine();
    System.out.println("Enter the Coach Name: ");
    String tcoach=br.readLine();
    Team t= new Team(tid,tname,towner,tcoach);
    TeamDao td=new TeamDao();
    td.insertTeam(t);
	


	System.out.println("Enter the Player Id: "); 
	int pid=Integer.parseInt(br.readLine());
	System.out.println("Enter the Player Name: ");
    String pname=br.readLine();
	System.out.println("Enter the Date of Birth: ");
    Date pdate=Date.valueOf(br.readLine());
    System.out.println("Enter the Player Nationality: ");
    String pnation=br.readLine();
    System.out.println("Enter the Player Skills: ");
    String pskills=br.readLine();
    System.out.println("Enter the Player runs: ");
    int pruns=Integer.parseInt(br.readLine());
    System.out.println("Enter the Player Wickets: ");
    int pwic=Integer.parseInt(br.readLine());
    System.out.println("Enter the Player Number of Matches: ");
    int pnum=Integer.parseInt(br.readLine());
    System.out.println("Enter Player Team Id: ");
    int pteam=Integer.parseInt(br.readLine());
    
    Player p=new Player(pid,pname,pdate,pnation,pskills,pruns,pwic,pnum,pteam);
    PlayerDao pd=new PlayerDao();
    pd.insertPlayer(p);
	}
}


