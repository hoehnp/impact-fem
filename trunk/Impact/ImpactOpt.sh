#!/bin/sh
java -server -Xmx1000m -Xss1m -cp .:$CLASSPATH:doc:bin run.ImpactOpt $*
