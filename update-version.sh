#!/bin/bash

echo "$1"
echo "$2"
sed -e "s/$1/$2/g" pom.xml > changed.xml
mv changed.xml pom.xml
