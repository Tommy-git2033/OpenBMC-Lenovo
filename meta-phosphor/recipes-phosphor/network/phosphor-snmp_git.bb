SUMMARY = "SNMP Manager Configuration"
DESCRIPTION = "SNMP Manager Configuration."
HOMEPAGE = "http://github.com/openbmc/phosphor-snmp"
PR = "r1"
PV = "0.1+git${SRCPV}"

inherit autotools pkgconfig
inherit python3native
inherit obmc-phosphor-dbus-service

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI += "git://github.com/openbmc/phosphor-snmp"
SRCREV = "1334b7b3d1c65633504d9b6a096480dbcbb45ca8"

DBUS_SERVICE_${PN} += "xyz.openbmc_project.Network.SNMP.service"

DEPENDS += "systemd"
DEPENDS += "autoconf-archive-native"
DEPENDS += "sdbusplus ${PYTHON_PN}-sdbus++-native"
DEPENDS += "phosphor-dbus-interfaces"
DEPENDS += "phosphor-logging"
DEPENDS += "net-snmp"

S = "${WORKDIR}/git"
