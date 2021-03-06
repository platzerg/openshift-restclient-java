/******************************************************************************* 
 * Copyright (c) 2016 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package com.openshift.restclient.api.capabilities;

import com.openshift.restclient.OpenShiftException;
import com.openshift.restclient.apis.autoscaling.models.IScale;
import com.openshift.restclient.capability.ICapability;

/**
 * Allow a resource to scale
 * @author jeff.cantrill
 *
 */
public interface IScalable extends ICapability {

	/**
	 * Scale to the desired replicas. Value
	 * less then 0 will scale to 0
	 * @param replicas
	 * @throws OpenShiftException if there are errors
	 */
	IScale scaleTo(int replicas);
}
