#include <stdio.h>
void writeToFile()
{
    FILE *fp = fopen("data.txt", "w");
    if (fp == NULL)
        return;
    fprintf(fp, "Sample Data\n");
    fclose(fp);
    char path[1024];
    snprintf(path, sizeof(path), "%s%s%s", getenv("USERPROFILE"), "\\Desktop\\", "data.txt");
    FILE *fp2 = fopen(path, "w");
    if (fp2 != NULL)
    {
        fprintf(fp2, "Sample Data\n");
        fclose(fp2);
    }
}

int main()
{
    writeToFile();
    return 0;
}