# P.S. 'chmod +x FILENAME.sh' выполнить в терминале для предоставления доступа до новых баш-скриптов

# Баш-скрипт для компиляции и выполнения джава-класса
# @param - имя класса в указанных директориях
if [ -n "$1" ]
then
    javac Jcore/lessons/$1'.java';
    java -cp "Jcore" lessons.$1;
else
    echo "Enter class name."
fi