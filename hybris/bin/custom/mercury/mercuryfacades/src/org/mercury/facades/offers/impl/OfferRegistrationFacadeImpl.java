/**
 *
 */
package org.mercury.facades.offers.impl;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.enums.Gender;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import org.mercury.core.model.OfferFormEntryModel;
import org.mercury.core.service.offer.OfferRegistrationService;
import org.mercury.facades.OfferFormData;
import org.mercury.facades.offers.OfferRegistrationFacade;
import org.mercury.facades.product.data.GenderData;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 * @author Admin
 *
 */
public class OfferRegistrationFacadeImpl implements OfferRegistrationFacade
{
	private OfferRegistrationService offerRegistrationService;
	private ModelService modelService;
	private Converter<Gender, GenderData> genderConverter;

	protected Converter<Gender, GenderData> getGenderConverter()
	{
		return genderConverter;
	}

	@Required
	public void setGenderConverter(final Converter<Gender, GenderData> genderConverter)
	{
		this.genderConverter = genderConverter;
	}

	@Override
	public void registerOffer(final OfferFormData formData) throws DuplicateUidException
	{
		final OfferFormEntryModel entryModel = getModelService().create(OfferFormEntryModel.class);
		entryModel.setName(formData.getName());
		entryModel.setUid(formData.getEmail());
		entryModel.setSubscribe(formData.getSubscribe());
		offerRegistrationService.registerOfferService(entryModel);
	}

	public List<GenderData> getTestGenders()
	{
		final Gender gender = Gender.MALE;
		final List<GenderData> genders = new ArrayList<GenderData>();
		genders.add(getGenderConverter().convert(gender));
		return genders;
	}


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


	/**
	 * @return the offerRegistrationService
	 */
	public OfferRegistrationService getOfferRegistrationService()
	{
		return offerRegistrationService;
	}

	/**
	 * @param offerRegistrationService
	 *           the offerRegistrationService to set
	 */
	public void setOfferRegistrationService(final OfferRegistrationService offerRegistrationService)
	{
		this.offerRegistrationService = offerRegistrationService;
	}
}
