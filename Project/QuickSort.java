class QuickSort
{
    int partition(int a[], int low, int high)
    {
        int pivot = a[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
          
            // If current element is smaller than or equal to pivot
            if (a[j] <= pivot)
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }


    /*  a[] --> Array to be sorted,
        l  --> Starting index,
        h  --> Ending index */
    void Quicksort(int a[], int l, int h)
    {
        if (l < h)
        {
            int pi = partition(a, l, h);

            Quicksort(a, l, pi-1);
            Quicksort(a, pi+1, h);
        }
    }
}