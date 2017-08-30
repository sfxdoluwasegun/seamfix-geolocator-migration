@echo off
if not exist target mkdir target
if not exist target\classes mkdir target\classes

set PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_131\bin;C:\Windows\Microsoft.NET\Framework64\v4.0.30319

echo compile classes
javac -nowarn -d target\classes -sourcepath jvm -cp "c:\users\charles\downloads\compressed\jni4net-0.8.6.0-bin\lib\jni4net.j-0.8.6.0.jar"; "jvm\clocation\Coordinate.java" "jvm\clocation\Location.java" "jvm\clocation\Response.java" 
IF %ERRORLEVEL% NEQ 0 goto end


echo CLocation.j4n.jar 
jar cvf CLocation.j4n.jar  -C target\classes "clocation\Coordinate.class"  -C target\classes "clocation\Location.class"  -C target\classes "clocation\Response.class"  > nul 
IF %ERRORLEVEL% NEQ 0 goto end


echo CLocation.j4n.dll 
csc /nologo /warn:0 /t:library /out:CLocation.j4n.dll /recurse:clr\*.cs  /reference:"C:\Users\Charles\Documents\Visual Studio 2015\Projects\CLocation\CLocation\bin\Debug\CLocation.dll" /reference:"C:\Users\Charles\Downloads\Compressed\jni4net-0.8.6.0-bin\lib\jni4net.n-0.8.6.0.dll"
IF %ERRORLEVEL% NEQ 0 goto end


:end
