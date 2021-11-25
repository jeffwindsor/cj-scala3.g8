#!/bin/bash

set -o errexit
set -o noglob
set -o nounset
set -o pipefail

cd "\$(dirname "\${0}")"

echo "node \$(node --version)"
echo "npm \$(npm --version)"
echo "npx \$(npx --version)"

npm ci
npx cdk synth
