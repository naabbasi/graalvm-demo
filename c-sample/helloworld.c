#include <stdio.h>

void printHello() {
    printf("=================== C Language ===================");
    FILE *f = fopen("file.txt", "w");

    if (f == NULL) {
            printf("Error opening file!\n");
    } else {
        const char *text = "world";
        fprintf(f, "Hello: %s\n", text);
        fclose(f);
    }
}