DESCRIPTION = "rtmpdump is a toolkit for RTMP streams"
LICENSE = "LGPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "openssl zlib librtmp"

inherit gitpkgv

PKGV = "2.4+git${GITPKGV}"
PV = "2.4+git${SRCPV}"
SRCREV = "${AUTOREV}"
PR = "r0"

SRC_URI = "git://git.ffmpeg.org/rtmpdump;protocol=git file://0001-KSV-Patch-With-Update-11-06-2013.patch"

S = "${WORKDIR}/git"

do_compile() {
	make CROSS_COMPILE=${TARGET_PREFIX} SHARED= VERSION="v2.4.GreekStreamTV\ 5ba573a+KSV"
}

do_install() {
	install -d ${D}${bindir}
        install rtmpdump ${D}${bindir}/
}
