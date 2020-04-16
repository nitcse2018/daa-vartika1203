/* Suppose that, overnight your office was totally thrashed by some thieves or such and all your numerous file cabinets of folders and contents strewn every where. Every file has an assigned number . It is now 9 a.m. the auditors are due at 11 a.m. for a crucial inspection. You must have all these file back in stack by 11.You run down the hall and get every one you can find to come and sort big similar size file into order so that you can MERGE the files back into how they were when you turned of the lights last night. */
#include <iostream>
using namespace std;

//MERGE SORT
void mergefiles(int *,int, int , int );
void sort_files(int *arr, int low, int high)
{
    int mid;
if (low < high){
        mid=(low+high)/2;
        sort_files(arr,low,mid);
        sort_files(arr,mid+1,high);
        mergefiles(arr,low,high,mid);
    }
}
void mergefiles(int *arr, int low, int high, int mid)
{
    int i, j, k, c[50];
    i = low;
    k = low;
    j = mid + 1;
    while (i <= mid && j <= high) {
        if (arr[i] < arr[j]) {
            c[k] = arr[i];
            k++;
            i++;
        }
   else  {
            c[k] = arr[j];
            k++;
            j++;
        }
}
    while (i <= mid) {
        c[k] = arr[i];
        k++;
        i++;
    }
    while (j <= high) {
        c[k] = arr[j];
        k++;
        j++;
    }
    for (i = low; i < high; i++)  {
        arr[i] = c[i];
    }
}



    int main()
{
    int i,files[1000];
   int n=5;
    for(i=0;i<n;i++)
    files[i]=rand()%100;
    cout<<"\n The unordered files are \n";
    for(int i=0;i<n;i++)
    {
        cout <<files[i]<<"\t";
    }
    sort_files(files, 0, n-1);
    cout<<"\nSorted files are \n";
    for (i = 0; i < n; i++)
{
 cout<<files[i]<<"\t";
    }
   return 0;
}
