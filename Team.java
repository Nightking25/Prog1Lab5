package lab5;
/*
 * Book question 55
 * 
 * @author Nirdesh
 */
public class Team {
	private String name;
	
	public Team(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String teamName) {
		this.name = teamName;
	}
	public String toString() {
		return ("Your Team: " + getName());
	}
	public boolean equals(Team other) {
		return name.equals(other.name);
	}
}
