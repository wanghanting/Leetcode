public class Pallindrom {
    public boolean isPalindrome(int x) {
//        String string = String.valueOf (x);
//        int length = string.length ();
//        int pre = 0;
//        int back = length - 1;
//        int[] array = new int[string.length ()];
//        for(pre = 0; pre < back; pre++){
//            if(string[pre] == array[back]){
//                back--;
//            }
//            else{
//            return false;
//            }
//        }
//        return true;x
        return String.valueOf(x).equals(new StringBuffer(x+"").reverse().toString());
    }
}
