javac $args[0]
$args[0] -match "(.\?<program_name>.*).java" | out-null
java $matches['program_name']