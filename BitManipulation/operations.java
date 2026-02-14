package BitManipulation;

import Arrays.General.returnIndex;

public class operations {
    public static int getIthBit(int num, int i) {
        if ((num & (1 << i)) == 0) {
            return 0;
        } else {
            return 1;
        }
        // Or this
        // return (num & (1 << i));
    }

    public static int SetIthBit(int num, int i) {
        int bitmask = (1 << i);

        return (num | bitmask);
    }

    public static int ClearIthBit(int num, int i) {
        int bitmask = ~(1 << i);
        return (num & bitmask);
    }

    public static int UpdateIthBit(int num, int i, int newBit) {
        // if (newBit == 0) {
        //     return ClearIthBit(num, i);
        // } else {
        //     return SetIthBit(num, i);
        // }

        // approach no 2
        // 1. always clear ith bit 
        num = ClearIthBit(num, i);
        int bitmask = newBit << i;
        return num | bitmask;
    }
    public static int setLastIBits(int i, int num){
        int bitmask = (~0)<<i;
        return num & bitmask;
    }
    public static int clearBitsinRange(int num, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) -1;
        int bitmask = a|b;
        return num & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(15, 2));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateIthBit(10,2, 1));
        System.out.println(setLastIBits(2,15));
        System.out.println(clearBitsinRange(2515,2, 7));
    }

}
