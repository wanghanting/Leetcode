public class CountJewels {
    public int count(String J, String S) {
        byte[] bytesJ = J.getBytes ();
        byte[] bytesS = S.getBytes ();
        int count = 0;
        for (int j = 0; j < bytesJ.length; j++){
            for (int s = 0; s < bytesS.length; s++){
                if (bytesJ[j]==bytesS[s]){
                    count += 1;
                }
            }
        }
        return count;
    }
}
