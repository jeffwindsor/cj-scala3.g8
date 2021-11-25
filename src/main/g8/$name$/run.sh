#!/bin/bash
set -o errexit
set -o noglob
set -o nounset
set -o pipefail

cd "\$(dirname "\${0}")"

java -jar $name$.jar
