#!/bin/sh

echo "********** Kill Task **********"

java -Xmx1000m -classpath .:lib_cluster/jp.jar:lib_cluster/jpc.jar:lib_cluster/karmi.jar:bin_cluster jp.lang.JavaParty kill -debug $*
