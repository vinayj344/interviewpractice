/**
 *
 */
package org.mercury.core.DAO.airpoints.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.mercury.core.DAO.airpoints.AirpointDAO;


/**
 * @author Admin
 *
 */
public class AirpointDAOImpl implements AirpointDAO
{

	private FlexibleSearchService flexibleSearchService;

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	public int getAirpointsForProduct(final String productCode)
	{
		final String query = "select {airpoints} from {ApparelProduct} where {code} = ?productCode";
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("productCode", productCode);

		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
		searchQuery.addQueryParameters(params);
		searchQuery.setResultClassList(Arrays.asList(Integer.class));
		final SearchResult<Object> result = getFlexibleSearchService().search(searchQuery);

		return (int) result.getResult().get(0);
	}

}
