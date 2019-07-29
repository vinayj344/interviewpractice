/**
 *
 */
package org.mercury.facades.subTotal;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.order.CartService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.mercury.facades.product.data.SubTotalWithoutTaxData;


/**
 * @author Admin
 *
 */
public class TotalWithoutTaxFacadeImpl implements TotalWithoutTaxFacade
{

	private CartService cartService;
	private Converter<CartModel, SubTotalWithoutTaxData> totalWithoutTaxConverter;

	@Override
	public SubTotalWithoutTaxData getOrderTotalWithoutTax()
	{
		final SubTotalWithoutTaxData subTotalWithoutTaxData;
		// YTODO Auto-generated method stub
		if (getCartService().hasSessionCart())
		{
			subTotalWithoutTaxData = getTotalWithoutTaxConverter().convert(getCartService().getSessionCart());
		}
		else
		{
			subTotalWithoutTaxData = getTotalWithoutTaxConverter().convert(null);
		}

		return subTotalWithoutTaxData;
	}

	/**
	 * @return the cartService
	 */
	public CartService getCartService()
	{
		return cartService;
	}

	/**
	 * @param cartService
	 *           the cartService to set
	 */
	public void setCartService(final CartService cartService)
	{
		this.cartService = cartService;
	}

	/**
	 * @return the totalWithoutTaxConverter
	 */
	public Converter<CartModel, SubTotalWithoutTaxData> getTotalWithoutTaxConverter()
	{
		return totalWithoutTaxConverter;
	}

	/**
	 * @param totalWithoutTaxConverter
	 *           the totalWithoutTaxConverter to set
	 */
	public void setTotalWithoutTaxConverter(final Converter<CartModel, SubTotalWithoutTaxData> totalWithoutTaxConverter)
	{
		this.totalWithoutTaxConverter = totalWithoutTaxConverter;
	}


}
