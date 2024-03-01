if [ $# -eq 0 ]; then
    year=$(date +"%Y")
else
    year=$1
fi
if [ `expr $year % 400` -eq 0 ]; then
    echo "$year is a leap year."
else
    if [ `expr $year % 100` -eq 0 ]; then
        echo "$year is not a leap year."
    else
        if [ `expr $year % 4` -eq 0 ]; then
            echo "$year is a leap year."
        else
            echo "$year is not a leap year."
        fi
    fi
fi
