echo "Enter a character: "
read character
case "$character" in
    [[:lower:]]) echo "You entered a lower case alphabet.";;
    [[:upper:]]) echo "You entered an upper case alphabet.";;
    [[:digit:]]) echo "You have entered a digit.";;
    [[:punct:]]) echo "You have entered a special symbol.";;
    *) echo "You have entered more than one character.";;
esac
