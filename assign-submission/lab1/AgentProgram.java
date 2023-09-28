package lab1;

import lab1.Environment.LocationState;

public class AgentProgram {

	public Action execute(Percept p) {// location, status
		if(p.getLocationState() == LocationState.DIRTY) {
			return Environment.SUCK_DIRT;
		}
		else if(p.getAgentLocation() == Environment.LOCATION_A) {
			return Environment.MOVE_RIGHT;
		}
		else
			return Environment.MOVE_LEFT;
		
	}
}