# Lab5

Lab5 repository consists of three text files and two images to accomplish the three tasks of Lab 5.

* Lab5Log.txt has Linux commands to download a CSV file, look at the first couple of lines of the CSV file, get the number of total lines in the file, extract the second, seventh, and eighth columns, and sort the second column alphabetically.
* Lab5ShellScript.sh has the Linux commands of Lab5Log.txt in a shell script. 
* Lab5Task3.txt has the Linux commands to download a image and then negate the image through ImageMagick. 
* Linux-bsd.gif is the image that was downloaded in Lab5Task3.txt.
* Linux-bsdnegate.gif is the new modified image that was negated.

## Usage

Lab5Log.txt and Lab5ShellScript.sh 

```python
wget https://raw.githubusercontent.com/myarmolinsky/CISC-3140/master/Pokemon.csv
head Pokemon.csv.10
wc -l Pokemon.csv.10
awk -F "," '{print $2" " $7" " $8}' Pokemon.csv.10
# extracted the second, seventh, and eighth columns
sort -k 2 -t , Pokemon.csv.10 > sorted.txt
# sort the second column alphabetically
```

Lab5Task3.txt

```python
wget https://www.electrictoolbox.com/images/icons/linux-bsd.gif
convert -negate linux-bsd.gif linux-bsdnegate.gif
```
