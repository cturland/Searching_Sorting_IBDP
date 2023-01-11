public class Main {
    public static void main(String[] args) {
        int[] cards = new int[10000];
        for (int i = 0; i < 10000; i++) {
            cards[i] = i;
        }
        int bsTotal = 0;
        int lsTotal = 0;
        for(int i = 0; i < 1000; i++){
            int find = (int)(Math.random() * 10000);
            bsTotal += BinarySearch(cards, find);
            lsTotal += LinearSearch(cards, find);
        }

        System.out.println("Binary search total = " + bsTotal);
        System.out.println("Linear search total = " + lsTotal);
    }

    public static int BinarySearch(int[] nums, int find){
        int start = 0;
        int end = nums.length - 1;
        int count = 0;

        while(end >= start){
            int middle = (start + end) / 2;
            count++;
            if (nums[middle] == find){
                return count;
            }
            else if(nums[middle] > find){
                end = middle - 1;
            }
            else if(nums[middle] < find){
                start = middle + 1;
            }
        }
        return -1;
    }

    public static int LinearSearch(int[] nums, int find){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count += 1;
            if(nums[i] == find){
                return count;
            }
        }
        return -1;
    }
}