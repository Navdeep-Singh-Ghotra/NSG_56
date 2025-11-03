#!/bin/bash
# Enhanced compile script using javac-algs4

if [ -z "$1" ]; then
    echo "Usage: ./scripts/compile.sh <java-file>"
    echo "Examples:"
    echo "  ./scripts/compile.sh algorithms/week1/ThreeSum.java"
    echo "  ./scripts/compile.sh tests/TestBinarySearch.java"
    exit 1
fi

JAVA_FILE="$1"
CLASS_NAME=$(basename "$JAVA_FILE" .java)
DIR=$(dirname "$JAVA_FILE")

echo "📦 Compiling $JAVA_FILE..."
echo "📁 Directory: $DIR"
echo "🎯 Class: $CLASS_NAME"

# Check if javac-algs4 exists
if ! command -v javac-algs4 &> /dev/null; then
    echo "❌ javac-algs4 not found. Using standard javac with manual classpath..."
    javac -cp .:../lib/algs4.jar "$JAVA_FILE"
else
    echo "🔧 Using javac-algs4..."
    javac-algs4 "$JAVA_FILE"
fi

if [ $? -eq 0 ]; then
    echo "✅ Success: $CLASS_NAME.class created"
    echo "💡 Run with: ./scripts/run.sh $DIR/$CLASS_NAME"
    
    # Show where the .class file was created
    if [ -f "$DIR/$CLASS_NAME.class" ]; then
        echo "📄 Class file: $DIR/$CLASS_NAME.class"
    fi
else
    echo "❌ Compilation failed"
    exit 1
fi