/**
 *
 */
package org.mercury.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;


/**
 * @author Admin
 *
 */
public class CreditSearchResultVariantProductPopulator extends SearchResultVariantProductPopulator
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.commercefacades.search.converters.populator.SearchResultVariantProductPopulator#populate(de.
	 * hybris.platform.commerceservices.search.resultdata.SearchResultValueData,
	 * de.hybris.platform.commercefacades.product.data.ProductData)
	 */
	@Override
	public void populate(final SearchResultValueData source, final ProductData target)
	{
		// YTODO Auto-generated method stub
		final Object creditObject = this.getValue(source, "credits");
		super.populate(source, target);
		if (creditObject != null)
		{
			target.setCredits(this.<Integer> getValue(source, "credits").intValue());
		}
		else
		{
			target.setCredits(0);
		}
	}
}
