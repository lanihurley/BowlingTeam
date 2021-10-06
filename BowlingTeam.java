// Exercise from pages 386 - 391 creating a class that conatins an array of strings
// Author Lani Hurley
// Date 9/28/2021
// *program requires BowlingTeamDemo2.java file to execute

public class BowlingTeam 
{
    // instance variables for this class
    private String teamName;
    private String[] members = new String[4];

    // setter / mutator method for the teamName
    public void setTeamName(String team)
    {
        teamName = team;
    }
     // getter / accessor method for the teamName
    public String getTeamName()
    {
        return teamName;        
    }  
    // setter / mutator for the members array
    public void setMember(int number, String name)
    {
        members[number] = name;
    }
    // getter / accessor for the members array
    public String getMember(int number)
    {
        return members[number];
    }
    
}
