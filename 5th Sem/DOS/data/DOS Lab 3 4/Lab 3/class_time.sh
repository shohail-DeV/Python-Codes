echo "Enter a day: "
read day

case "$day" in
    "Monday") echo "DOS class time on Monday is 10:00 AM to 11:00 AM in room C019";;
    "Tuesday") echo "DOS class time on Tuesday is 12:00 PM to 1:00 PM in room C019.";;
    "Wednesday") echo "DOS class time on Wednesday is 2:00 PM to 3:00 PM in room C019.";;
    "Thursday") echo "DOS class time on Thursday is 3:00 PM to 4:00 PM in room C019.";;
    "Friday") echo "DOS class time on Friday is 4:00 PM to 5:00 PM in room C019.";;
    "Saturday") echo "No class on Saturday.";;
    "Sunday") echo "Holiday on Sunday.";;
    *) echo "Invalid day.";;
esac
