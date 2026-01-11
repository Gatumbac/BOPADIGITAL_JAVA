package CoreUsers;

import java.util.*;
import CRM.*;
import OfferMatrices.*;

public class ImmediateSupervisor extends Employee {

	Collection<SalesAdvisor> subordinates;
	private String salesZone;

	/**
	 * 
	 * @param advisor
	 */
	public void addAdvisorToTeam(SalesAdvisor advisor) {
		// TODO - implement ImmediateSupervisor.addAdvisorToTeam
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param client
	 * @param advisor
	 */
	public void assingClient(BusinessClient client, SalesAdvisor advisor) {
		// TODO - implement ImmediateSupervisor.assingClient
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param visit
	 * @param isApproved
	 * @param comments
	 */
	public void reviewVisit(Visit visit, boolean isApproved, String comments) {
		// TODO - implement ImmediateSupervisor.reviewVisit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param matrix
	 * @param isApproved
	 * @param reason
	 */
	public void reviewOfferMatrix(OfferMatrix matrix, boolean isApproved, String reason) {
		// TODO - implement ImmediateSupervisor.reviewOfferMatrix
		throw new UnsupportedOperationException();
	}

}