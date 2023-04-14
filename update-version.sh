#!/bin/bash

sed -e "s/$1/$2/g" pom.xml > pom.xml
