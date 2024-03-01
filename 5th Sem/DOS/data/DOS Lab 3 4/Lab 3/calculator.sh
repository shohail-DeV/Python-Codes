if [ $# -ne 3 ]; then
    echo "Usage: calculator <operand1> <operator> <operand2>"
    exit 1
fi
operand1=$1
operator=$2
operand2=$3
case "$operator" in
    "+")
        result=$(echo "$operand1 + $operand2" | bc)
        ;;
    "-")
        result=$(echo "$operand1 - $operand2" | bc)
        ;;
    "x")
        result=$(echo "$operand1 * $operand2" | bc)
        ;;
    "/")
        result=$(echo "$operand1 / $operand2" | bc)
        ;;
    "%")
        result=$(echo "$operand1 % $operand2" | bc)
        ;;
    "^")
        result=$(echo "$operand1 ^ $operand2" | bc)
        ;;
    *)
        echo "Invalid operator."
        exit 1
        ;;
esac
echo "$operand1 $operator $operand2 = $result"
