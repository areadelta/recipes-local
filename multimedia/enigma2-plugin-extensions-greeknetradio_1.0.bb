DESCRIPTION = "GreekNetRadio"
SUMMARY = "Greek web radios"
SECTION = "multimedia"
MAINTAINER = "SatDreamGR"
HOMEPAGE = "http://satdreamgr.com"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://setup.py;md5=5d6dbd47e15611970ab1e4286f0acd22"

DEPENDS = "enigma2"

RDEPENDS_${PN} = "python-core"

PR = "r0"

S="${WORKDIR}/git"

SRC_URI = "git://github.com/athoik/GreekNetRadio;protocol=git"

SRCREV = "v${PV}"

inherit distutils-openplugins

do_install_append() {
  chmod 755 ${D}${libdir}/enigma2/python/Plugins/Extensions/GreekNetRadio/*.sh
}

PACKAGES =+ "${PN}-src"

FILES_${PN} = "/usr/lib/enigma2/python/Plugins/Extensions/GreekNetRadio/*"
FILES_${PN}-src = "/usr/lib/enigma2/python/Plugins/Extensions/GreekNetRadio/*.py"
