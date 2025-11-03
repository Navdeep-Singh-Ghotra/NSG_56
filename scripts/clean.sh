#!/bin/bash
# Clean up all .class files

echo "🧹 Cleaning up compiled classes..."

find . -name "*.class" -type f -delete

if [ $? -eq 0 ]; then
    echo "✅ All .class files removed"
else
    echo "❌ Failed to clean some files"
fi