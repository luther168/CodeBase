@echo off

set var=
set /p var=Please input the name of variable(default is Path): 
if not defined var (
set var="Path"
)
echo %var%

set path=
set /p path=Please input the name of path(default is current directory): 
if not defined path (
set path=%~dp0
)
echo %path%

pause