package org.yu.user.service;

/**
 * @author 4466184
 * @date 2022/11/18 15:36
 */

public interface IUserService {
    public static void main(String[] args) {
        String a = "abccabc";
        char[] _a = a.toCharArray();

        int[] next = new int[_a.length];

        next[0] = -1;

        int k = -1,j = 0;
        while(j<_a.length-1){
            if(k==-1||_a[j]==_a[k]){
                next[++j] = ++k;
            }else{
                k = next[k];
            }
        }

        for (int i = 0; i < next.length; i++) {
            System.out.printf("%d\t",next[i]);
        }
    }
//     a b c b a c a b c c a b b a b c c a b c
//    "a b c c a b c"
//    -1 0 0 0 0 1 2

    String getOne(int a);
    int disLockTest();

}
