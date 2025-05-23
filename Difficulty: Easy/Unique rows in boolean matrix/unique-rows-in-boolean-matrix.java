/*Complete the given function*/
class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        // add code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        for(int i = 0; i < a.length; i++) {
            
                StringBuilder sb  = new StringBuilder();
                ArrayList<Integer> inner = new ArrayList<>();
                
            for(int j = 0; j < a[i].length; j++) {
                
                inner.add(a[i][j]);
                sb.append(a[i][j]);
                
            }
                String s = sb.toString();
                if(!set.contains(s)){
                    ans.add(inner);
                    set.add(s);
                }
        }
        return ans;
    }
}