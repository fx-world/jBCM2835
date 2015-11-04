## create shared library 
gcc -shared -Wl,-soname,libmean.so.1 -o libmean.so.1.0.1  calc_mean.o