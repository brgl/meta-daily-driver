# SPDX-License-Identifier: MIT
# SPDX-FileCopyrightText: 2025 Bartosz Golaszewski <bartosz.golaszewski@linaro.org>

do_install:append() {
    # These conflict with upstream xdg-utils.
    rm ${D}/${bindir}/xdg-email
    rm ${D}/${bindir}/xdg-open
}
