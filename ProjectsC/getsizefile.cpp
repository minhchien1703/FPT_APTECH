#include <stdio.h>
#include <stdlib.h>

int getFileSize(const char *filename) {
    FILE *file = fopen(filename, "rb"); // M? t?p v?i mode "rb" (�?c nh? ph�n)
    int size = 0;

    if (file == NULL) {
        printf("Khong the mo file.\n");
        exit(EXIT_FAILURE);
    }

    fseek(file, 0, SEEK_END); // ��a con tr? t?p v? cu?i t?p
    size = ftell(file);       // L?y v? tr� con tr?, t?c l� k�ch th�?c c?a t?p
    fclose(file);             // ��ng t?p

    return size;
}

int main() {
    const char *filename = "student_info.txt";
    int initialSize, currentSize;

    initialSize = getFileSize(filename);

    // Th?c hi?n c�c thao t�c ghi v�o t?p tin ? ��y...

    // Sau khi th?c hi?n c�c thao t�c ghi v�o t?p tin, ki?m tra k�ch th�?c c?a t?p tin
    currentSize = getFileSize(filename);

    // So s�nh k�ch th�?c hi?n t?i v?i k�ch th�?c ban �?u
    if (currentSize > initialSize) {
        printf("Tep tin %s da thay doi.\n", filename);
    } else {
        printf("Tep tin %s khong thay doi.\n", filename);
    }

    return 0;
}

