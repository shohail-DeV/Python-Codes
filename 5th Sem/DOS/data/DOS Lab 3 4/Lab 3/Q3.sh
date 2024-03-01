echo "Enter Ramesh's base salary:"
read salary
da=$((salary * 40 / 100))
hra=$((salary * 20 / 100))
gross=$((salary + da + hra))
echo "Ramesh's gross salary(base + da + hra): $gross"
