/**
 *
 */
package org.mercury.storefront.controllers.offers;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import org.mercury.facades.OfferFormData;
import org.mercury.facades.offers.OfferRegistrationFacade;
import org.mercury.facades.product.data.GenderData;
import org.mercury.storefront.controllers.ControllerConstants;
import org.mercury.storefront.form.OfferForm;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * @author Admin
 *
 */
@Controller
@RequestMapping("/offers")
public class OffersPageController extends AbstractPageController
{

	@Resource(name = "offerRegistrationFacade")
	private OfferRegistrationFacade offerRegistrationFacade;

	@RequestMapping(method = RequestMethod.GET)
	public String getOffers(final Model model) throws CMSItemNotFoundException
	{
		final ContentPageModel page = getContentPageForLabelOrId("offerPage");
		storeCmsPageInModel(model, page);
		setUpMetaDataForContentPage(model, page);
		final OfferForm offerForm = new OfferForm();
		model.addAttribute("offerForm", offerForm);
		return getViewForPage(page);
	}

	@RequestMapping(value = "/rainySeasonoffers", method = RequestMethod.GET)
	public String getRainySeasonPage(final Model model)
	{
		final List<GenderData> genderList = offerRegistrationFacade.getTestGenders();
		model.addAttribute("testGenders", genderList);
		return ControllerConstants.Views.Pages.Offers.RainySeasonOffer;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String doRegister(@RequestHeader(value = "referer", required = false) final String referer, final OfferForm form,
			final BindingResult bindingResult, final Model model, final HttpServletRequest request,
			final HttpServletResponse response, final RedirectAttributes redirectModel)
			throws CMSItemNotFoundException, DuplicateUidException
	{
		System.out.println("work");

		if (form != null)
		{
			final OfferFormData offerFormData = new OfferFormData();
			offerFormData.setName(form.getName());
			offerFormData.setEmail(form.getEmail());
			offerFormData.setSubscribe(Boolean.valueOf(form.isSubscribe()));

			offerRegistrationFacade.registerOffer(offerFormData);
		}
		return "offerPage";
		//
	}


}
