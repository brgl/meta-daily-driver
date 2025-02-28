SUMMARY = "Live installer script"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI += "file://installer.sh.in"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

RDEPENDS:${PN} = " \
    dosfstools \
    e2fsprogs \
    parted \
    pv \
    whiptail \
    dracut \
"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/installer.sh.in ${D}${bindir}/installer
    sed -i -e "s,@DD_INSTALL_DEVICE@,${DD_INSTALL_DEVICE},g" ${D}${bindir}/installer
    sed -i -e "s,@DD_TARGET_DEVICE@,${DD_TARGET_DEVICE},g" ${D}${bindir}/installer
    sed -i -e "s,@DD_DEVICETREE@,${DD_DEVICETREE},g" ${D}${bindir}/installer
}

do_compile[noexec] = "1"
