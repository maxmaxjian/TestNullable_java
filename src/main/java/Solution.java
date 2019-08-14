import javax.annotation.Nullable;

public class Solution {

    public void func(@Nullable String string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        Solution soln = new Solution();
        soln.func();
    }
}
