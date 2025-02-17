# SPDX-License-Identifier: MIT
# SPDX-FileCopyrightText: 2025 Bartosz Golaszewski <bartosz.golaszewski@linaro.org>

SUMMARY = "Comprehensive desktop image based on KDE Plasma workspace"
LICENSE = "MIT"

inherit features_check core-image

REQUIRED_DISTRO_FEATURES = "wayland systemd"

IMAGE_FEATURES += " \
    dev-pkgs \
    doc-pkgs \
    splash \
    hwcodecs \
"

IMAGE_INSTALL_KDE = " \
    packagegroup-plasma-desktop-workspace \
    sddm-config-plasma-desktop \
    sddm \
    ttf-noto \
    ttf-noto-emoji \
    wayland \
"

IMAGE_INSTALL_DEV = " \
    packagegroup-self-hosted \
    packagegroup-core-sdk \
    packagegroup-rust-sdk-target \
    help2man \
    glib-2.0-utils \
    glib-2.0-codegen \
    qttools \
    autoconf-archive \
    flex \
    bison \
    perl \
    valgrind \
    gdb \
    strace \
    ltrace \
    cmake \
    meson \
    ccache \
    repo \
    ninja \
    catch2-dev \
    googletest \
    diffutils \
"

IMAGE_INSTALL_SYSTEM = " \
    avahi-daemon \
    avahi-utils \
    vim \
    konsole \
    dolphin \
    python3-pip \
    python3-virtualenv \
    gparted \
    findutils \
    mpv \
    dragon \
    elisa \
    okular \
    gwenview \
    iw \
    inetutils \
    usbutils \
    i2c-tools \
    libgpiod-tools \
    procps \
    ecryptfs-utils \
    sshfs-fuse \
    kmod \
    util-linux-rtcwake \
    bash \
    coreutils \
    man-pages \
    groff \
    pv \
    gimp \
    cheese \
    flatpak \
    gptfdisk \
    util-linux-fdisk \
    bmaptool \
    efivar \
    evtest \
    packagegroup-gnome-apps \
    packagegroup-kde-applications \
    gnupg \
    kscreen \
    bc \
"

IMAGE_INSTALL_E2FS = " \
    e2fsprogs-badblocks \
    e2fsprogs-dumpe2fs \
    e2fsprogs-e2fsck \
    e2fsprogs-e2scrub \
    e2fsprogs-mke2fs \
    e2fsprogs-resize2fs \
    e2fsprogs-tune2fs \
"

IMAGE_INSTALL_GAMES = " \
    kmines \
    gnome-chess \
"

IMAGE_INSTALL_SSH = " \
    openssh-keygen \
    openssh-scp \
    openssh-ssh \
    openssh-sshd \
    openssh-sftp \
    openssh-misc \
"

IMAGE_INSTALL_GSTREAMER = " \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gstreamer1.0-plugins-good \
    gstreamer1.0-plugins-bad \
"

IMAGE_INSTALL = " \
    ${CORE_IMAGE_BASE_INSTALL} \
    ${IMAGE_INSTALL_DEV} \
    ${IMAGE_INSTALL_KDE} \
    ${IMAGE_INSTALL_SYSTEM} \
    ${IMAGE_INSTALL_SSH} \
    ${IMAGE_INSTALL_GAMES} \
    ${IMAGE_INSTALL_E2FS} \
    ${IMAGE_INSTALL_GSTREAMER} \
"

SYSTEMD_DEFAULT_TARGET="graphical.target"
