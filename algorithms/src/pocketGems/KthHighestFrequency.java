import java.util.*;

public class KthHighestFrequency {
    public static void main(String[] args) {
        KthHighestFrequency kthHighestFrequency = new KthHighestFrequency();
        int[] nums = {2,3,2,2,1,1};

        int k = 3;
        kthHighestFrequency.createObj(nums, k);
    }

    private void createObj(int[] nums,int k) {
        PriorityQueue<DummyInt> queue = new PriorityQueue<DummyInt>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Integer value : map.keySet()) {
            DummyInt dummyInt =  new DummyInt(value,map.get(value));
            queue.add(dummyInt);

        }
        int count =1;
        while(count != k){
            queue.poll();
            count++;
        }

        System.out.println("Kth hightest frquency" +((DummyInt)queue.peek()).getNum());

    }
    public class DummyInt implements Comparable<DummyInt>{
        private Integer count;
        private Integer num;

        public Integer getNum() {
            return this.num;
        }

        public DummyInt(Integer num, Integer count){
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(DummyInt d1) {
            return d1.count.compareTo(this.count);
        }
    }
}
