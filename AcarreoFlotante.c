//Wilberth Gamboa
#include <stdio.h>

int main(){

    printf("Comparar 2.3-1.3==1\n");

    if (2.3-1.3==1)
    {
        printf("verdadero\n");
        /* code */
    }else{
        printf("falso\n");
    }
    printf("\n");
    printf("Comparar 2.3-1.3==1.0\n");

    
    if (2.3-1.3==1.0)
    {
        printf("verdadero\n");
        /* code */
    }else{
        printf("falso\n");
    }
printf("\n");
     printf("Comparar (float)2.3-(float)1.3==1\n");

    
    if ((float)2.3-(float)1.3==1)
    {
        printf("verdadero\n");
        /* code */
    }else{
        printf("falso\n");
    }

printf("\n");

       
    printf("Comparar (float)2.3-(float)1.3==1.0\n");

    
    if ((float)2.3-(float)1.3==1.0)
    {
        printf("verdadero\n");
        /* code */
    }else{
        printf("falso\n");
    }
printf("\n");
    float x = 2.3-1.3;
    float y = (float)2.3-(float)1.3;

    printf("valor de 2.3-1.3 = %f\n",&x);
    printf("valor de (float)2.3-(float)1.3 = %f\n",&y);
    return 0;
}