# Rail Fence Cipher

This Java program implements the Rail Fence Cipher, a simple transposition cipher for encoding text.

## Description

The Rail Fence Cipher rearranges the characters of the input text into a grid of specified rows and then reads the characters column-wise to produce the cipher text.

## How It Works

1. The program uses a fixed input text: `"meetmeinpark"`.
2. The user is prompted to enter the number of rows.
3. The number of columns is calculated, and a 2D grid is created and filled with the input text row-wise.
4. The grid is read column-wise to produce the cipher text.

## Example

For the input text "meetmeinpark" and 3 rows, the grid would look like:

m e e t
m e i n
p a r k
Reading column-wise, the cipher text would be: `mmp eaee trnk`.
