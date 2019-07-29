/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29 Jul, 2019 11:32:08 PM                    ---
 * ----------------------------------------------------------------
 */
package org.mercury.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mercury.core.constants.MercuryCoreConstants;

/**
 * Generated class for type {@link org.mercury.core.jalo.ApparelProduct ApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedApparelProduct extends Product
{
	/** Qualifier of the <code>ApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>ApparelProduct.credits</code> attribute **/
	public static final String CREDITS = "credits";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		tmp.put(CREDITS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.credits</code> attribute.
	 * @return the credits - Credit points for ApparelProduct
	 */
	public Integer getCredits(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CREDITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.credits</code> attribute.
	 * @return the credits - Credit points for ApparelProduct
	 */
	public Integer getCredits()
	{
		return getCredits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.credits</code> attribute. 
	 * @return the credits - Credit points for ApparelProduct
	 */
	public int getCreditsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCredits( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.credits</code> attribute. 
	 * @return the credits - Credit points for ApparelProduct
	 */
	public int getCreditsAsPrimitive()
	{
		return getCreditsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.credits</code> attribute. 
	 * @param value the credits - Credit points for ApparelProduct
	 */
	public void setCredits(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CREDITS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.credits</code> attribute. 
	 * @param value the credits - Credit points for ApparelProduct
	 */
	public void setCredits(final Integer value)
	{
		setCredits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.credits</code> attribute. 
	 * @param value the credits - Credit points for ApparelProduct
	 */
	public void setCredits(final SessionContext ctx, final int value)
	{
		setCredits( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.credits</code> attribute. 
	 * @param value the credits - Credit points for ApparelProduct
	 */
	public void setCredits(final int value)
	{
		setCredits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
}
