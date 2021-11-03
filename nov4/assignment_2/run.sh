#!/bin/sh

if [ -f ./assignment_2.jar ]
then
    java -jar assignment_1.jar
else
    echo "run 'make' first"
fi
