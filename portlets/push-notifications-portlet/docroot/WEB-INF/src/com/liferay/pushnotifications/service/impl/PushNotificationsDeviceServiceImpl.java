/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.pushnotifications.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.pushnotifications.model.PushNotificationsDevice;
import com.liferay.pushnotifications.service.base.PushNotificationsDeviceServiceBaseImpl;
import com.liferay.pushnotifications.service.permission.PushNotificationsPermission;
import com.liferay.pushnotifications.util.ActionKeys;

/**
 * @author Silvio Santos
 * @author Bruno Farache
 */
public class PushNotificationsDeviceServiceImpl
	extends PushNotificationsDeviceServiceBaseImpl {

	@AccessControlled(guestAccessEnabled = true)
	@Override
	public PushNotificationsDevice addPushNotificationsDevice(
			String token, String platform)
		throws PortalException, SystemException {

		PushNotificationsPermission.check(
			getPermissionChecker(), ActionKeys.ADD_DEVICE);

		PushNotificationsDevice pushNotificationsDevice =
			pushNotificationsDevicePersistence.fetchByToken(token);

		if (pushNotificationsDevice == null) {
			pushNotificationsDevice =
				pushNotificationsDeviceLocalService.addPushNotificationsDevice(
					getGuestOrUserId(), platform, token);
		}
		else {
			long userId = getGuestOrUserId();

			if (pushNotificationsDevice.getUserId() != userId) {
				pushNotificationsDevice = null;

				if (_log.isInfoEnabled()) {
					_log.info(
						"Device found with token " + token +
							" does not belong to user " + userId);
				}
			}
		}

		return pushNotificationsDevice;
	}

	@Override
	public PushNotificationsDevice deletePushNotificationsDevice(String token)
		throws PortalException, SystemException {

		PushNotificationsDevice pushNotificationsDevice =
			pushNotificationsDevicePersistence.fetchByToken(token);

		if (pushNotificationsDevice == null) {
			if (_log.isInfoEnabled()) {
				_log.info("No device found with token " + token);
			}
		}
		else {
			long userId = getUserId();

			if (pushNotificationsDevice.getUserId() == userId) {
				pushNotificationsDevice =
					pushNotificationsDeviceLocalService.
						deletePushNotificationsDevice(token);
			}
			else if (_log.isInfoEnabled()) {
				_log.info(
					"Device found with token " + token +
						" does not belong to user " + userId);
			}
		}

		return pushNotificationsDevice;
	}

	@Override
	public boolean hasPermission(String actionId) throws PortalException {
		return PushNotificationsPermission.contains(
			getPermissionChecker(), actionId);
	}

	private static Log _log = LogFactoryUtil.getLog(
		PushNotificationsDeviceServiceImpl.class);

}