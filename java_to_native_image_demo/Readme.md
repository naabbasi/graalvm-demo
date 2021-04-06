-H:IncludeResources=".*.xml|.*.conf" -H:+ReportUnsupportedElementsAtRuntime -H:+ReportExceptionStackTraces -H:+TraceClassInitialization


-H:+JNI --allow-incomplete-classpath -H:+JNI -H:IncludeResources=".*.xml|.*.conf" --initialize-at-build-time=org.slf4j.LoggerFactory -H:Class=edu.learn.StartApp
