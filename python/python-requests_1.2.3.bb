DESCRIPTION = "Requests: HTTP for Humans"
HOMEPAGE = "http://docs.python-requests.org/en/latest/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"

RDEPENDS_${PN} = "python \
	python-codecs \
	python-compression \
	python-io \
	python-json \
	python-zlib \
	"

PR = "r3"

SRC_URI = "git://github.com/kennethreitz/requests;protocol=git"

S = "${WORKDIR}/git/"

SRCREV = "v${PV}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=c858703330162aa799141655a10fe120"

inherit setuptools

do_install_append() {
  rm -f ${D}${libdir}/python*/site-packages/site.py*
}

PACKAGES =+ "${PN}-src"

FILES_${PN}-src = "\
	/usr/lib/python2.7/site-packages/requests/*.py \
	/usr/lib/python2.7/site-packages/requests/*/*.py \
	/usr/lib/python2.7/site-packages/requests/*/*/*.py \
	/usr/lib/python2.7/site-packages/requests/*/*/*/*.py \
        "

