#!/bin/bash
# run.sh - Simple run script

if [ -z "$1" ]; then
    echo "Usage: ./scripts/run.sh <class-name> [data-file]"
    echo "Example: ./scripts/run.sh SocialNetwork src/01-funda/data/socialNetwork.txt"
    exit 1
fi

CLASS_NAME="$1"
DATA_FILE="${2:-}"

# Get project root
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(dirname "$SCRIPT_DIR")"

echo "🚀 Running $CLASS_NAME..."

# Force standard java (ignore java-algs4)
if [ -z "$DATA_FILE" ]; then
    java -cp "$PROJECT_ROOT/lib/algs4.jar:$PROJECT_ROOT/src/01-funda/code:$PROJECT_ROOT/src/01-funda/clients" "$CLASS_NAME"
else
    if [[ "$DATA_FILE" != /* ]]; then
        DATA_FILE="$PROJECT_ROOT/$DATA_FILE"
    fi
    java -cp "$PROJECT_ROOT/lib/algs4.jar:$PROJECT_ROOT/src/01-funda/code:$PROJECT_ROOT/src/01-funda/clients" "$CLASS_NAME" "$DATA_FILE"
fi