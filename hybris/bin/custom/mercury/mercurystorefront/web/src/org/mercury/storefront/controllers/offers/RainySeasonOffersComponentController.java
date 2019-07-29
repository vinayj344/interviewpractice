/**
 *
 */
package org.mercury.storefront.controllers.offers;

import org.mercury.core.model.RainySeasonOfferComponentModel;
import org.mercury.storefront.controllers.ControllerConstants;
import org.mercury.storefront.controllers.cms.AbstractAcceleratorCMSComponentController;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Admin
 *
 */
@Controller("RainySeasonOfferComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.RainySeasonOffersComponent)
@Scope("tenant")
public class RainySeasonOffersComponentController
		extends AbstractAcceleratorCMSComponentController<RainySeasonOfferComponentModel>
{

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final RainySeasonOfferComponentModel component)
	{
		// YTODO Auto-generated method stub
		model.addAttribute("rainMedia", component.getRainImage());
		model.addAttribute("rainOffers", component.getOffers());
	}

	@Override
	protected String getView(final RainySeasonOfferComponentModel component)
	{
		// YTODO Auto-generated method stub
		return ControllerConstants.Views.Cms.ComponentPrefix + StringUtils.lowerCase(RainySeasonOfferComponentModel._TYPECODE);
	}

}
