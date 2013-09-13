DESCRIPTION = "GreekStreamTV"
SUMMARY = "Watch live stream TV from Greece"
SECTION = "multimedia"
MAINTAINER = "SatDreamGR"
HOMEPAGE = "http://satdreamgr.com"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://setup.py;md5=5bd6abbe16b24378e2f2a38aea9768d2"

DEPENDS = "enigma2"

RDEPENDS_${PN} = "livestreamer \
	python-requests \
	rtmpdump \
	"

PR = "r0"

S="${WORKDIR}/git"

SRC_URI = "git://github.com/athoik/GreekStreamTV;protocol=git"

SRCREV = "v${PV}"

inherit distutils-openplugins

do_install_append() {
  chmod 755 ${D}${libdir}/enigma2/python/Plugins/Extensions/GreekStreamTV/*.sh
}

PACKAGES =+ "${PN}-src"

FILES_${PN} = "/usr/lib/enigma2/python/Plugins/Extensions/GreekStreamTV/*"
FILES_${PN}-src = "/usr/lib/enigma2/python/Plugins/Extensions/GreekStreamTV/*.py"
