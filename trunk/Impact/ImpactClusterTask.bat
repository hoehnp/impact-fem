@echo off

set CP=.
set CP=%CP%;lib_cluster\jp.jar
set CP=%CP%;lib_cluster\jpc.jar
set CP=%CP%;lib_cluster\karmi.jar
set CP=%CP%;bin_cluster

echo ********** Start Task **********

java -Xmx1000m -classpath %CP% jp.lang.JavaParty exec run.Impact %*

pause