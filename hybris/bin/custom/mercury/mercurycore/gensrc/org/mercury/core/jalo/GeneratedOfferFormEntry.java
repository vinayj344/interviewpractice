/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29 Jul, 2019 11:32:08 PM                    ---
 * ----------------------------------------------------------------
 */
package org.mercury.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.mercury.core.constants.MercuryCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem OfferFormEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOfferFormEntry extends GenericItem
{
	/** Qualifier of the <code>OfferFormEntry.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>OfferFormEntry.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>OfferFormEntry.subscribe</code> attribute **/
	public static final String SUBSCRIBE = "subscribe";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SUBSCRIBE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.subscribe</code> attribute.
	 * @return the subscribe
	 */
	public Boolean isSubscribe(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUBSCRIBE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.subscribe</code> attribute.
	 * @return the subscribe
	 */
	public Boolean isSubscribe()
	{
		return isSubscribe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.subscribe</code> attribute. 
	 * @return the subscribe
	 */
	public boolean isSubscribeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSubscribe( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.subscribe</code> attribute. 
	 * @return the subscribe
	 */
	public boolean isSubscribeAsPrimitive()
	{
		return isSubscribeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.subscribe</code> attribute. 
	 * @param value the subscribe
	 */
	public void setSubscribe(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUBSCRIBE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.subscribe</code> attribute. 
	 * @param value the subscribe
	 */
	public void setSubscribe(final Boolean value)
	{
		setSubscribe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.subscribe</code> attribute. 
	 * @param value the subscribe
	 */
	public void setSubscribe(final SessionContext ctx, final boolean value)
	{
		setSubscribe( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.subscribe</code> attribute. 
	 * @param value the subscribe
	 */
	public void setSubscribe(final boolean value)
	{
		setSubscribe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferFormEntry.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferFormEntry.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
