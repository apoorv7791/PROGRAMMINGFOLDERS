#include <stdio.h>

void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}
int partition(int arr[], int low, int high)
{
    int pivot = arr[low];
    int i = low + 1;
    for (int j = low + 1; j <= high; j++)
    {
        if (arr[j] < pivot)
        {
            swap(&arr[i], &arr[j]);
            i++;
        }
    }
    swap(&arr[low], &arr[i - 1]);
    return i - 1;
}

void quicksort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pivotIndex = partition(arr, low, high);
        quicksort(arr, low, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, high);
    }
}
int main()
{
    int arr[10];
    int n;
    printf("Enter the number of elements in the array:");
    scanf("%d", &n);
    printf("Enter the elements of the array:");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    quicksort(arr, 0, n - 1);
    printf("The sorted array is: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d\n", arr[i]);
    }
}