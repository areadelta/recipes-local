DESCRIPTION = "Livestreamer is CLI program that extracts streams \
	from various services and pipes them into a video player of choice."
HOMEPAGE = "http://livestreamer.tanuki.se/en/latest/"
SECTION = "devel/python"
LICENSE = "BSD"

RDEPENDS_${PN} = "python \
	python-ctypes \
	python-misc \
	python-pkgutil \
	python-requests \
	python-shell \
	python-subprocess \
	"

PR = "r0"

SRC_URI = "git://github.com/chrippa/livestreamer;protocol=git"

S = "${WORKDIR}/git/"

SRCREV = "v${PV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a0115bc94fa1ea2d60ee05a71582adaf"

inherit setuptools

do_install_append() {
   rm -rf ${D}${bindir}
   rm -rf ${D}${libdir}/python2.7/site-packages/livestreamer_cli
}

FILES_${PN} = " \
	${libdir}/python2.7/site-packages/livestreamer/*.pyo \
	${libdir}/python2.7/site-packages/livestreamer/*/*.pyo \
	${libdir}/python2.7/site-packages/livestreamer/*/*/*.pyo \
	${libdir}/python2.7/site-packages/livestreamer-${PV}-py2.7.egg-info/* \
	"

PACKAGES =+ "${PN}-src"

FILES_${PN}-src = " \
	${libdir}/python2.7/site-packages/livestreamer/*.py \
	${libdir}/python2.7/site-packages/livestreamer/*/*.py \
	${libdir}/python2.7/site-packages/livestreamer/*/*/*.py \
	"

