/**
 *
 */
package org.mercury.core.transaltors;

import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;

import org.apache.commons.lang.StringUtils;


/**
 * @author Admin
 *
 */
public class MercuryPriceTranslator extends AbstractValueTranslator
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.impex.jalo.translators.AbstractValueTranslator#exportValue(java.lang.Object)
	 */
	@Override
	public String exportValue(final Object value) throws JaloInvalidParameterException
	{
		// YTODO Auto-generated method stub
		return value == null ? "" : value.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.impex.jalo.translators.AbstractValueTranslator#importValue(java.lang.String,
	 * de.hybris.platform.jalo.Item)
	 */
	@Override
	public Object importValue(final String value, final Item arg1) throws JaloInvalidParameterException
	{
		clearStatus();
		Double price = null;
		if (!StringUtils.isBlank(value))
		{
			try
			{
				price = Double.valueOf(value);
			}
			catch (final NumberFormatException e)
			{
				setError();
			}
			if (price != null && price <= 0.0)
			{
				setError();
			}

		}
		return price;
	}

}
