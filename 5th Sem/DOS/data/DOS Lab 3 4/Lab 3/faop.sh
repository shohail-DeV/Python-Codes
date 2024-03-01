echo "Enter a:"
read a
echo "Enter b:"
read b
result=$(echo "$a + $b" | bc)
echo "a + b : $result"
result=$(echo "$a - $b" | bc)
echo "a - b : $result"
result=$(echo "$a * $b" | bc)
echo "a * b : $result"
result=$(echo "$a / $b" | bc)
echo "a / b : $result"
result=$(echo "$a % $b" | bc)
echo "a % b : $result"
