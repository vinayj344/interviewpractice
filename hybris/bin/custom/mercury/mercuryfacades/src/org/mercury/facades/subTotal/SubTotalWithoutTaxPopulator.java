/**
 *
 */
package org.mercury.facades.subTotal;

import de.hybris.platform.commercefacades.product.PriceDataFactory;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.mercury.facades.product.data.SubTotalWithoutTaxData;

import java.math.BigDecimal;


/**
 * @author Admin
 *
 */
public class SubTotalWithoutTaxPopulator implements Populator<CartModel, SubTotalWithoutTaxData>
{

	private PriceDataFactory priceDataFactory;

	/**
	 * @return the priceDataFactory
	 */
	public PriceDataFactory getPriceDataFactory()
	{
		return priceDataFactory;
	}

	/**
	 * @param priceDataFactory
	 *           the priceDataFactory to set
	 */
	public void setPriceDataFactory(final PriceDataFactory priceDataFactory)
	{
		this.priceDataFactory = priceDataFactory;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final CartModel source, final SubTotalWithoutTaxData target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		final double total = source.getTotalPrice().doubleValue();
		final double tax = source.getTotalTax().doubleValue();
		final double totalWithoutTx = total - tax;
		target.setSub(createPrice(source, Double.valueOf(totalWithoutTx)));
	}

	protected PriceData createPrice(final AbstractOrderModel model, final Double val)
	{
		if (model == null)
		{
			throw new IllegalArgumentException("source order must not be empty");
		}
		else
		{
			final CurrencyModel currency = model.getCurrency();
			if (currency == null)
			{
				throw new IllegalArgumentException("currency must not be empty");
			}
			else
			{
				final double price = val != null ? val.doubleValue() : 0.00;
				return this.getPriceDataFactory().create(PriceDataType.BUY, BigDecimal.valueOf(price), currency);

			}
		}
	}

}
