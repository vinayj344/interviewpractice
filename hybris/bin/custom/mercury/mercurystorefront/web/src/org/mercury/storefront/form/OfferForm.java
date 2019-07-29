/**
 *
 */
package org.mercury.storefront.form;

/**
 * @author Admin
 *
 */
public class OfferForm
{

	private String name;
	private String email;
	private boolean subscribe;

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *           the name to set
	 */
	public void setName(final String name)
	{
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email
	 *           the email to set
	 */
	public void setEmail(final String email)
	{
		this.email = email;
	}

	/**
	 * @return the subscribe
	 */
	public boolean isSubscribe()
	{
		return subscribe;
	}

	/**
	 * @param subscribe
	 *           the subscribe to set
	 */
	public void setSubscribe(final boolean subscribe)
	{
		this.subscribe = subscribe;
	}
}
