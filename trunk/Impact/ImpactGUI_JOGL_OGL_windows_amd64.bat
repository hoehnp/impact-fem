@echo off

set CP=.
set CP=%CP%;bin
set CP=%CP%;doc
set CP=%CP%;lib\jogl.jar
set CP=%CP%;lib\gluegen-rt.jar
set CP=%CP%;lib\LogDB.jar
set CP=%CP%;lib\mysql-connector-java-5.1.11-bin.jar
set CP=%CP%;lib\patbinfree153.jar
set CP=%CP%;lib_j3d\j3dcore.jar
set CP=%CP%;lib_j3d\j3dutils.jar
set CP=%CP%;lib_j3d\vecmath.jar

@echo on

java -Xmx1000m -Xss1m -classpath %CP% -Djava.library.path="lib_j3d\windows_amd64";"lib" gui.ImpactGUI -opengl