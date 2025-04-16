class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //check weather the string is empty and if empty then return a empty arraylist
        if(strs.length == 0){
            return new ArrayList();
        }
        //initializing a new hashmap with attributes for key and value is string and list
        Map<String, List> map = new HashMap<>();
        //initializing a integer array to store the key value
        int[] count = new int[26];
        //iterate the strigs pairs
        for(String s: strs){
            //making all elements in array as 0 which is 26 times 0 was filled
            Arrays.fill(count, 0);
            //iterating every individual strings in the pair but we cant just give s we need to convert s to char array to iterate individial characters
            for(char c: s.toCharArray()){
                count[c - 'a']++;
            }
            //now we should declare a string builder to store the value retrived inside the char array
            StringBuilder sb = new StringBuilder("");
            //now we should append the count value in the string builder
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            //now initialising the key
            String key = sb.toString();
            //if there is no entry we can add the value in the hashmap and add the value as given key
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            //after adding the new entry we add the value to the respected key
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}