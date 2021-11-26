/**
 * 
 */
package it.unibo.oop.lab.enum2;

import static it.unibo.oop.lab.enum2.Place.*;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(INDOOR, 5, "Basket"),
	VOLLEY(INDOOR, 6, "Volley"),
	TENNIS(OUTDOOR, 1, "Tennis"),
	BIKE(OUTDOOR, 1, "Bike"),
	F1(OUTDOOR, 1, "F1"),
	MOTOGP(OUTDOOR, 2, "Motogp"),
	SOCCER(OUTDOOR, 11, "Soccer");
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final Place place;
	private final int noTeamMembers ;
	private final String actualName ;

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	Sport(final Place place, final int noTeamMembers, final String actualName){
		this.place = place;
		this.actualName = actualName ;
		this.noTeamMembers = noTeamMembers;
	}
	
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	public boolean isIndividualSport() {
		if(this.noTeamMembers == 1) {
			return true;
		}
		return false;
	}
	
	public boolean isIndoorSport() {
		if(this.place == INDOOR) {
			return true;
		}
		return false;
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return this.actualName + this.noTeamMembers + this.place;
	}
}
