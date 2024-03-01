echo "Enter internal mark: "
read internal_mark
echo "Enter percentage in attendance: "
read percentage_in_attendance
if [ $internal_mark -ge 20 ] && [ $percentage_in_attendance -ge 75 ]; then
    echo "Allowed for Semester"
else
    echo "Not allowed in Semester"
fi
