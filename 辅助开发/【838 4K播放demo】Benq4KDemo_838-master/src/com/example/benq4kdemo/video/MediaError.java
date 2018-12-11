package com.example.benq4kdemo.video;

public class MediaError {

	public static final int MEDIA_ERROR_BASE = -1000;

	public static final int ERROR_ALREADY_CONNECTED = MEDIA_ERROR_BASE;

	public static final int ERROR_NOT_CONNECTED = MEDIA_ERROR_BASE - 1;

	public static final int ERROR_UNKNOWN_HOST = MEDIA_ERROR_BASE - 2;

	public static final int ERROR_CANNOT_CONNECT = MEDIA_ERROR_BASE - 3;

	public static final int ERROR_IO = MEDIA_ERROR_BASE - 4;

	public static final int ERROR_CONNECTION_LOST = MEDIA_ERROR_BASE - 5;

	public static final int ERROR_MALFORMED = MEDIA_ERROR_BASE - 7;

	public static final int ERROR_OUT_OF_RANGE = MEDIA_ERROR_BASE - 8;

	public static final int ERROR_BUFFER_TOO_SMALL = MEDIA_ERROR_BASE - 9;

	public static final int ERROR_UNSUPPORTED = MEDIA_ERROR_BASE - 10;

	public static final int ERROR_END_OF_STREAM = MEDIA_ERROR_BASE - 11;

	// Not technically an error.

	public static final int INFO_FORMAT_CHANGED = MEDIA_ERROR_BASE - 12;

	public static final int INFO_DISCONTINUITY = MEDIA_ERROR_BASE - 13;

	// The following constant values should be in sync with

	// drm/drm_framework_common.h

	public static final int DRM_ERROR_BASE = -2000;

	public static final int ERROR_DRM_UNKNOWN = DRM_ERROR_BASE;

	public static final int ERROR_DRM_NO_LICENSE = DRM_ERROR_BASE - 1;

	public static final int ERROR_DRM_LICENSE_EXPIRED = DRM_ERROR_BASE - 2;

	public static final int ERROR_DRM_SESSION_NOT_OPENED = DRM_ERROR_BASE - 3;

	public static final int ERROR_DRM_DECRYPT_UNIT_NOT_INITIALIZED = DRM_ERROR_BASE - 4;

	public static final int ERROR_DRM_DECRYPT = DRM_ERROR_BASE - 5;

	public static final int ERROR_DRM_CANNOT_HANDLE = DRM_ERROR_BASE - 6;

	public static final int ERROR_DRM_TAMPER_DETECTED = DRM_ERROR_BASE - 7;

	// Heartbeat Error Codes

	public static final int HEARTBEAT_ERROR_BASE = -3000;

	public static final int ERROR_HEARTBEAT_AUTHENTICATION_FAILURE = HEARTBEAT_ERROR_BASE;

	public static final int ERROR_HEARTBEAT_NO_ACTIVE_PURCHASE_AGREEMENT = HEARTBEAT_ERROR_BASE - 1;

	public static final int ERROR_HEARTBEAT_CONCURRENT_PLAYBACK = HEARTBEAT_ERROR_BASE - 2;

	public static final int ERROR_HEARTBEAT_UNUSUAL_ACTIVITY = HEARTBEAT_ERROR_BASE - 3;

	public static final int ERROR_HEARTBEAT_STREAMING_UNAVAILABLE = HEARTBEAT_ERROR_BASE - 4;

	public static final int ERROR_HEARTBEAT_CANNOT_ACTIVATE_RENTAL = HEARTBEAT_ERROR_BASE - 5;

	public static final int ERROR_HEARTBEAT_TERMINATE_REQUESTED = HEARTBEAT_ERROR_BASE - 6;

	public static final int USER_ERROR_BASE = -5000;

	// Online play is connected to server timeout

	public static final int ERROR_CONNECTED_TIMEOUT = USER_ERROR_BASE;

	// The audio format is not supported

	public static final int ERROR_AUDIO_UNSUPPORT = USER_ERROR_BASE - 1;

	// The video format is not supported

	public static final int ERROR_VIDEO_UNSUPPORT = USER_ERROR_BASE - 2;

	// The file format is not supported

	public static final int ERROR_FILE_FORMAT_UNSUPPORT = USER_ERROR_BASE - 3;

}
