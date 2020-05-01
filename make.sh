#!/bin/bash

usage() {
	echo "Usage: $0 compiler"
	echo "Usage: $0 test <test-file>"
}

if [[ $# -lt 1 || $# -gt 2 ]]; then
	usage
	exit 1
fi

case "$1" in
	compiler)
		if [[ $# -ne 1 ]]; then
			usage
			exit 1
		fi
		rm -rf src/analysis/ src/lexer/ src/node/ src/parser/ &&
		java -jar /usr/share/java/sablecc.jar -d src/ grammar/mu.sablecc &&
		javac -cp src -d bin src/Main.java
		;;
	test)
		if [[ $# -ne 2 ]]; then
			usage
			exit 1
		fi
		java -cp bin Main "$2"
		;;
	*)
		usage
		exit 1
		;;
esac

exit 0
