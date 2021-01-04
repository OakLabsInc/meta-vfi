FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " \
    file://docker.scc \
    file://ir-remote.scc \
    file://snd-pcsp.scc \
    file://hid-multitouch.scc \
    file://r8169.cfg \
    file://wifi.cfg \
    file://androidFragment.cfg \
    file://USBSerial.cfg \
"
#    file://ath10k.cfg 

KERNEL_EXTRA_FEATURES_append = " \
    features/leds/leds.scc \
    features/mei/amt.scc \
"

FILESEXTRAPATHS_prepend := "${THISDIR}/4.19:"

SRC_URI =+ "\
    file://tpmKernelOptions.cfg \
    file://dmabuff.cfg \
"

#LINUX_VERSION_EXTENSION = "-verifone"
PR = "r1"
#PV = "${LINUX_VERSION}-verifone"


#ROOTFS_POSTPROCESS_COMMAND += "clobber_unused"
#clobber_unused () {
#        rm ${IMAGE_ROOTFS}/boot/*
#}


#PROVIDES_${PN} += "linux-intel-initramfs-bundle"
#RPROVIDES_${PN} += "linux-intel-initramfs-bundle"
#PACKAGES += "linux-intel-initramfs-bundle"
#FILES_linux-intel-initramfs-bundle += "/boot/bzImage.initramfs"
#do_bundle_initramfs_append() {
#
#    # required to build oak-image: bitbake linux-intel && bitbake oak-image
#    echo "install -m 0644 ${KERNEL_OUTPUT_DIR}/$imageType.initramfs ${D}/boot/${KERNEL_IMAGETYPE}.initramfs"
#    install -m 0644 ${KERNEL_OUTPUT_DIR}/$imageType.initramfs ${D}/boot/${KERNEL_IMAGETYPE}.initramfs
#
#    echo "install -m 0644 ${KERNEL_OUTPUT_DIR}/$imageType.initramfs ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.initramfs"
#    install -m 0644 ${KERNEL_OUTPUT_DIR}/$imageType.initramfs ${D}/${KERNEL_IMAGEDEST}/${KERNEL_IMAGETYPE}.initramfs
#
#}

#do_package[nostamp] = "1"
#do_packagedata[nostamp] = "1"
#do_package_write_ipk[nostamp] = "1"
#do_package_qa[nostamp] = "1"

module_conf_i915 = "option i915 modeset=1"
KERNEL_MODULE_PROBECONF += "i915 iwlwifi iwlmvm snd-hda-intel"

#module_conf_iwlwifi = "option iwlwifi power_scheme=1"
module_conf_iwlmvm = "options iwlmvm power_scheme=1"
