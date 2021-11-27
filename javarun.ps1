javac $args[0]
$args[0] -match "(.\?<program_name>.*).java"
java $matches['program_name']