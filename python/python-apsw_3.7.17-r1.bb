DESCRIPTION = "Another Python SQLite Wrapper"
HOMEPAGE = "https://code.google.com/p/apsw/"
DEPENDS = "sqlite3"
LICENSE = "Libpng"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=9a1ca3283c0390f7cca24fc1cbe71de0"
PR = "0"

SRC_URI = "http://apsw.googlecode.com/files/apsw-${PV}.zip"

SRC_URI[md5sum] = "5393765e7ef55def11dae08149133136"
SRC_URI[sha256sum] = "4e58472b6adff5aec9830ae209d65815d0d6ca74878d6cfed7becbbadec096b7"

S = "${WORKDIR}/apsw-${PV}"

#inherit setuptools
inherit autotools distutils

BBCLASSEXTEND = "native"

