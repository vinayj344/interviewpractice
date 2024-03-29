/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *  
 */
package de.hybris.platform.commercefacades.converter;



/**
 * Interface for a configurable populator. A populator sets values in a target instance based on values in the source
 * instance. Populators are similar to converters except that unlike converters the target instance must already exist.
 * The collection of options is used to control what data is populated.
 *
 * @param <SOURCE>
 *           the type of the source object
 * @param <TARGET>
 *           the type of the destination object
 * @param <OPTION>
 *           the type of the options list
 *
 * @deprecated use {@link de.hybris.platform.converters.ConfigurablePopulator} instead. Will be removed in version 6.2
 */
@Deprecated
public interface ConfigurablePopulator<SOURCE, TARGET, OPTION> extends
		de.hybris.platform.converters.ConfigurablePopulator<SOURCE, TARGET, OPTION>
{
	//deprecated
}
