# P.S. 'chmod +x FILENAME.sh' выполнить в терминале для предоставления доступа до новых баш-скриптов

# Баш-скрипт для компиляции и выполнения джава-класса
# @1 - имя пэкеджа
# @2 - имя класса в указанных директориях

package=$1
className=$2

if [ -z $2 ]
then
    echo "Example for launching: 'sh run.sh package className'"
    exit
fi

javac lessons/$package/$className.java
java lessons.$package.$className
exit