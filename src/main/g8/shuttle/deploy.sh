#!/bin/bash
set -o errexit
set -o noglob
set -o nounset
set -o pipefail

cd "\$(dirname "\${0}")"

# execute a development / lab deploy
if [[ "\$SHUTTLE_ENV_NAME" == "dev" ]]; then
    ../deploy.sh

# execute a production deploy
# ** make sure you have added this to code audit prior to uncommenting lines below **
#elif [[ "\$SHUTTLE_ENV_NAME" == "prod" ]]; then
#    ../deploy.sh

else
    echo "==> Unknown Deploy Environment: \$SHUTTLE_ENV_NAME"
    exit 1
fi