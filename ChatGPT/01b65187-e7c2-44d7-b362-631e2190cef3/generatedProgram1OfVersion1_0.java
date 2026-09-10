
public class MajorityElement {

    public static int getMajorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int majorityElement = 0;

        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }

            if(map.get(num) > nums.length / 2) {
                majorityElement = num;
                break;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 2, 4, 2, 2};

        int majorityElement = getMajorityElement(nums);

        if(majorityElement != 0) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("No majority element found");
        }
    }
}