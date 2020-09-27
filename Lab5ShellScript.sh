#!/bin/sh
wget https://raw.githubusercontent.com/myarmolinsky/CISC-3140/master/Pokemon.csv
head Pokemon.csv.10
wc -l Pokemon.csv.10
awk -F "," '{print $2" " $7" " $8}' Pokemon.csv.10
# extracted the second, seventh, and eighth columns
sort -k 2 -t , Pokemon.csv.10 > sorted.txt
# sort the second column alphabetically
cat sorted.txt