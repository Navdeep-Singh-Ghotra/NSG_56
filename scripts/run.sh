#!/bin/bash
# Enhanced run script using java-algs4

if [ -z "$1" ]; then
    echo "Usage: ./scripts/run.sh <class-name> [data-file]"
    echo "Examples:"
    echo "  ./scripts/run.sh algorithms/week1/ThreeSum"
    echo "  ./scripts/run.sh algorithms/week1/ThreeSum ../data/tiny/1Kints.txt"
    echo "  ./scripts/run.sh tests/TestBinarySearch"
    exit 1
fi

CLASS_NAME="$1"
DATA_FILE="${2:-}"

echo "🚀 Running $CLASS_NAME..."

# Check if java-algs4 exists
if ! command -v java-algs4 &> /dev/null; then
    echo "❌ java-algs4 not found. Using standard java with manual classpath..."
    if [ -z "$DATA_FILE" ]; then
        java -cp .:../lib/algs4.jar "$CLASS_NAME"
    else
        java -cp .:../lib/algs4.jar "$CLASS_NAME" "$DATA_FILE"
    fi
else
    echo "🔧 Using java-algs4..."
    if [ -z "$DATA_FILE" ]; then
        java-algs4 "$CLASS_NAME"
    else
        java-algs4 "$CLASS_NAME" "$DATA_FILE"
    fi
fi