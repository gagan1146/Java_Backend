package org.example.Java8.Streams.StreamImportance.WithoutStreamUsage;

public class Main {
    static void main(String[] args) {
        int []arr = {1,6,342,53,23,2,453,24,43,543,235,66};
        int sumi = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumi+=arr[i];
            }
        }
        System.out.println(sumi);
    }
}
