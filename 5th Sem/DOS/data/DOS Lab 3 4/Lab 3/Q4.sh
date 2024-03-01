echo "Enter a five digit number: "
read number
if [ ${#number} -ne 5 ]; then
    echo "Invalid input."
    exit 1
fi
sum=0
for (( i=0; i<${#number}; i++ )); do
    sum=$(( $sum + $(echo ${number:i:1}) ))
done
echo "The sum of digits of $number is $sum"
