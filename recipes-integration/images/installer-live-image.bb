# SPDX-License-Identifier: MIT
# SPDX-FileCopyrightText: 2025 Bartosz Golaszewski <bartosz.golaszewski@linaro.org>

SUMMARY = "Initramfs installer for the daily driver desktop image"
LICENSE = "MIT"

PACKAGE_INSTALL = " \
    live-installer \
    systemd \
    busybox \
"

IMAGE_FEATURES = "empty-root-password"
IMAGE_LINGUAS = ""

IMAGE_FSTYPES = "${INITRAMFS_FSTYPES}"
IMAGE_NAME_SUFFIX ?= ""
IMAGE_ROOTFS_SIZE = "8192"
IMAGE_ROOTFS_EXTRA_SPACE = "0"

inherit core-image
