package org.proxibanquev3.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class EcouteurPhase implements PhaseListener {

	private static final long serialVesrionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {
		System.out.println("Phase après : " + event.getPhaseId().toString());

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("Phase avant : " + event.getPhaseId().toString());

	}

	@Override
	
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
