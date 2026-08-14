#!/bin/bash
# compile.sh - Compile all Java files in a directory

if [ -z "$1" ]; then
    echo "Usage: ./scripts/compile.sh <directory>"
    echo "Examples:"
    echo "  ./scripts/compile.sh 01-funda/clients/"
    echo "  ./scripts/compile.sh 01-funda/code/"
    exit 1
fi

DIR="$1"
# Remove trailing slash if present
DIR="${DIR%/}"

echo "📦 Compiling all Java files in $DIR/..."

# Check if javac-algs4 exists
if ! command -v javac-algs4 &> /dev/null; then
    echo "🔧 Using standard javac with manual classpath..."
    # FIXED: Correct classpath for your structure
    javac -cp ".;/lib/algs4.jar" "$DIR"/*.java
    #javac -cp ".:../lib/algs4.jar:../lib/stdlib.jar:01-funda/code" 01-funda/clients/*.java
else
    echo "🔧 Using javac-algs4..."
    javac-algs4 "$DIR"/*.java
fi

if [ $? -eq 0 ]; then
    echo "✅ Success: All .class files created in $DIR/"
    echo "📄 Class files:"
    ls -la "$DIR"/*.class 2>/dev/null || echo "   No .class files found"
else
    echo "❌ Compilation failed"
    exit 1
fi