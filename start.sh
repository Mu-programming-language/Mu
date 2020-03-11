#!/bin/bash

rm -rf src/analysis src/lexer src/node src/parser
java -jar /usr/share/java/sablecc.jar -d src grammar/mu.sablecc
javac -cp src -d bin src/Main.java
java -cp bin Main
