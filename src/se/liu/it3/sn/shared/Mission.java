package se.liu.it3.sn.shared;

import java.sql.Time;

/**
 * The Mission class defines a mission. What, when, where and unique ID.
 * The MissionLog keeps track of changes/updates to the mission, using MissionLogEntry objects.
 * 
 */
public class Mission {

	/** Unique identifier for the mission */
	private MissionId id;
	/** Short one-line description of the mission */
	private String title;
	/** Longer more informative desctiption of the mission */
	private String description;
	/** Time when the mission was created */
	private Time creationTime;
	/** Coordinates for the mission */
	private double longitude, latitude;
	/** The mission log. See MissionLog documentation */
	private MissionLog log;
	/** Priority of the mission. Must be between 1 and 4 */
	private int priority;

	//TODO:right now - need to send the id & time from outside. change? 
	public Mission(MissionId id, Time creationtime) {
		setId(id);
		setCreationTime(creationtime);
	}

	/**
	 * @return the id
	 */
	public MissionId getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	private void setId(MissionId id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 * @throws Exception Title cannot be null or empty
	 */
	public void setTitle(String title) throws Exception {
		if (title.equals("") || title == null) {
			throw new Exception("Title cannot be null or empty");
		}
		else {
			this.title = title;			
		}		
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 * @throws Exception Description cannot be null
	 */
	public void setDescription(String description) throws Exception {
		if (description != null) {
			throw new Exception("Description cannot be null");
		}
		else {
			this.description = description;			
		}
	}

	/**
	 * @return the creationTime
	 */
	public Time getCreationTime() {
		return creationTime;
	}

	/**
	 * @param creationTime
	 *            the creationTime to set
	 */
	private void setCreationTime(Time creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 * @throws Exception If priority <1 or >5
	 */
	public void setPriority(int priority) throws Exception {
		if (priority < 1 || priority > 4) {
			throw new Exception("Priority must be between 1 and 4.");
		}
		else {
			this.priority = priority;
		}
	}

	// TODO:behover man kunna getta hela Loggen eller bara Listan?
	/**
	 * @return the log
	 */
	public MissionLog getLog() {
		return log;
	}

	/**
	 * Add a log entry to the mission log.
	 */
	public void addLogEntry(MissionLogEntry logEntry) {
		log.add(logEntry);
	}

}
