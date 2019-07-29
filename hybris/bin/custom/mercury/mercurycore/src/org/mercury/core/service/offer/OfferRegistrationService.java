/**
 *
 */
package org.mercury.core.service.offer;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import org.mercury.core.model.OfferFormEntryModel;


/**
 * @author Admin
 *
 */
public interface OfferRegistrationService
{

	public void registerOfferService(final OfferFormEntryModel entryModel) throws DuplicateUidException;
}
