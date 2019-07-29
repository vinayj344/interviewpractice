/**
 *
 */
package org.mercury.core.service.offer.impl;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.impl.UniqueAttributesInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;
import org.mercury.core.model.OfferFormEntryModel;
import org.mercury.core.service.offer.OfferRegistrationService;


/**
 * @author Admin
 *
 */
public class OfferRegistrationServiceImpl implements OfferRegistrationService
{

	private ModelService modelService;

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.mercury.core.service.offer.OfferRegistrationService#registerOffer(de.hybris.platform.
	 * mercurycore.model.OfferFormEntryModel)
	 */
	@Override
	public void registerOfferService(final OfferFormEntryModel entryModel) throws DuplicateUidException
	{

		try
		{
			getModelService().save(entryModel);
		}
		catch (final ModelSavingException e)
		{
			if (e.getCause() instanceof InterceptorException
					&& ((InterceptorException) e.getCause()).getInterceptor().getClass().equals(UniqueAttributesInterceptor.class))
			{
				throw new DuplicateUidException(entryModel.getUid(), e);
			}
			else
			{
				throw e;
			}
		}
		catch (final AmbiguousIdentifierException e)
		{
			throw new DuplicateUidException(entryModel.getUid(), e);
		}

	}

}
