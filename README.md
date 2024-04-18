# PruebaLogica


Prueba Técnica - Razonamiento lógico



1. Escriba un programa que reciba como entrada un número entero n, y entregue como salida el nésimo número de Fibonacci:

2. Escriba un programa que reciba como entrada un número entero e indique si es o no un número
de Fibonacci:

3. Escriba un programa que muestres los m primeros números de Fibonacci, donde m es un número
ingresado por el usuario:


Reto 2: Multiplicación Rusa


El método de multiplicación rusa consiste en multiplicar sucesivamente por 2 el multiplicando y
dividir por 2 el multiplicador hasta que el multiplicador tome el valor 1.
Luego, se suman todos los multiplicandos correspondientes a los multiplicadores impares.
Dicha suma es el producto de los dos números. La siguiente tabla muestra el cálculo realizado para
multiplicar 37 por 12, cuyo resultado final es 12 + 48 + 384 = 444.

Desarrolle un programa que reciba como entrada el multiplicador y el multiplicando, y entregue
como resultado el producto de ambos, calculado mediante el método de multiplicación rusa.


Reto 3: Números amistosos


Un par de números m y n son llamados amistosos (o se conocen como un par amigable), si la suma
de todos los divisores de m (excluyendo a m) es igual al número n, y la suma de todos los divisores
del número n (excluyendo a n) es igual a m (con m ≠ n).
Por ejemplo, los números 220 y 284 son un par amigable porque los únicos números que dividen
de forma exacta 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, y 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 +
44 + 55 + 110 = 284

Por lo tanto, 220 es un número amistoso. Los únicos números que dividen exactamente 284 son 1,
2, 4, 71 y 142 y 1 + 2 + 4 + 71 + 142 = 220
Por lo tanto, 284 es un número amistoso.

Muchos pares de números amigables son conocidos; sin embargo, sólo uno de los pares (220, 284)
tiene valores menores que 1000. El siguiente par está en el rango [1000, 1500].
Desarrolle un programa que permita encontrar dicho par.


Reto 4: Votaciones de la CONFECH


La CONFECH, en su afán de agilizar el proceso de recuento de las votaciones, le ha encargado el
desarrollo de un programa de registro de votación por universidades.
Primero, el programa debe solicitar al usuario ingresar la cantidad de universidades que participan
en el proceso.
Luego, para cada una de las universidades, el usuario debe ingresar el nombre de la universidad y
los votos de sus alumnos, que pueden ser: aceptar (A), rechazar (R), nulo (N) o blanco (B). El término
de la votación se indica ingresando una X, tras lo cual se debe mostrar los totales de votos de la
universidad, con el formato que se muestra en el ejemplo.
Finalmente, el programa debe mostrar el resultado de la votación, indicando la cantidad de
universidades que aceptan, que rechazan y en las que hubo empate entre estas dos opciones.


Reto 5: Question Description


Sam and Kelly are programming buddies. Kelly resolves to practice more as Sam isa head initially.
They each solve a number of problems daily. Find the mínimum number or days for Kelly to have
solved more problems than Sam. If Kelly cannot surpass retum -1.

Example

SamDaily = 3

KellyDaily = 5

Difference = 5

Initially, Sam has solved difference problems more than Kelly. Each day, they solve samDaily and
kellyDaily problems each.

Day 1: samSolved = difference + samDaily = 5 + 3 = 8

kellySolved = kellyDaily = 5

Day 2: samSolved = 8 + 3 = 11

kellySolved = 5 + 5 = 10

Day 3: samSolved = 11 + 3 = 14

kellySolved = 10 + 5 = 15

Sam is 5 problems ahead of Kelly and they solve 3 and 5 problems a day. Sam will be ahead by only
3 after the first day, 1 after the second, and Kelly will pass Sam on day 3.

Function Description

Complete the function minNum in the editor below.

MinNum has the following parameter(s):

SamDaily: Number of problems Sam solves in a day

KellyDaily: Number of problems Kelly solves in a day

Difference: Number of problems Sam isa head to begin

Return

Int: the minimum number of days needed by Kelly to exceed Samm, or -1 if it is imposible
Constraints

 1 ≤ 𝑠𝑎𝑚𝐷𝑎𝑖𝑙𝑦, 𝑘𝑒𝑙𝑙𝑦𝐷𝑎𝑖𝑙𝑦 ≤ 100
 0 ≤ 𝑑𝑖𝑓𝑓𝑒𝑟𝑒𝑛𝑐𝑒 ≤ 100

Input format for Custom Testing

Input from stdin will be processed as follows and passed to the fuction.

The first line contains an integer samDaily.

The second line contains an integer kellyDaily.

The third line contains an integer ahead.

Sample Case 0

Sample Output 0

1
Sample Case 1

Sample Output 1
2


QUESTION DESCRIPTION


Consider every susequence of an array of integers.
 Sort the subsequence in increasing order.
 Determine the sum of differences of elements in the subsequence.
 Return the length of the longest subsequence where this sum is even.
We can see that the máximum posible length of a valid subsequence is 4.
Function Description
Complete the function findLongestSubsequence in the editor below.
FindLongestSubsequence has the following parameter(s):
Int arr[n]: an array of integers
Returns
Int: the length of the longest subsquence as describe
Constraints
 3 ≤ 𝑛 ≤ 105
 0 ≤ 𝑎𝑟𝑟[𝑖] ≤ 109
Input Format For Custom Testing
The first line contains an integer, n, the number of elements in arr.
Each line i of the n subsequent lines ((𝑤ℎ𝑒𝑟𝑒 0 ≤ 𝑖 < 𝑛) contaisn an integer, arr[i]
Sample Case 0
Sample Case 1
