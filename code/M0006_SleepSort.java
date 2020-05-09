/**
 * @Date        : 2020-05-10 07:47:46
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-10 07:51:08
 * @FilePath    : \algorithm\code\M0006_SleepSort.java
 * @Describe    : 
 */
package code;

public class M0006_SleepSort{
    public static void main(String[] args) {  
        int[] ints = {1,4,7,3,8,9,2,6,5};  
        SortThread[] sortThreads = new SortThread[ints.length];  
        for (int i = 0; i < sortThreads.length; i++) {  
            sortThreads[i] = new SortThread(ints[i]);  
        }  
        for (int i = 0; i < sortThreads.length; i++) {  
            sortThreads[i].start();  
        }  
    }  
}  
class SortThread extends Thread{  
    int ms = 0;  
    public SortThread(int ms){  
        this.ms = ms;  
    }  
    public void run(){  
        try {  
            sleep(ms*10+10);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println(ms);  
    }  
}