set JAVA_HOME=E:\Java\graalvm-ce-java11-21.0.0.2
set GRAALVM_HOME=E:\Java\graalvm-ce-java11-21.0.0.2

call "C:\Progra~2\Microsoft Visual Studio\2019\Enterprise\VC\Auxiliary\Build\vcvars64.bat"

mvn clean package -DskipTests=true
