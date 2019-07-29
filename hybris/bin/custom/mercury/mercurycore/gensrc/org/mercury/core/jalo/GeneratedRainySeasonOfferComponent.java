/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29 Jul, 2019 11:32:08 PM                    ---
 * ----------------------------------------------------------------
 */
package org.mercury.core.jalo;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mercury.core.constants.MercuryCoreConstants;

/**
 * Generated class for type {@link org.mercury.core.jalo.RainySeasonOfferComponent RainySeasonOfferComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRainySeasonOfferComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>RainySeasonOfferComponent.rainImage</code> attribute **/
	public static final String RAINIMAGE = "rainImage";
	/** Qualifier of the <code>RainySeasonOfferComponent.offers</code> attribute **/
	public static final String OFFERS = "offers";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RAINIMAGE, AttributeMode.INITIAL);
		tmp.put(OFFERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RainySeasonOfferComponent.offers</code> attribute.
	 * @return the offers
	 */
	public List<String> getOffers(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, OFFERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RainySeasonOfferComponent.offers</code> attribute.
	 * @return the offers
	 */
	public List<String> getOffers()
	{
		return getOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RainySeasonOfferComponent.offers</code> attribute. 
	 * @param value the offers
	 */
	public void setOffers(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, OFFERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RainySeasonOfferComponent.offers</code> attribute. 
	 * @param value the offers
	 */
	public void setOffers(final List<String> value)
	{
		setOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RainySeasonOfferComponent.rainImage</code> attribute.
	 * @return the rainImage
	 */
	public Media getRainImage(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, RAINIMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RainySeasonOfferComponent.rainImage</code> attribute.
	 * @return the rainImage
	 */
	public Media getRainImage()
	{
		return getRainImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RainySeasonOfferComponent.rainImage</code> attribute. 
	 * @param value the rainImage
	 */
	public void setRainImage(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, RAINIMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RainySeasonOfferComponent.rainImage</code> attribute. 
	 * @param value the rainImage
	 */
	public void setRainImage(final Media value)
	{
		setRainImage( getSession().getSessionContext(), value );
	}
	
}
