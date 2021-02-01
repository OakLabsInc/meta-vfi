SUMMARY = "TTF FreeFont for X"
DESCRIPTION = "TTF FreeFont for X"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${WORKDIR}/freefont-${PV}/COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "https://ftp.gnu.org/gnu/freefont/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33d96c755d0a6f585bc917f08cbddf66"
SRC_URI[sha256sum] = "e471339040cf0aa53e6d5ee5a716fdeae0a0407314f8cea78db3ad1aae2c70e0"

do_configure() {
  :
}

do_compile() {
  :
}

do_install() {
  mkdir -p ${D}/usr/share/fonts/ttf/
  install ${WORKDIR}/freefont-${PV}/*.ttf ${D}/usr/share/fonts/ttf/
}

FILES_${PN} = "\ 
  /usr/share/fonts/ttf/FreeSans.ttf \
  /usr/share/fonts/ttf/FreeSerifBoldItalic.ttf \
  /usr/share/fonts/ttf/FreeSerifBold.ttf \
  /usr/share/fonts/ttf/FreeMonoOblique.ttf \
  /usr/share/fonts/ttf/FreeSansBold.ttf \
  /usr/share/fonts/ttf/FreeSerif.ttf \
  /usr/share/fonts/ttf/FreeMonoBoldOblique.ttf \
  /usr/share/fonts/ttf/FreeMono.ttf \
  /usr/share/fonts/ttf/FreeSansOblique.ttf \
  /usr/share/fonts/ttf/FreeSansBoldOblique.ttf \
  /usr/share/fonts/ttf/FreeMonoBold.ttf \
  /usr/share/fonts/ttf/FreeSerifItalic.ttf \
"
