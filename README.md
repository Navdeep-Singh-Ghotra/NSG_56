## NSG_56

Algo practice from princeton

####
Chapter 1
######
1. Write a code fragment that puts the binary representation of a positive integer N
into a String s.
<details>
<summary> Solution</summary>

```
String s = "";
for (int n = N; n > 0; n /= 2) {
    s = (n % 2) + s;
}
```
</details>

######
2. Write a code fragment that prints the contents of a two-dimensional boolean
array, using * to represent true and a space to represent false. Include row and column
numbers.
<details>
<summary> Solution</summary>

```

```
</details>

######
3. Write a code fragment to print the transposition (rows and columns changed) of a two-dimensional array with M rows and N columns.
<details>
<summary> Solution</summary>

```

```
</details>

######
4. Write a static method lg() that takes an int value N as argument and returns the largest int not larger than the base-2 logarithm of N. Do not use Math
numbers.
<details>
<summary> Solution</summary>

```

```
</details>

######
5. Write a static method histogram() that takes an array a[] of int values and
an integer M as arguments and returns an array of length M whose ith entry is the num-
ber of times the integer i appeared in the argument array. If the values in a[] are all
between 0 and M–1, the sum of the values in the returned array should be equal to
a.length.
<details>
<summary> Solution</summary>

```

```
</details>
