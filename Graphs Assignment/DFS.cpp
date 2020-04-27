#include<iostream>
using namespace std;
void DFS(int);
int G[10][10],visited[10],n;    //n is no of vertices and graph is sorted in array G[10][10]

int main()
{
    int i,j;
    cout<<"Enter number of vertices:";

	cin>>n;

    //read the adjecency matrix
	cout<<"\nEnter adjecency matrix of the graph:";

	for(i=0;i<n;i++)
       for(j=0;j<n;j++)
		cin>>G[i][j];

    //visited is initialized to zero
   for(i=0;i<n;i++)
        visited[i]=0;

    DFS(0);
    return 0;
}

void DFS(int i)
{
    int j;
cout<<"\n"<<i;
    visited[i]=1;

	for(j=0;j<n;j++)
       if(!visited[j]&&G[i][j]==1)
            DFS(j);
}
