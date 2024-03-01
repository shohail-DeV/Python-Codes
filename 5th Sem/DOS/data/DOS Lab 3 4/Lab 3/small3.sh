smallest=$1
for i in $(seq 2 3); do
    n=${!i}
    if [ $n -lt $smallest ]; then
        smallest=$n
    fi
done
echo "Smallest number is: $smallest"
