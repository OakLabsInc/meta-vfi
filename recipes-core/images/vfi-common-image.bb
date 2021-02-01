SUMMARY = "VFI Common OS Image"

inherit core-image

IMAGE_LINGUAS = "en-us"
IMAGE_FEATURES += "ssh-server-openssh package-management x11 x11-base"
GLIBC_GENERATE_LOCALES = "en_US.UTF-8"

# syslinux configuration, see image-live.bbclass and syslinux.bbclass
LABELS_LIVE = "install"
AUTO_SYSLINUXMENU = "0"
NOISO = "1"

# timeout is in units of 1/10 of a second. bizarre.
# holding Shift or Alt during boot will enable the prompt.
SYSLINUX_TIMEOUT = "10"
SYSLINUX_PROMPT = "0"
SYSLINUX_SPLASH = ""
APPEND = "quiet"

EXTRA_IMAGE_FEATURES += " \
  package-management \
  empty-root-password \
  ssh-server-openssh \
  x11 \
  x11-base \
"

# FIX ?? may not be needed on the FS
#  libpthread-stubs
#  xtrans

# causing issues with rsyslog ( which is what VFI uses )
#  packagegroup-core-full-cmdline

IMAGE_INSTALL = " \
  packagegroup-core-selinux \
  procps \
  psmisc \
  grep \
  tar \
  less \
  iptables \
  logrotate \
  cronie \
  iptables \
  logrotate \
  consolekit \
  acl \
  at-spi2-atk \
  at-spi2-core \
  atk \
  attr \
  audiofile \
  audit \
  bash \
  bzip2 \
  cairo \
  db \
  dbus \
  dbus-glib \
  diffutils \
  dmidecode \
  e2fsprogs \
  evtest \
  expat \
  libfftw \
  findutils \
  flac \
  font-alias \
  font-cursor-misc \
  font-util \
  fontconfig \
  freetype \
  gawk \
  gdk-pixbuf \
  giflib \
  glib-2.0 \
  gmp \
  grep \
  gtk+3 \
  gzip \
  harfbuzz \
  i2c-tools \
  inotify-tools \
  iptables \
  iputils \
  kmod \
  libice \
  libsm \
  libx11 \
  libxscrnsaver \
  libxau \
  libxcomposite \
  libxcursor \
  libxdamage \
  libxdmcp \
  libxext \
  libxfixes \
  libxfont \
  libxfont2 \
  libxi \
  libxinerama \
  libxmu \
  libxpm \
  libxrandr \
  libxrender \
  libxt \
  libxtst \
  libxxf86vm \
  libcap \
  libdrm \
  libestr \
  libevdev \
  libevdev \
  libfastjson \
  libffi \
  libfontenc \
  libinput \
  libjpeg-turbo \
  liblogging \
  libogg \
  libpcap \
  libpciaccess \
  libpng \
  libsamplerate0 \
  libselinux \
  libsemanage \
  libsndfile1 \
  libtool \
  libusb1 \
  libusb-compat \
  libvorbis \
  libxcb \
  libxkbfile \
  libxml2 \
  libxshmfence \
  lsof \
  matchbox-wm \
  mingetty \
  libmpc \
  mpfr \
  mtdev \
  ncurses \
  net-tools \
  ntp \
  openssh \
  openssl \
  libpam \
  pango \
  pciutils \
  pixman \
  policycoreutils \
  popt \
  procps \
  psmisc \
  readline \
  rng-tools \
  rsyslog \
  sed \
  setserial \
  shadow \
  smartmontools \
  sox \
  speex \
  sqlite3 \
  strace \
  sudo \
  sysfsutils \
  sysstat \
  sysvinit \
  tar \
  tcp-wrappers \
  traceroute \
  tzdata \
  udev-extraconf \
  usbutils \
  util-linux \
  vim \
  which \
  x11vnc \
  xf86-input-keyboard \
  xf86-input-libinput \
  xf86-input-mouse \
  xf86-video-fbdev \
  xf86-video-vesa \
  xinit \
  xinput \
  xkbcomp \
  xkeyboard-config \
  xrandr \
  xscreensaver \
  xserver-xorg \
  zlib \
  gdbserver \
  freefont-ttf \
  ioport-utils \
"

IMAGE_INSTALL_remove = "\
  busybox \
  pulseaudio \
"

