/**
 *
 */
package org.mercury.core.processor;

import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.impex.jalo.imp.ImpExImportReader;
import de.hybris.platform.impex.jalo.imp.ImportProcessor;
import de.hybris.platform.impex.jalo.imp.ValueLine;
import de.hybris.platform.jalo.Item;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Admin
 *
 */
public class DefaultEveryreplyImportProcessor implements ImportProcessor
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.impex.jalo.imp.ImportProcessor#init(de.hybris.platform.impex.jalo.imp.ImpExImportReader)
	 */
	@Override
	public void init(final ImpExImportReader impExImportReader)
	{
		// YTODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.impex.jalo.imp.ImportProcessor#processItemData(de.hybris.platform.impex.jalo.imp.ValueLine)
	 */
	@Override
	public Item processItemData(final ValueLine valueLine) throws ImpExException
	{
		// YTODO Auto-generated method stub
		final Map<Integer, String> map = new HashMap<>();


			if (Integer.valueOf(map.get(3)).intValue() > Integer.valueOf(map.get(2)).intValue())
			{
				System.out.println("replytwo should be greater than replyone" + valueLine.getHeader().getColumns().get(2));
			}

		return null;
	}


}
