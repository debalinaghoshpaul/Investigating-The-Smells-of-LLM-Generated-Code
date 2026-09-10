class Competition {
    String competitionName;
    String winningTeam;
    String runnerUp;
    int year;

    public Competition(String competitionName, String winningTeam, String runnerUp, int year) {
        this.competitionName = competitionName;
        this.winningTeam = winningTeam;
        this.runnerUp = runnerUp;
        this.year = year;
    }
}

class Team {
    String teamName;
    String name1;
    String name2;
    String name3;
    String name4;
    Competition competition1;
    Competition competition2;

    public Team(String teamName, String name1, String name2, String name3, String name4, Competition competition1, Competition competition2) {
        this.teamName = teamName;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.competition1 = competition1;
        this.competition2 = competition2;
    }

    public Team(Team team) {
        this.teamName = team.teamName;
        this.name1 = team.name1;
        this.name2 = team.name2;
        this.name3 = team.name3;
        this.name4 = team.name4;
        this.competition1 = new Competition(team.competition1.competitionName, team.competition1.winningTeam, team.competition1.runnerUp, team.competition1.year);
        this.competition2 = new Competition(team.competition2.competitionName, team.competition2.winningTeam, team.competition2.runnerUp, team.competition2.year);
    }

    public void displayTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Team Members: " + name1 + ", " + name2 + ", " + name3 + ", " + name4);
        System.out.println("Competition 1: " + competition1.competitionName + " - Year: " + competition1.year);
        System.out.println("Competition 2: " + competition2.competitionName + " - Year: " + competition2.year);
    }
}

public class Main {
    public static void main(String[] args) {
        Competition comp1 = new Competition("Competition 1", "Team A", "Team B", 2020);
        Competition comp2 = new Competition("Competition 2", "Team C", "Team D", 2021);
        
        Team originalTeam = new Team("Original Team", "Alice", "Bob", "Charlie", "David", comp1, comp2);
        originalTeam.displayTeamInfo();
        
        Team copiedTeam = new Team(originalTeam);
        copiedTeam.competition1 = new Competition("New Competition 1", "New Team A", "New Team B", 2022);
        copiedTeam.displayTeamInfo();
        
        System.out.println("Original Team after modifying copiedTeam competition info:");
        originalTeam.displayTeamInfo();
    }
}
