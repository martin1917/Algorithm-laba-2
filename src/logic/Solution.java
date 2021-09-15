package logic;

import java.util.List;

public class Solution {

    public int nonOptimalBinarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size() - 1;

        int index = -1;
        while(left <= right){
            index = (left + right) / 2;

            if(list.get(index) == target){
                return index;
            } else if(target < list.get(index)){
                right = index - 1;
            } else if(target > list.get(index)){
                left = index + 1;
            }
        }

        return -1;
    }

    public int optimalBinarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size() - 1;

        int index = -1;
        while(left < right) {
            index = (left + right) / 2;

            if(target <= list.get(index)) {
                right = index;
            } else if(target > list.get(index)) {
                left = index + 1;
            }
        }

        return list.get(right) == target ? right : -1;
    }

    public int liniarSearchInSortedlistay(List<Integer> list, int target){
        list.add(target + 1);

        for(int i = 0; list.get(i) <= target; i++){
            if(list.get(i) == target){
                list.remove(list.size() - 1);
                return i;
            }
        }

        list.remove(list.size() - 1);
        return -1;
    }    
}
