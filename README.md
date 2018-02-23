## FileReader task by Theeruth Borisuth.

Task	Time :
The result of this program running on my 
HP OMEN 16
Windows 10 Home 64-bit

Intel(R) Core(TM) i7-6700HQ CPU @ 2.60 GHz (8 CPUs), ~2.6 GHz

Memory : 8192 MB RAM

Display : Intel (R) HD Graphic 530 / Nvidia Geforce GTX 960M


| Type of testing | Total time |
|:----------------|-----------:|
|Append 52539 chars to String|0.687198 sec|
|Append 52539 chars to StringBuilder|0.003745 sec|
|Append 52539 chars to StringBufferedReader|0.018991 sec|
## Explanation of Results

-Appending String is the slowest task because it create new String everytime there is an append event.

-Appending String using BufferedReader is on the middle because it not create but read the file only.

-Appending StringBuilder is the fastest it overwrite the old string and return.


