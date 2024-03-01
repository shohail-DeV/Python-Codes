if [ $# -ne 2 ]; then
    echo "Usage: filechk <filename1> <filename2>"
    exit 1
fi
filename1=$1
filename2=$2
cmp -s "$filename1" "$filename2"
if [ $? -eq 0 ]; then
    rm -i "$filename2"
    echo "So $filename2 is deleted."
else
    echo "Files $filename1 and $filename2 have different content."
fi
