class bubble
{
    int[] s(int a[])
    {
        int t=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
        }
 	return a;    
    }
    boolean se(int arr[],int y)
    {
        int min=0,max=n-1;mid=0;
        while(min<=max)
        {
            mid=(max+min)/2;
            if(y>arr[mid])
                min=mid+1;1
            else if (y<arr[mid])
                max=mid-1;
            else
                break;
	}
	if(min<=max)
	    return true;
	else
	    return false;

    }
}
