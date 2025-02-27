# SPDX-License-Identifier: MIT
# SPDX-FileCopyrightText: 2025 Bartosz Golaszewski <bartosz.golaszewski@linaro.org>

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://0001-Bluetooth-qca-Expand-firmware-name-to-load-specific-.patch \
    file://0002-PCI-qcom-Add-support-for-modular-builds.patch \
    file://0003-ARM-qcom_defconfig-build-PCIe-driver-as-a-module.patch \
    file://0004-arm64-defconfig-build-Qualcomm-PCIe-driver-as-a-modu.patch \
    file://0005-media-dt-bindings-Document-SC8280XP-SM8350-Venus.patch \
    file://0006-media-venus-core-Remove-trailing-commas-from-of-matc.patch \
    file://0007-media-venus-hfi_venus-Support-only-updating-certain-.patch \
    file://0008-media-platform-venus-Add-optional-LLCC-path.patch \
    file://0009-media-venus-core-Add-SM8350-resource-struct.patch \
    file://0010-media-venus-core-Add-SC8280XP-resource-struct.patch \
    file://0011-arm64-dts-qcom-sc8280xp-Add-Venus.patch \
    file://0012-arm64-dts-qcom-sc8280xp-x13s-Enable-Venus.patch \
    file://0013-firmware-qcom-uefisecapp-fix-efivars-registration-ra.patch \
    file://0014-rtc-pm8xxx-add-support-for-uefi-offset.patch \
    file://0015-rtc-pm8xxx-mitigate-flash-wear.patch \
    file://0016-arm64-dts-qcom-sc8280xp-x13s-switch-to-uefi-rtc-offs.patch \
    file://ecryptfs.cfg \
    file://efi.cfg \
    file://overlayfs.cfg \
    file://gpio-sim.cfg \
    file://dm-verity.cfg \
    file://i2c.cfg \
    file://i2cdev.cfg \
    file://squashfs.cfg \
"
