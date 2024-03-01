echo "Enter the cost price: "
read cost_price
echo "Enter the selling price: "
read selling_price
profit_loss=$(( $selling_price - $cost_price ))
if [ $profit_loss -gt 0 ]; then
    echo "The seller has made a profit of $profit_loss."
else
    echo "The seller has incurred a loss of $profit_loss."
fi
