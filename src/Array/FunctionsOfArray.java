package Array;

public class FunctionsOfArray {

    public int get(int index, int a[]) {
        if (index < a.length && index > 0)
            return a[index];
        else {
            return -1;
        }
    }

    public int[] set(int index, int a[], int data) {
        a[index] = data;
        return a;
    }

    public int MaximumElementInArray(int a[]) {

        int max = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int MinimumElementInArray(int a[]) {

        int min = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public int sumOfElementsRecursively(int a[], int n) {
        int sum = 0;
        if (n >=0) {
            return sumOfElementsRecursively(a, n - 1) + a[n];

        }
        return sum;
    }

    public int AverageOfElementsRecursively(int a[], int n) {
        int sum = 0;
        if (n >= 0) {
            sum=AverageOfElementsRecursively(a, n - 1) + a[n];

        }
        return sum/2;
    }

    public void display(int a[]){
        for(int i=0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }



    public static void main(String args[]) {

        int a[]={1,2,3,4,5};

        FunctionsOfArray fu = new FunctionsOfArray();
        System.out.println(fu.get(2,a));
        fu.display(fu.set(3,a,22));
        System.out.println(fu.MinimumElementInArray(a));
        System.out.println(fu.MaximumElementInArray(a));
        System.out.println(fu.sumOfElementsRecursively(a,a.length-1));
        System.out.println(fu.AverageOfElementsRecursively(a,a.length-1));


    }
}
