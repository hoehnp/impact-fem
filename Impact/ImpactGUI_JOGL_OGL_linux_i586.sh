#!/bin/sh
export LD_LIBRARY_PATH=lib_j3d/linux_i586:lib
java -Xmx1000m -Xss1m -cp .:bin:doc:lib/jogl.jar:lib/gluegen-rt.jar:lib/patbinfree153.jar:lib_j3d/j3dcore.jar:lib_j3d/j3dutils.jar:lib_j3d/vecmath.jar:lib/LogDB.jar:lib/mysql-connector-java-5.1.11-bin.jar -Djava.library.path="lib_j3d/linux_i586":"lib" gui.ImpactGUI -opengl 
