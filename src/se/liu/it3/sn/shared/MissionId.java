package se.liu.it3.sn.shared;

/**
 * Uniquely identifies a mission. Each organization has a specific ID char, and 
 * an id for the mission handled internally by each organization.
 */
public class MissionId {
	private char organizationId;
	private long id; // TODO: better variable name pls
	
	/**
	 * 
	 * @param organizationId
	 * @param id 
	 */
	public MissionId(char organizationId, long id) {
		this.organizationId = organizationId;
		this.id = id;
	}

	/**
	 * @return the organizationId
	 */
	public char getOrganizationId() {
		return organizationId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
}
