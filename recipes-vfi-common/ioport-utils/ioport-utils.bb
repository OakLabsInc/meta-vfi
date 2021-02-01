SUMMARY = "VFI IO Port Utilities"
DESCRIPTION = "VFI IO Port Utilities"

LICENSE = "VFI-Proprietary"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta-vfi/custom-licenses/VFI-Proprietary;md5=584dbafd52764caafdd1e104e8c1c4de"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "file://${BPN}.tar.gz"
#SRC_URI[md5sum] = "33d96c755d0a6f585bc917f08cbddf66"
#SRC_URI[sha256sum] = "e471339040cf0aa53e6d5ee5a716fdeae0a0407314f8cea78db3ad1aae2c70e0"

B = "${WORKDIR}/ioport_utils"

do_configure() {
  :
}

do_compile() {
  cd ${B}
  make
}

do_install() {
  mkdir -p ${D}/usr/bin
  DESTDIR="${D}/" make install
}

FILES_${PN} = " \
  /usr/bin/peek \
  /usr/bin/poke \
"
