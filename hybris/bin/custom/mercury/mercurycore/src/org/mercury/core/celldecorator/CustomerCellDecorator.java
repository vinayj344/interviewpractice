/**
 *
 */
package org.mercury.core.celldecorator;

import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.util.CSVCellDecorator;

import java.util.Map;


/**
 * @author Admin
 *
 */
public class CustomerCellDecorator implements CSVCellDecorator
{

	private final String USER_SERVICE_BEAN = "userService";

	protected UserService getUserService()
	{
		return (UserService) Registry.getApplicationContext().getBean(USER_SERVICE_BEAN);
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.util.CSVCellDecorator#decorate(int, java.util.Map)
	 */
	@Override
	public String decorate(final int position, final Map<Integer, String> valueLine)
	{
		final String cell = valueLine.get(Integer.valueOf(position));
		if (cell == null || cell.isEmpty())
		{
			return cell;
		}
		else
		{
			final UserModel user = getUserService().getUserForUID(cell);
			if (user.getDefaultShipmentAddress().getCountry().getIsocode().equals("RU"))
			{
				return cell + "_RU";
			}
			else
			{
				return cell;
			}
		}

	}

}


