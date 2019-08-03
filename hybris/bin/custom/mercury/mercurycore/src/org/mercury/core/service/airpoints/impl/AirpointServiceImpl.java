/**
 *
 */
package org.mercury.core.service.airpoints.impl;

import org.mercury.core.DAO.airpoints.AirpointDAO;
import org.mercury.core.service.airpoints.AirpointService;


/**
 * @author Admin
 *
 */
public class AirpointServiceImpl implements AirpointService
{

	private AirpointDAO airpointDAO;

	/**
	 * @return the airpointDAO
	 */
	public AirpointDAO getAirpointDAO()
	{
		return airpointDAO;
	}

	/**
	 * @param airpointDAO
	 *           the airpointDAO to set
	 */
	public void setAirpointDAO(final AirpointDAO airpointDAO)
	{
		this.airpointDAO = airpointDAO;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.mercury.core.service.airpoints.AirpointService#getAirpointService(java.lang.String)
	 */
	@Override
	public int getAirpointService(final String productCode)
	{
		return getAirpointDAO().getAirpointsForProduct(productCode);
	}

}
