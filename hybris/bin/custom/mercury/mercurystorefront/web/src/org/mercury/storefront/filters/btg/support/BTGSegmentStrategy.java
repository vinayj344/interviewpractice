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
package org.mercury.storefront.filters.btg.support;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 */
public interface BTGSegmentStrategy
{
	// It is possible for this class to be extended or for method to be used in other extensions - so no sonar added
	void evaluateSegment(HttpServletRequest httpRequest) throws ServletException, IOException; // NOSONAR
}
