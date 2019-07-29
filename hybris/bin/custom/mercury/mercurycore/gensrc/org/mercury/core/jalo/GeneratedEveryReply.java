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
 * Generated class for type {@link org.mercury.core.jalo.EveryReply EveryReply}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEveryReply extends GenericItem
{
	/** Qualifier of the <code>EveryReply.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>EveryReply.replyone</code> attribute **/
	public static final String REPLYONE = "replyone";
	/** Qualifier of the <code>EveryReply.replytwo</code> attribute **/
	public static final String REPLYTWO = "replytwo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(REPLYONE, AttributeMode.INITIAL);
		tmp.put(REPLYTWO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replyone</code> attribute.
	 * @return the replyone
	 */
	public Integer getReplyone(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, REPLYONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replyone</code> attribute.
	 * @return the replyone
	 */
	public Integer getReplyone()
	{
		return getReplyone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replyone</code> attribute. 
	 * @return the replyone
	 */
	public int getReplyoneAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReplyone( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replyone</code> attribute. 
	 * @return the replyone
	 */
	public int getReplyoneAsPrimitive()
	{
		return getReplyoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replyone</code> attribute. 
	 * @param value the replyone
	 */
	public void setReplyone(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, REPLYONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replyone</code> attribute. 
	 * @param value the replyone
	 */
	public void setReplyone(final Integer value)
	{
		setReplyone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replyone</code> attribute. 
	 * @param value the replyone
	 */
	public void setReplyone(final SessionContext ctx, final int value)
	{
		setReplyone( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replyone</code> attribute. 
	 * @param value the replyone
	 */
	public void setReplyone(final int value)
	{
		setReplyone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replytwo</code> attribute.
	 * @return the replytwo
	 */
	public Integer getReplytwo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, REPLYTWO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replytwo</code> attribute.
	 * @return the replytwo
	 */
	public Integer getReplytwo()
	{
		return getReplytwo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replytwo</code> attribute. 
	 * @return the replytwo
	 */
	public int getReplytwoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReplytwo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.replytwo</code> attribute. 
	 * @return the replytwo
	 */
	public int getReplytwoAsPrimitive()
	{
		return getReplytwoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replytwo</code> attribute. 
	 * @param value the replytwo
	 */
	public void setReplytwo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, REPLYTWO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replytwo</code> attribute. 
	 * @param value the replytwo
	 */
	public void setReplytwo(final Integer value)
	{
		setReplytwo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replytwo</code> attribute. 
	 * @param value the replytwo
	 */
	public void setReplytwo(final SessionContext ctx, final int value)
	{
		setReplytwo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.replytwo</code> attribute. 
	 * @param value the replytwo
	 */
	public void setReplytwo(final int value)
	{
		setReplytwo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EveryReply.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EveryReply.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
