#!/bin/sh

APP_HOME=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)

if [ -x "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" ]; then
    exec java -classpath "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
fi

echo "Gradle wrapper JAR is missing."
echo "Please run 'gradle wrapper' once to generate the wrapper files."
exit 1
