#!/bin/bash
set -e
(cd ../commons-vscode ; npm install)
npm install ../commons-vscode
../mvnw -f ../pom.xml -pl vscode-manifest-yaml -am clean package