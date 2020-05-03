/**
 * @Date : 2020-05-02 23:17:38
 * @LastEditors: anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-05-03 07:51:10
 * @FilePath : \algorithm\code\L0001_TwoSum.java
 * @Describe :
 */
class L0001_TwoSum {
    public:
        vector<int> L0001_TwoSum(vector<int>& nums, int target) {
            unordered_map<int,int> record;
            for(int i = 0 ; i < nums.size() ; i ++){
           
                int complement = target - nums[i];
                if(record.find(complement) != record.end()){
                    int res[] = {i, record[complement]};
                    return vector<int>(res, res + 2);
                }
                record[nums[i]] = i;
            }
        }
}