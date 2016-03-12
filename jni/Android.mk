LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := EncodeNDK
LOCAL_SRC_FILES := JniUtils.c

include $(BUILD_SHARED_LIBRARY)
