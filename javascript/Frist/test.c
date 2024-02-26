#include <stdio.h>

int main(){
    int key,arr[10];
    arr[0] = 1;
    arr[1] = 3;
    arr[2] = 5;
    arr[3] = 7;
    arr[4] = 9;

    scanf("%d", &key);
    int n = 10;
    for(int j = 0; j < n; j++){
        if (arr[j]> key){
            arr[j+1] = arr[j];
            
            arr[j] = key;
            break;
    }
}
printf("%d", arr[0]);
printf("%d", arr[1]);
printf("%d", arr[2]);
printf("%d", arr[3]);
printf("%d", arr[4]);
printf("%d", arr[5]);
}