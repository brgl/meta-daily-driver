# SPDX-License-Identifier: MIT
# SPDX-FileCopyrightText: 2025 Bartosz Golaszewski <bartosz.golaszewski@linaro.org>

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://ecryptfs.cfg \
    file://overlayfs.cfg \
    file://gpio-sim.cfg \
    file://dm-verity.cfg \
    file://i2c.cfg \
    file://i2cdev.cfg \
"
