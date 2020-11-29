/*Interchange largest and smallest values (Id-2705)

Given N distinct integer values, the program must swap the position of the largest and smallest integer values.

Input Format:
The first line will contain the value of N
The second line will contain N integer values separated by one or more spaces.

Output Format:
The first line will contain the N integer values (with the largest and smallest integer values swapped) separated by a space.

Constraints:
2 <= N <= 25

Example Input/Output 1:
Input:
2
50 100

Output:
100 50

Example Input/Output 2:
Input:
10
3 6 10 21 90 4 9001 89 43 333

Output:
9001 6 10 21 90 4 3 89 43 333
*/


import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int arr[] = new int[N];
    for(int i=0;i<N;i++){
      arr[i]= scan.nextInt();
    }
    int mini= -1000;
    int maxi = 1000;
    for(int i=0;i<N;i++){
      if(mini<arr[i]){
        mini=arr[i];
      }
    }
    for(int i=0;i<N;i++){
      if(maxi>arr[i]){
        maxi=arr[i];
      }
    }
    for(int i=0;i<N;i++){
      if(arr[i]==mini)System.out.print(maxi+" ");
      if(arr[i]==maxi)System.out.print(mini+" ");
      if(arr[i]!=maxi && arr[i]!=mini)System.out.print(arr[i]+" ");
    }
  }
}
