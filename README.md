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