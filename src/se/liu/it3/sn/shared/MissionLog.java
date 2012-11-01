package se.liu.it3.sn.shared;

import java.util.ArrayList;
import java.util.List;

/**
 * Keeps track of changes/updates to the mission, using MissionLogEntry objects.
 * TODO: beskriv och dokumentera
 */
public class MissionLog {

	private List<MissionLogEntry> list;
	
	public MissionLog() {
		list = new ArrayList<MissionLogEntry>();
	}

	public void add(MissionLogEntry logEntry) {
		list.add(logEntry);
	}

}
