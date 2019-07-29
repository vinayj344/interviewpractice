/**
 *
 */
package org.mercury.facades.offers;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import org.mercury.facades.OfferFormData;
import org.mercury.facades.product.data.GenderData;

import java.util.List;


/**
 * @author Admin
 *
 */
public interface OfferRegistrationFacade
{

	void registerOffer(final OfferFormData data) throws DuplicateUidException;

	public List<GenderData> getTestGenders();
}
